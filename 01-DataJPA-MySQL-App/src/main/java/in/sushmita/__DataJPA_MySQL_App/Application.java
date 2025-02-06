package in.sushmita.__DataJPA_MySQL_App;

import in.sushmita.__DataJPA_MySQL_App.entity.UserMasterEntity;
import in.sushmita.__DataJPA_MySQL_App.repos.UserMasterRepo;
import in.sushmita.__DataJPA_MySQL_App.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(Application.class, args);

		//getting repo bean object
		UserService userService =context.getBean(UserService.class);
		//userService.saveUser();
		//userService.saveUsers();
		//userService.getUser();
		//userService.getUsers();
		//userService.deleteUser();
		userService.test();




	}

}
