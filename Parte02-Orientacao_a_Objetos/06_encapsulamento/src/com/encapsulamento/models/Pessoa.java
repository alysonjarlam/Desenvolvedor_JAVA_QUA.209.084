package com.encapsulamento.models;

abstract public class Pessoa {
   
    private String email;
    private String telefone;
 



    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    //metodos de acesso (getters e setters)
    public String getemail(){
        return this.email;
    }

    public String setemail(String email){
        this.email = email;
    }

    public String gettelefone(){
        return this.telefone;
    }

    public String settelefone(String telefone){
        this.telefone = telefone;

    }


}
