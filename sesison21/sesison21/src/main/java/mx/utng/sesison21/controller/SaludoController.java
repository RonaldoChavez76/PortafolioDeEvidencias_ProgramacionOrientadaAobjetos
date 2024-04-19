package mx.utng.sesison21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.utng.sesison21.model.Saludo;
@RestController
public class SaludoController {
    @GetMapping("/saludo")
     public Saludo saludar(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo de SpringBoot");
        return saludo;

     }
}
