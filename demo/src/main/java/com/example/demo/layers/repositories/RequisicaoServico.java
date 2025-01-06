package com.example.demo.layers.repositories;

import com.example.demo.layers.entities.Requisicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RequisicaoServico extends JpaRepository<Requisicao, Long> {

}       