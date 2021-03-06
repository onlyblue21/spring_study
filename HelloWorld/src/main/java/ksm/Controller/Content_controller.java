package ksm.Controller;

import javax.annotation.Resource;

import ksm.service.Pro_Service;
import ksm.vo.User_Board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Content_controller {

	@Resource(name = "Pro_Service")
	private Pro_Service Pro_Service;

	@RequestMapping(value = "/c_update", method = RequestMethod.POST)
	public String c_update(Model model,User_Board user_board) throws Exception {
		
		Pro_Service.contentupdate(user_board);
		model.addAttribute("result","업데이트 성공");

		return "redirect:/List_n";
	}
	@RequestMapping(value = "/c_delete", method = RequestMethod.POST)
	public String c_delete(Model model,User_Board user_board) throws Exception {
		System.out.println("seq_value_delete = " + user_board.getSeq());
		Pro_Service.contentdelete(user_board);
		model.addAttribute("result","삭제 성공");
		return "redirect:/List_n";
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
