package com.Lista.app;

import javax.swing.JOptionPane;

import com.Lista.models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora(0, 0);

        // declacarao de arrays
        String[] opcoes = {"Soma", "Subtracao", "Multiplicacao", "Divisao", "Sair"};
        Object opcao = opcoes[0];
        String opcaoSelecionada;
        
        
        do{
           opcao =  JOptionPane.showInputDialog(
            null, 
            "Selecione uma opção: ", 
            "Opções", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            opcoes, 
            opcoes[0]
        );
        if (!opcao.equals("Sair")) {
            calc.setX(Double.parseDouble(JOptionPane.showMessageDialog("Informe um numero: ")));
            calc.setY(Double.parseDouble(JOptionPane.showMessageDialog("Informe outro numero: ")));

            opcaoSelecionada = (String) opcao;

            switch (opcaoSelecionada) {

                case "Soma":
                    JOptionPane.showMessageDialog(null, "Soma: " + calc.somar ());                    
                    break;

                    case "Subtração":
                  JOptionPane.showMessageDialog(null, "Subtração: " + calc.subtrair ());                    
                    break;

                    case "Multiplicação":
                    JOptionPane.showMessageDialog(null, "Multiplicação: " + calc.multiplicar ());                    
                    break;

                    case "Divisão":
                    JOptionPane.showMessageDialog(null, "Divisão: " + calc.dividir ());                    
                    break;
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Progama encerrado");
        }
    
        }  while (opcao != "Sair"); 
        
    }
    
}
