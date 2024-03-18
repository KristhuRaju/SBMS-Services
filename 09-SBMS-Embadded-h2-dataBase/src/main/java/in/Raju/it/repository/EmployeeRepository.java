package in.Raju.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Raju.it.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
