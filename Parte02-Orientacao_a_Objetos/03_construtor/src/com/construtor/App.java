package com.construtor.app;

import java.util.Scanner;

import com.construtor.models.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa sc. new Pessoa();
        Pessoa usuario = new Pessoa(null, null, null, null, 0, 0);

        System.out.println(": ");
        usuario.nome = sc.nextLine();
        System.out.println("informe o e-mail: ");
        usuario.email = sc.nextLine();
        System.out.println("informe o nome: ");
        usuario.telefone = sc.nextLine();
        System.out.println("informe o cpf: ");
        usuario.cpf = sc.nextLine();
        System.out.println("informe a idade: ");
        usuario.idade = sc.nextInt();
        System.out.println("informe a altura: ");
        usuario.altura = sc.nextDouble();

        System.out.println("Nome: " + usuario.nome);
        System.out.println("email: " + usuario.email);
        System.out.println("telefone: " + usuario.telefone);
        System.out.println("cpf: " + usuario.cpf);
        System.out.println("idade: " + usuario.idade);
        System.out.println("altura: " + usuario.altura);
        
        
    }
}
