package in.Raju.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Raju.it.entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
