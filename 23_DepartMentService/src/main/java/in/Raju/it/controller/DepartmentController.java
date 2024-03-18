package in.Raju.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.Raju.it.Entity.Department;
import in.Raju.it.service.DepartmentService;
@RequestMapping("api/departments")
@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/department")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department depart){
		Department Saveddeparts= departmentService.saveDepartment(depart);
		return new ResponseEntity<>(Saveddeparts,HttpStatus.CREATED);
	}
	@GetMapping("/departments")
	public ResponseEntity<Department> getAllDeparts(){
	List<Department> Alld=departmentService.getAllDepartments();
	return new ResponseEntity(Alld,HttpStatus.OK);
	}
	@GetMapping("/departments/id")
	public ResponseEntity<Department> getByIddepart(@PathVariable("id") long did){
		Department deletedids= departmentService.getById(did);
		return  ResponseEntity.ok(deletedids);
	}
}
