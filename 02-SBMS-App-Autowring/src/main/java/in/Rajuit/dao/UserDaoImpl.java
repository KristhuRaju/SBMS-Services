package in.Rajuit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{

	@Override
	public String findNameById(Integer id) {
		if(id<100) {
			System.out.println("Raju");
		}else {
			System.out.println("Java");
		}
		return null;
	}

}
