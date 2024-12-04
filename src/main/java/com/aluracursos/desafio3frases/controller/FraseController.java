package com.aluracursos.desafio3frases.controller;

import com.aluracursos.desafio3frases.dto.FraseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){

    }
}