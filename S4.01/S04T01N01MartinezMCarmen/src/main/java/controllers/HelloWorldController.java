package controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public String saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
	return String.format("Hello %s!, estàs executant un projecte Maven", name);
	}
	
	@GetMapping("/helloWorld2")
	public String saluda2(@PathVariable() Optional <String> name) {
		String nameOpcional = name.orElse("UNKNOWN");
	return String.format("Hello %s!, estàs executant un projecte Maven", nameOpcional);
	}

}
