package com.crud.javalanches.models;

import java.time.LocalDate;

import jakarta.persistence.Column; //@Collumn
import jakarta.persistence.Entity; // @Entity
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //@Id
// para criar classe, ela sempre deve iniciar com letra maiuscula
@Entity
public class Cliente {
    // atributos
    private static long serialVersionUID = 1L; // faz verificação da chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoCliente;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true, length = 16)
    private String telefone;
    @Column(nullable = false)
    private LocalDate datadeNascimento;


    // constructor
    public Cliente() {
    }
    // getters & setters
    public long getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setCodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDatadeNascimento() {
        return this.datadeNascimento;
    }

    public void setDatadeNascimento(LocalDate datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }
}
