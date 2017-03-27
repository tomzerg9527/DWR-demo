package testdwr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	@RequestMapping("/toFuck.do")
	public String toFuck(){
		System.out.println("?");
		return "dwr";
	}
}
