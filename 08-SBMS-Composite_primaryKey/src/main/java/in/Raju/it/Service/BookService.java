package in.Raju.it.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Raju.it.entity.Book;
import in.Raju.it.entity.BookPk;
import in.Raju.it.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	public BookRepository bookRepo;

	public void SaveBook() {
		BookPk bpk = new BookPk(100, "Spring");
		Book entity = new Book(101010.0, "Kristhu", bpk);
		bookRepo.save(entity);
	}
	public void getBooks() {
		BookPk p= new BookPk(100, "java");
		Optional< Book> li= bookRepo.findById(p);

		if(li.isPresent()) {
			System.out.println("Book is Avilable Get all Book Deatils ");
		}else {
			System.out.println("Book not Found");
		}
	}

}
