package iuh.ontapthuchanh.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class myHome {

	@GetMapping()
	public String myHome() {
		return "my home";
	}
}
