package cn.insyi.core.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestMepper {
	
	@RequestMapping("/test")
	public String testname(){
		return "index";
	}
	
}
