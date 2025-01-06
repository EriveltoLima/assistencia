package com.example.demo.layers.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Situacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "situacao", nullable = false)
    private String situacao;

    @Column(name = "alteracao")
    private LocalDate alteracao;

    @OneToOne(mappedBy = "situacao")
    private Requisicao requisicao;

    void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public LocalDate getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(LocalDate alteracao) {
        this.alteracao = alteracao;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }
}
