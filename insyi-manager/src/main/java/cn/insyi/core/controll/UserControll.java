package cn.insyi.core.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.insyi.core.pojo.User;
import cn.insyi.core.service.UserService;

@Controller
public class UserControll {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(String username,String password){
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		User userlogin = userService.login(user);
		
		if(userlogin != null){
			return "index";
		}else{
			return "login";
		}
	}
	
	@RequestMapping()
	public String getLogin(){
		return "login";
	}
}
