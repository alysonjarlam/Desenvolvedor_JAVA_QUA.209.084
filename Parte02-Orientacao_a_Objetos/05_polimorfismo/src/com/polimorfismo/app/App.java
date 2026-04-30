package com.polimorfismo.app;

import java.util.Scanner;

import com.polimorfismo.models.PessoaFisica;
import com.polimorfismo.models.PessoaJuridica;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(null, null, 0, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        empresa.nomeFantasia = "Cafeteria Café tao Gostoso ";
        empresa.cnpj = "18.214.969/0001-20";
        empresa.email = "cafetaogostoso@contato.com.br";
        empresa.telefone = "(61) 9 9191-0000";

        
        System.out.println("informe o nome");
        usuario.nome = sc.nextLine();
        System.out.println("informe o cpf: ");
        usuario.cpf = sc.nextLine();
        System.out.println("informe o e-amil: ");
        usuario.email = sc.nextLine();
        System.out.println("informe o telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("informe a idade: ");
        usuario.idade = sc.nextInt();

        System.out.println("\nDADOS DO USUARIO\n");
        usuario.exibirDados();
        System.out.println("\nDADOS DA EMPRESA\n");
        usuario.exibirDados();

        sc.close();
        
    }
}
