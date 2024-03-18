package in.Rajuit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.Rajuit.dao.UserDao;
@Component
public class UserService {

	@Autowired
	private UserDao dao;// field injection (reflection)

	public void getUsername(Integer id) {
		String name = dao.findNameById(id);
		System.out.println(name);
	}

//	public void setDao(UserDao dao) {
//		this.dao = dao;
//		System.out.println("Setter ");
//	}


	

}
