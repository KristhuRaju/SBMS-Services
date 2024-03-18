package in.Rajuit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public boolean SaveUser(String name, String mail, String password) {
		System.out.println("User Datails inserted into DB");
		return true;
	}

}
