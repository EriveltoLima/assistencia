package com.example.demo.layers.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "valor", nullable = false)
    private Long valor;

    @Column(name = "servico", nullable = false)
    private String servico;

    @OneToMany(mappedBy = "servico")
    private List<RequisicaoServico> requisicoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public List<RequisicaoServico> getRequisicoes() {
        return requisicoes;
    }

    public void setRequisicoes(List<RequisicaoServico> requisicoes) {
        this.requisicoes = requisicoes;
    }
}
