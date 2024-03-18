package in.Rajuit.Service;

import in.Rajuit.dao.UserDao;

public class UserService {
	
	private UserDao userDao;
	
	private UserPassword userPassword;
	
	private UserEmail userEmail;
	
	public void userResgitaion(String name,String passd, String email) {
		String encri= userPassword.pswdEncriptyed(passd);
		
		 boolean isSaved = userDao.SaveUser(name, email, passd);
		 
		
	}
	

}
