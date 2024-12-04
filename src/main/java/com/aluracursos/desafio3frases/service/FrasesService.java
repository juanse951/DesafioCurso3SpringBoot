package com.aluracursos.desafio3frases.service;

import com.aluracursos.desafio3frases.dto.FraseDTO;
import com.aluracursos.desafio3frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        return repository.obtenerFraseAleatoria();
    }
}
