package com.aluracursos.desafio3frases.repository;

import com.aluracursos.desafio3frases.dto.FraseDTO;
import com.aluracursos.desafio3frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    public Frase obtenerFraseAleatoria();
}
