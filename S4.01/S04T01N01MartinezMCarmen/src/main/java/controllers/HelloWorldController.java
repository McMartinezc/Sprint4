package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t01.n01.S04T01N01MartinezMCarmen.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController //Servicio REST
public class HelloWorldController {

    @GetMapping("/helloWorld") //Obtener datos
    public String saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN")String name) { 
        return "Hello " +name+", estàs executant un projecte Maven";
    }

    @GetMapping({"/helloWorld2","/helloWorld2/{name}"})
    public String saluda2(@PathVariable()Optional<String>name) {
        String nameOpcional = name.orElse("UNKNOWN");
        return "Hello " +nameOpcional+", estàs executant un projecte Maven";
    }

}
