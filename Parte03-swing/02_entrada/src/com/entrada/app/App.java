package com.entrada.app;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        
        // entrada de variaveis
        String nome;

        //entrada de dados
        nome = JOptionPane.showInputDialog("informe seu nome:");

        //saida de dados

        JOptionPane.showMessageDialog(null, "Meu nome é: " + nome);

    }
}
