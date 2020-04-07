package com.uca.capas.demo.controller;


import com.uca.capas.demo.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

@GetMapping("/login")
public String logear(Usuario usuario){
return"login";
}

@PostMapping("/validacion")
    public String validar(Usuario usuario){
    if(usuario.getUser().contentEquals("root") && usuario.getPass().contentEquals("12345")){
        return "MostrarMensajeCorrecto";
    }
    else {
        return "MostrarMensajeIncorrecto";
    }
}

}
