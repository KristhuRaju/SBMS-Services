package in.Raju.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Raju.it.entity.Instructor;
import in.Raju.it.repository.InstructorRepository;
@RestController
@RequestMapping("/api/k1")
public class InstructorController {
	 @Autowired
	    private InstructorRepository instructorRepository;
	 
	 @PostMapping("/instructors")
	    public Instructor createUser(@RequestBody Instructor instructor) {
	        return instructorRepository.save(instructor);
	    }
	 
	 @GetMapping("/instructors")
	  public List<Instructor> getAllInstructors(){
		return instructorRepository.findAll();
		 
	 }
}
