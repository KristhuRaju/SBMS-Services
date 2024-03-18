package in.Raju.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Raju.it.Service.ReportService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(Application.class, args);
		ReportService report= context.getBean(ReportService.class);
		report.generateReport();
	}

}
