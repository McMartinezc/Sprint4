package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t01.n02.S04T01N02MartinezMCarmen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN")String name) {
        return "Hello " +name+", estàs executant un projecte Gradle";
    }
    @GetMapping({"/helloWorld2","/helloWorld2/{name}"})
    public String saluda2(@PathVariable Optional<String> name){
        String nameOpcional = name.orElse("UNKNOWN");
        return "Hello " +nameOpcional+", estàs executant un projecte Gradle";
        }
    }

    //PathVariable sirve para indicar con qué variable de la url se relaciona el parámetro sobre el que se está usando la anotación

