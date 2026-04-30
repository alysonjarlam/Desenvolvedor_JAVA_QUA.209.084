package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.Models.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario(null, 0);

        // entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("informe o nome"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe a idade")));

        //saida de dados
        JOptionPane.showMessageDialog(null, usuario.getNome() + usuario.verificarIdade());               





        
    }
}

// TODO: atividade 08 
// crie um programa que receba do usuario os valos dos atributos nome e 
// idade em JOoption, e o programa informa se o usuário é maior de idade
// ou menor de idade.
