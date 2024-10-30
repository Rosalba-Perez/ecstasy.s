package com.ecstasy.s;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class controlador {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/colecciones")
    public String colecciones(){
        return "colecciones";
    }

    @GetMapping("/guiatallas")
    public String guiatallas(){
        return "guiatallas";
    }

    @GetMapping("/nosotros")
    public String nosotros(){
        return "nosotros";
    }

    @GetMapping("/contactanos")
    public String contacto(){
        return "contacto";
    }

}