package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t01.n01.S04T01N01MartinezMCarmen.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN")String name) {
        return String.format("Hello %s!, estàs executant un projecte Maven", name);
    }

    @GetMapping({"/helloWorld2","/helloWorld2/{name}"})
    public String saluda2(@PathVariable()Optional<String>name) {
        String nameOpcional = name.orElse("UNKNOWN");
        return String.format("Hello %s!, estàs executant un projecte Maven", nameOpcional);
    }

}
