package com.crud.javalanches.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;//@column
import jakarta.persistence.Entity; //@entity
import jakarta.persistence.GeneratedValue; //@GeneratedValue
import jakarta.persistence.GenerationType; //@GenerationType
import jakarta.persistence.Id; //@Id
import jakarta.persistence.JoinColumn; //JoinColumn
import jakarta.persistence.JoinTable; //JoinTable
import jakarta.persistence.ManyToMany; //@ManyToMany
import jakarta.persistence.ManyToOne;  //@ManyToOne

@Entity // import jakarta.persistence.Entity
public class Pedido {
    private static long serialVersionUID = 1L; 

    @Id // import jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO) // import jakarta.persistence.GeneratedValue & GenerationType
    private long codigoPedido;

    @Column(nullable = false) // import jakarta.persistence.Column
    private LocalDateTime dataHoraPedido;
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal valorTotalPedido;

    @ManyToMany
    @JoinTable(name = "pedido_produto", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "produtos_id"))
    private List<Produto> produtos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "Cliente_id", nullable = false)
    private Cliente cliente;


    public Pedido() {
    }

    public long getCodigoPedido() {
        return this.codigoPedido;
    }

    public void setCodigoPedido(long codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return this.dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public BigDecimal getValorTotalPedido() {
        return this.valorTotalPedido;
    }

    public void setValorTotalPedido(BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
