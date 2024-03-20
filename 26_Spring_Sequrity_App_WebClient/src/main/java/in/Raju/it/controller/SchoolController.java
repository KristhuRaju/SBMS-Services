package in.Raju.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Raju.it.model.School;
import in.Raju.it.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/school")
	public ResponseEntity<School> saveSchool(@RequestBody School school1){
		School s1= schoolService.saveSchool(school1);
		return new ResponseEntity<>(s1,HttpStatus.CREATED);
	}
	
	@GetMapping("{isd}")
	public ResponseEntity<School> getById(@PathVariable("isd") Integer sid){
	School s2=schoolService.getBySid(sid);
	return new ResponseEntity<>(s2,HttpStatus.OK);
	}
}
