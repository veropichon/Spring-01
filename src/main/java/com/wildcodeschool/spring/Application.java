package com.wildcodeschool.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping ("/doctor/1")
	@ResponseBody
	//@RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
	public String Doctor1() {

		return "William Hartnell";
	}

	@RequestMapping ("/doctor/9")
	@ResponseBody
	public String Doctor9() {

		return "Christopher Eccleston";
	}

	@RequestMapping("/doctor/11")
	@ResponseBody
	public String doctor11() {

		return "Matt Smith";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13() {

		return "Jodie Whittaker";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {

		return "<ul>" +
					"<li><a href=\"http://localhost:8080/doctor/1\">doctor1</a></li>" +
					"<li><a href=\"http://localhost:8080/doctor/9\">doctor9</a></li>" +
					"<li><a href=\"http://localhost:8080/doctor/11\">doctor11</a></li>" +
					"<li><a href=\"http://localhost:8080/doctor/13\">doctor13</a></li>" +
				"</ul>";
	}


}


