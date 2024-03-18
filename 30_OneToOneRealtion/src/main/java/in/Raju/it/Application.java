package in.Raju.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.Raju.it.entity.Instructor;
import in.Raju.it.entity.InstructorDetail;
import in.Raju.it.repository.InstructorRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private InstructorRepository instructorRepository;
	@Override
	public void run(String... args) throws Exception {
		
	Instructor instructor= new Instructor("Kristhu Raju", "SBMS", "KristhuRaju@Sbms.com");
	
	InstructorDetail instructorDetail= new InstructorDetail("KristhuRaju","SBMS Course learned From ASHOK IT  ");
	
	instructor.setInstructorDetail(instructorDetail);
	instructorRepository.save(instructor);
	}
	
	
	

}
