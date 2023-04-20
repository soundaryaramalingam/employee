
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.backend.controller")
public class EmployeeSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootApplication.class, args);
		System.out.println("Server Started");
	}

}
