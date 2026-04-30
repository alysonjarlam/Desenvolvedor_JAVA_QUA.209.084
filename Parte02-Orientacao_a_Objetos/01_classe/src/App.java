package com.classe.app;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) throws Exception {
        //instancia a classe pessoa
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println("Informe o nome da pessoa: ");
        pessoa.nome = sc.nextLine();
        System.out.println("Informa a idade da pessoa: ");
        pessoa.idade = sc.nextLine();
        System.out.println("Inoforme a altura da pessoa em metros: ");
        pessoa.altura = sc.nextLine();

        sc.nextLine();

        System.out.println("Informe o e-mail da pessoa: ");
        pessoa.email = sc.nextLine();


        //difine os valores dos atributos
        pessoa.nome = "Alyson";
        pessoa.email = "alysonjarlam@live.com";
        pessoa.idade = 35;
        pessoa.altura = 1.59;

        //saida de dados
        pessoa.cumprimentar();
        pessoa.apresentar();

        /*System.out.println("Atributos do objeto");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Email: " + pessoa.email;
        System.out.println("idade: " + pessoa.idade);
        System.out.println("Altura: " + pessoa.altura + "metros.");*/

        sc.close();

        
    }
}
