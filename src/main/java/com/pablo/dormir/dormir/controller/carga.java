package com.pablo.dormir.dormir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class carga {
    @GetMapping("/carga")
    public void endpoint(){

        System.out.println("Iniciando Carga");

        try {
            Thread.sleep( 5000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Cargado");
    }
}
