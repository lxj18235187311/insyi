package cn.insyi.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.insyi.core.dao.UserDao;
import cn.insyi.core.pojo.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	
	public User login(User user){
		User getuser = userdao.login(user);
		if(getuser != null && user != null){
			getuser.getUsername();
			if(getuser.getUsername().equals(user.getUsername()) && getuser.getPassword().equals(user.getPassword())){
				return getuser;
			}
		}
		return null;
	}
}
