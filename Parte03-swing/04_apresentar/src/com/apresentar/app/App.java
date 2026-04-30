package com.apresentar.app;
import javax.swing.JOptionPane;

import com.apresentar.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa (null, null, 0);

        //entrada de dados
        pessoa.setNome(JOptionPane.showInputDialog("informe o nome: "));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));

        //saida de dados
        JOptionPane.showConfirmDialog(null, pessoa);
    }
}
