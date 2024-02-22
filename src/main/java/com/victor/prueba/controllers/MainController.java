package com.victor.prueba.controllers;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@RestController
public class MainController {

    @GetMapping("/calculadora/{id}")
    public HashMap<String,Integer> home(@PathVariable(value="id") int id) {
        //String [] saludo = {"Hello, Spring Boot!","Tomás alioli","Yesus"};
        HashMap<String,Integer> valores = new HashMap<>();
        valores.put("doble",id*2);
        valores.put("cuadrado",id*id);
        valores.put("mitad",id/2);
        return valores;
    }

    @GetMapping("/prueba")
    public int[] home() {
        int[] valores = {1,2,3,4,5};
        return valores;
    }


}