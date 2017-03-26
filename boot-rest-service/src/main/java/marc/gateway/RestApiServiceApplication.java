package marc.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class RestApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiServiceApplication.class, args);
	}
	
    @RequestMapping(value = "/hello")
    public String available(HttpServletRequest request) {
        return "Hello, test";
    }	
}
