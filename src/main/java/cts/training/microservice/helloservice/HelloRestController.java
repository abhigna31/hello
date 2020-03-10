package cts.training.microservice.helloservice;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloRestController {
	
	@GetMapping(value="/hello")
	public String display() {
		return "hello tanu";

}
}
