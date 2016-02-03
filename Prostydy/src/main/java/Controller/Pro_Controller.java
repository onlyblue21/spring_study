package Controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.Pro_DAO;

/**
 * Handles requests for the application home page.
 */


@Controller
public class Pro_Controller {
	
//	private static final Logger logger = LoggerFactory.getLogger(Pro_Controller.class);
	
	@Resource(name = "pro_DAO")
	private Pro_DAO pro_DAO;
	
	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public String home(Model model) {
////		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//		
//		String formattedDate = dateFormat.format(date);
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "login";
//	}
	
	//---------------------원석--------------------
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Map<String, String>> testList = pro_DAO.testList();
		
		for(Map<String, String> iMap : testList) {
			System.out.println(iMap.get("id"));
		}
		
		return "/home";
	}
	//---------------------원석--------------------
	
}
