package com.aluracursos.desafio3frases.service;

import com.aluracursos.desafio3frases.dto.FraseDTO;
import com.aluracursos.desafio3frases.model.Frase;
import com.aluracursos.desafio3frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase =  repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }
}
