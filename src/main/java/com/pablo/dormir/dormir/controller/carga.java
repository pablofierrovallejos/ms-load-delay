package com.pablo.dormir.dormir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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



    @GetMapping("/carga/{sRetardo}")
    public String endpoint2(@PathVariable("sRetardo") String sRetardo){

        int iretardo = Integer.parseInt(sRetardo);
        System.out.println("Iniciando Carga");
        try {
            Thread.sleep( iretardo);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Cargado");
        return "Retardo ejecutado por : " + iretardo + " ms";
    }
}
