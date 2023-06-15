package in.eshwarnaz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/")
	public String getMsg() {
		return "Welocme to my cricket world";
	}

}
