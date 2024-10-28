package com.ecstasy.s;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class controlador {

    @GetMapping("/colecciones")
    public String colecciones(){
        return "colecciones";
    }

    @GetMapping("/contactanos")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/guia_de_tallas")
    public String guiatallas() {
        return "guiatallas";
    }
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }

}
