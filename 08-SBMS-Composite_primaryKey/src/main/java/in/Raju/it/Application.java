package in.Raju.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Raju.it.Service.BookService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
	BookService ser=	context.getBean(BookService.class);
	//ser.SaveBook();
	ser.getBooks();
	}

}
