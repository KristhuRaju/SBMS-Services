package in.Raju.it.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.Raju.it.entity.Book;

@RepositoryRestResource(path="books")
public interface BookRepository extends JpaRepository<Book, Integer> {

	public List<Book> findByName(@Param("name") String name);
}
