package com.heranca.app.models;

public class PessoaJuridica extends Pessoa {
    //atributos

    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;
    public String website;

    //construtor
    public PessoaJuridica() {

        //metodo
        public String recepcionar(String nome){
            return "prazer, " + nome + ". Somos a empresa" + this.nomeFantasia + ".";
        }

    }


}
