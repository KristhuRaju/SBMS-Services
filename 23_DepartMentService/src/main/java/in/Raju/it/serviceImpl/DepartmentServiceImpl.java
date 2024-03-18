package in.Raju.it.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Raju.it.Entity.Department;
import in.Raju.it.repository.DepartmentRepository;
import in.Raju.it.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department getById(long did) {
		
		return departmentRepository.findById(did).get();
	}



}
