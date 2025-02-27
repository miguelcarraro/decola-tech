package tech.decola.spring_security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class WelcomeController {

    @GetMapping("/")
    public String welcome(){
        return "Bem vindo ao meu API de Spring Boot Web";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('manager','users')")
    public String users(){
        return "Usuario Autorizado.";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('managers')")
    public String managers(){
        return "Gestor autorizado.";
    }
}

