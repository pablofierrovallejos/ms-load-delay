package com.pablo.dormir.dormir;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.pablo.dormir.dormir.controller.Carga;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@WebMvcTest(Carga.class)
class TestCarga {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testEndpoint() throws Exception {
        mockMvc.perform(get("/carga"))
                .andExpect(status().isOk())
                .andExpect(content().string(""));
    }

    @Test
    void testEndpoint2() throws Exception {
        String sRetardo = "2000";
        mockMvc.perform(get("/carga/" + sRetardo))
                .andExpect(status().isOk())
                .andExpect(content().string("Retardo ejecutado por : 2000 ms"));
    }
}   