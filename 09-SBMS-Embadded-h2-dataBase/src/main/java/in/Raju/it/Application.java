package in.Raju.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Raju.it.entity.Employee;
import in.Raju.it.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		EmployeeRepository bean=  context.getBean(EmployeeRepository.class);
	
		Employee emp= new Employee();
		emp.setEmpName("Raju");
		emp.setEmpSalary(22390.0);
		
		bean.save(emp);
		
		Employee emp2= new Employee();
		emp2.setEmpName("Nayeem");
		emp2.setEmpSalary(23390.0);
		bean.save(emp2);
	
	}

}
