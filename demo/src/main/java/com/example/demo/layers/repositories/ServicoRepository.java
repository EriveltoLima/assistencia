package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.layers.entities.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {}
