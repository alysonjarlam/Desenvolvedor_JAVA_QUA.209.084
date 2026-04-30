package com.atividade08.Models;

import com.atividade08.repository.IUusuario;

public class Usuario implements IUusuario {




    public Usuario(Object object, int i) {
        //TODO Auto-generated constructor stub
    }

    //metodos da interface
    @Override
    public String verificarIdade() {
       
        return (this.idade >= 18 ) ? " é maior de idade. " : "é menor dde idade. ";
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    public void setNome(String showInputDialog) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }



}
