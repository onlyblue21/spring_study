package onlyblue21.Controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import onlyblue21.service.Pro_Service;
import onlyblue21.vo.UserVo;
import onlyblue21.vo.User_Board;

import org.apache.taglibs.standard.tag.common.core.RedirectSupport;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import org.springframework.web.servlet.view.RedirectView;

@org.springframework.stereotype.Controller
@SessionAttributes("command")
public class Controller {
	
//	private static final Logger logger = Logger.getLogger(Controller.class);
	
	@Resource(name = "Pro_Service")
	private Pro_Service Pro_Service;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Model model){
		
		return "/Login";
	}

	@RequestMapping(value = "/create_db_user", method = RequestMethod.POST)
	public String create_db_user(Model model,UserVo uservo,User_Board user_board) throws Exception{ 
		
			Pro_Service.create_db_user();
			model.addAttribute("create_db_user", "user_db가 생성되었습니다.");
		
		return "/Login";
	}
	
	@RequestMapping(value = "/create_db_board",method = RequestMethod.POST)
	public String create_db_board(Model model, UserVo uservo,User_Board user_board)throws Exception{
			
			Pro_Service.create_db_board();
			model.addAttribute("create_db_board", "boadr_db가 생성되었습니다.");
		
		return "/Login";
	}
	
	@RequestMapping(value = "/List" , method=RequestMethod.POST)
	public String login2(Model model,UserVo uservo,User_Board user_board) throws Exception{
			
			boolean Login = false;
			Login = Pro_Service.Login(uservo);
		if(Login){
			List<User_Board> User_List = Pro_Service.UserBoard(user_board);
			model.addAttribute("List",User_List);
			model.addAttribute("count",User_List.size());
			return "/List";
		}
		else{
			model.addAttribute("Login_id","ID가 없습니다.");
			
			return "/Login";
		}
	}
	@RequestMapping(value = "/List_n")
	public String List_n(Model model,UserVo uservo,User_Board user_board,
							final RedirectAttributes redirectAttributes) throws Exception{
			
			List<User_Board> User_List = null;
			User_List = Pro_Service.UserBoard(user_board);
			model.addAttribute("List",User_List);
			model.addAttribute("count",User_List.size());
			
			return "/List";
	}
	@RequestMapping(value="/addContent")
	public String addContent(Locale locale, Model model, User_Board user_board, final RedirectAttributes redirectAttributes) throws Exception{
		
		if(user_board.getProcess().equals("add")){
			
			return "/AddContent";
		}

		if(user_board.getProcess().equals("sqladd")){
//			String Mresult = null;
//			Date date = new Date();
//			String ServerTime = null;
//			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//			ServerTime = dateFormat.format(date);
//			model.addAttribute("serverTime", ServerTime );
			
			Pro_Service.AddContent(user_board);
			
//			Mresult = result > 0? "Test_true=" : "Test_false=";
			//post방식으로 parameter붙혀줄수있다.
//			redirectAttributes.addFlashAttribute("Mresult", Mresult);
			
			return "redirect:/List_n";
		}
		
		return "/List";
	}
	
	@RequestMapping(value="/contentdelete")
	public String contentdelete(Model model, User_Board user_board) throws Exception{
		
		int seq = user_board.getSeq();
		int result;
		Pro_Service.contentdelete(user_board);		
//		model.addAttribute("result",result);
		
		return "redirect:/List_n";
	}
	
	@RequestMapping(value="/contentupdate")
	public String contentupdate (Model model, User_Board user_board) throws Exception{
		
		int seq = user_board.getSeq();
		String content = user_board.getContent();
		Pro_Service.contentupdate(user_board);
		
		return "redirect:/List_n";
	}
	
	
	@RequestMapping(value="/Join")
	public String Join(Model model,UserVo uservo) throws Exception{
			
		if(!uservo.getId().equals(null) || !uservo.getId().equals("")){
			int check_id = Pro_Service.Check_id(uservo);
			System.out.println("check_id= " + check_id);
			
			if(check_id < 1){
				Pro_Service.Join(uservo);
				model.addAttribute("result","회원 가입 성공");
			}
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
