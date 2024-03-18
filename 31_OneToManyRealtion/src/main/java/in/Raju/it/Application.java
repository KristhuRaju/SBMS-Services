package in.Raju.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.Raju.it.entity.Comment;
import in.Raju.it.entity.Post;
import in.Raju.it.repository.PostRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		Post post= new Post("SBMS New Batch Started ", "05th Feb,Trainer:Mr.Ashok(11+ yrs. Exp)");
		Comment comment1= new Comment("Very Usefull for not only Java Dev but also Devops dev also.");
		Comment comment2= new Comment("nice Examples");
		Comment comment3= new Comment("Greast post ,Good Coding");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepository.save(post);
				}

}
