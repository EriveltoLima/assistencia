package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.layers.entities.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
