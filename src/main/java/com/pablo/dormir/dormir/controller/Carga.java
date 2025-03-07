package com.pablo.dormir.dormir.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Carga {

    private static final Logger logger = LoggerFactory.getLogger(Carga.class);

    @GetMapping("/carga")
    public void endpoint(){
        logger.info("Iniciando Carga");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        logger.info("Cargado");
    }

    @GetMapping("/carga/{sRetardo}")
    public String endpoint2(@PathVariable("sRetardo") String sRetardo){
        int iretardo = Integer.parseInt(sRetardo);
        logger.info("Iniciando Carga");
        try {
            Thread.sleep(iretardo);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        logger.info("Cargado");
        return "Retardo ejecutado por : " + iretardo + " ms";
    }
}
