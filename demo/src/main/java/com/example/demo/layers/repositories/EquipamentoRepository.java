package com.example.demo.layers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.layers.entities.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {}
