package in.Raju.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Raju.it.entity.Book;
import in.Raju.it.entity.BookPk;

public interface BookRepository extends JpaRepository<Book, BookPk> {

}
