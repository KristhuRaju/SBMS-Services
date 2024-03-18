package in.Rajuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Rajuit.entity.ContactEntity;
import in.Rajuit.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		ContactRepository bean= context.getBean(ContactRepository.class);
		ContactEntity ce= new ContactEntity();
		ce.setCid(100);
		ce.setCname("peter");
		ce.setCmail("peter@gmail.com");
		ce.setCnumber(8142513402d);
		bean.save(ce);
		
	}

}
