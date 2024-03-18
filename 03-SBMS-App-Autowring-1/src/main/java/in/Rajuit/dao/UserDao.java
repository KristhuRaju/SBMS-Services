package in.Rajuit.dao;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {

	public boolean SaveUser(String name, String mail,String password);
}
