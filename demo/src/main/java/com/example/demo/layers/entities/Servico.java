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
    private Integer id;

    @Column(name = "valor", nullable = false)
    private Integer valor;

    @Column(name = "servico", nullable = false)
    private String servico;

    @OneToMany(mappedBy = "servico")
    private List<RequisicaoServico> requisicoes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
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
