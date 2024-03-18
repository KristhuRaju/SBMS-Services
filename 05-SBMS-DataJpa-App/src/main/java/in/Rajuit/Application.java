package in.Rajuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Rajuit.entity.Book;
import in.Rajuit.entity.repository.BookRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext contect= SpringApplication.run(Application.class, args);
		BookRepository OOK= contect.getBean(BookRepository.class);
		 
		 Book book=new Book();
		 book.setId(101);
		 book.setBookauthorname("Raju");
		 book.setBookprice(101.2);
		 System.out.println(OOK);
		
	}

}
