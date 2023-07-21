package in.ashokit;


import java.io.File;
import java.util.List;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome To Ashok IT..!!";
	}
	
	private void m1 () {
		String s = null;
		int i = s.length();
	}
	
	// comments
	
	

}
