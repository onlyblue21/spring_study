package onlyblue21.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import onlyblue21.service.Pro_Service;
import onlyblue21.vo.UserVo;
import onlyblue21.vo.User_Board;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@org.springframework.stereotype.Controller
@SessionAttributes("command")
public class Controller {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="Pro_Service")
	private Pro_Service Pro_Service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Model model){
		System.out.println("test");
		return "/Login";
	}

	
	@RequestMapping(value = "/List" , method=RequestMethod.POST)
	public String login2(Model model,UserVo uservo,User_Board user_board) throws Exception{
			
			boolean Login = false;
			Login = Pro_Service.Login(uservo);
			List<User_Board> User_List = null;
		if(Login){
			User_List = Pro_Service.UserBoard(user_board);
			System.out.println("Listvalue = "+User_List);
			
			model.addAttribute("List",User_List);
			model.addAttribute("count",User_List.size());
//			System.out.println("@@@@@@@@@@@@@@@@@@@List��"+User_List);
			return "/List";
		}
		else{
			model.addAttribute("Login","ID_Test");
			
			return "/Login";
		}
	}
	@RequestMapping(value = "/List_n" , method=RequestMethod.GET)
	public String List_n(Model model,UserVo uservo,User_Board user_board,
							final RedirectAttributes redirectAttributes) throws Exception{
			
			List<User_Board> User_List = null;
			User_List = Pro_Service.UserBoard(user_board);
			model.addAttribute("List",User_List);
			model.addAttribute("count",User_List.size());

			return "/List";
	}
	@RequestMapping(value="/addContent")
	public String addContent(Locale locale, Model model, UserVo uservo,User_Board user_board, 
								final RedirectAttributes redirectAttributes) throws Exception{
		
		String process = null;
		process = user_board.getProcess();
		
		if(user_board.getProcess().equals("add")){
			return "/AddContent";
		}

		if(user_board.getProcess().equals("sqladd")){
			String Mresult=null;
			Date date = new Date();
			String ServerTime = null;
			int text=0;
			
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
			
			ServerTime = dateFormat.format(date);
			model.addAttribute("serverTime", ServerTime );
			
			text = Pro_Service.maxseq(user_board);
			System.out.println("@@@@@@@@@@@@@@@maxseq"+text);
			int result = Pro_Service.AddContent(user_board);
			
			
			Mresult = result > 0? "Test_true=" : "Test_false=";
			redirectAttributes.addFlashAttribute("Mresult", Mresult);
			
			return "redirect:/List_n";
		}
		
		return "/List";
	}
	
	@RequestMapping(value="/contentdelete")
	public String contentdelete(Model model, User_Board user_board) throws Exception{
		
		int seq = user_board.getSeq();
		int result;
		result = Pro_Service.contentdelete(user_board);		
		model.addAttribute("result",result);
		
		return "redirect:/List_n";
	}
	
	@RequestMapping(value="/contentupdate")
	public String contentupdate (Model model, User_Board user_board) throws Exception{
		
		int seq = user_board.getSeq();
		String content = user_board.getContent();
		Pro_Service.contentupdate(user_board);
		
		return "redirect:/List_n";
	}
	
	
	//Content
	@RequestMapping(value="/Content", method=RequestMethod.GET)
	public String Content(Model model,User_Board user_board) throws Exception{
		
		HashMap content = null;
		content = Pro_Service.content(user_board);
		model.addAttribute("content",content);
		
		return "/Content";
	}
	
	@RequestMapping(value="/Join")
	public String Join(Model model,UserVo uservo) throws Exception{
		int a;
		String result;
		if(!uservo.getId().equals(null) && !uservo.getId().equals("")){
			
			a = Pro_Service.Join(uservo);
			result = a > 0? "Test_true=" : "Test_false=";
			model.addAttribute("result",result);
			System.out.println(result);
		}
		return "/Login";
	}
	@RequestMapping(value="/goJoin")
	public String goJoin(Model model) throws Exception{
		
		return "/Join";
	}
	@RequestMapping(value="/Logout")
	public String Logout(Model model) throws Exception{
		
		return "/Login";
	}
}
