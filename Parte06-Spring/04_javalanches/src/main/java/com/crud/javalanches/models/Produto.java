package com.crud.javalanches.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // import jakarta.persistence.Entity
public class Produto {
    private static long serialVersionUID = 1L;

    @Id // import jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO) // import jakarta.persistence.GeneratedValue & GenerationType
    private long codigoProduto;

    @Column(unique = true, nullable = false) // import jakarta.persistence.Column
    private String nomeProduto;
    @Column(length = 255)
    private String descricaoProduto;
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal precoProduto; //evolucao do decimal do java. E necessario na hora de fz 1 relacionamento.


    public Produto() {
    }

    public long getCodigoProduto() {
        return this.codigoProduto;
    }

    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }



}
