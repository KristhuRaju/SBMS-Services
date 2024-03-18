package in.Raju.it.service;

import java.util.List;

import in.Raju.it.Entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);
	
	List<Department> getAllDepartments();
	
	Department getById(long did);
	
}
