package com.crud.javalanches.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column; //@Column
import jakarta.persistence.Entity; //
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categoria {
    private static long serialVersionUID = 1L; // faz verificação da chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoCategoria;
    @Column(unique = true,nullable = false)
    private String nomeCategoria;

    @OneToMany(mappedBy = "Categoria") // vai haver relacionamento de 1 para muitos.
    private List<Produto> produtos = new ArrayList<>();

    public Categoria() {

    }
    
    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    

    public long getCodigoCategoria() {
        return this.codigoCategoria;
    }

    public void setCodigoCategoria(long codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
        

}
