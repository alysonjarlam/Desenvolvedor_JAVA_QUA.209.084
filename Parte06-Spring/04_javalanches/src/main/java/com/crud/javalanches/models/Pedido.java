package com.crud.javalanches.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

}
