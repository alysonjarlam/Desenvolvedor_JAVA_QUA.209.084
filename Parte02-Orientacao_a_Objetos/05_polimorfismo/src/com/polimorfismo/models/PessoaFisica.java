package com.polimorfismo.models;

final public class PessoaFisica extends Pessoa {
    
    //atributos
    public String nome;
    public String cpf;
    public int idade;
    
    
    public PessoaFisica(String nome, String cpf, int idade, String email, String telefone) {
        super(email, telefone);       
        
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
}
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("email: " + this.email);
        System.out.println("idade: " + this.idade);
    }

}
