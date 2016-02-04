package onlyblue21.Controller;

import java.security.KeyStore.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import onlyblue21.service.Pro_Service;
import onlyblue21.vo.User_Board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Content_controller {

	@Resource(name = "Pro_Service")
	private Pro_Service Pro_Service;

	@RequestMapping(value = "/c_update", method = RequestMethod.POST)
	public String c_update(Model model) {
		System.out.println("컨텐츠 업데이트 ");

		return "/Login";
	}
	@RequestMapping(value = "/c_delete", method = RequestMethod.POST)
	public String c_delete(Model model,User_Board user_board) throws Exception {
		
		int aa = Pro_Service.contentdelete(user_board);
		System.out.println("삭제결과 = " + aa);
		System.out.println("컨텐츠 삭제 ");

		return "/Login";
	}

	@RequestMapping(value = "/Content", method = RequestMethod.GET)
	public String Content(Model model, User_Board user_board) throws Exception {
//			HashMap<String, String> content = null;
//			content = Pro_Service.content(user_board);
			model.addAttribute("SEQ", user_board.getSeq());
			model.addAttribute("TITLE", user_board.getTitle());
			model.addAttribute("CONTENT",user_board.getContent());

		return "/List_L";
	}

}
