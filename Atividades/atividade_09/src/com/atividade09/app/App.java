package com.atividade09.app;

import javax.swing.JOptionPane;

import com.atividade09.models.Combustivel;



public class App {
    public static void main(String[] args) throws Exception {
        // instanciando
        Combustivel tanque = new Combustivel(0, 0);

        // declaracao de variaveis
        String[] opcoes = {"Etanol" , " Gasolina" , "Caucular" , "Sair" };
        Object opcao;
        String opcaoEscolhida;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção : ", 
                "Melhor combustivel", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes [0]);
                opcaoEscolhida = (String) opcao;

                switch (opcaoEscolhida) {
                    case "etanol":
                    //objeto    
                    tanque.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol")));                        
                        break;

                    case "gasolina" :
                        tanque.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informar o valor da gasolina")));

                        break;

                        case "Caucular " :
                            JOptionPane.showConfirmDialog(null, tanque.melhorCombustivel());
                            break;
                }

        } while (opcao != "Sair");

    }
}
// TODO: atividade 09
// Faça um programa com JOptionPane que receba do usuario os valoes dos 
//combustiveis metanol e gasolina, exiba qual o melhor combustivel para
//abastecer. O usuario deverá ter a opção de encerrar o progama.

// note: para que o etanol seja mais vantajoso, seu preco tem que ser ate 75%
// do valor da gasolina.
