package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null);
        PessoaJuridica = new PessoaJuridica(null, null, null, null);


        //dados da empresa
        empresa.setNomeFantasia("Funeraria voce e proximo");
        empresa.setCnpj("09.780.602/001-83");
        empresa.setEmail("funeraria@contato.com.br");
        empresa.setTelefone("(61) 98765 4321");

        // dados do usuario
        System.out.println("Informe o nome: ");
        usuario.setNome(sc.nextLine);
        System.out.println("Informe o cpf: ");
        usuario.setCpf(sc.nextLine);
        System.out.println("Informe o e-mail: ");
        usuario.setEmail(sc.nextLine);
        System.out.println("Informe o telefone: ");
        usuario.setTelefone(sc.nextLine);        


        //saida de dados
        System.out.println("\nDADOS DO USUARIO:\n");
        System.out.println("Nome do usuario: " + usuario.getNome());
        System.out.println("CPF do usuário: " + usuario.getCpf());
        System.out.println("E-mail do Usuário: " + usuario.getemail());
        System.out.println("Telefone do usuário: " + usuario.gettelefone());

        System.out.println("\nDADOS DA EMPRESA:\n");
            System.out.println("\nDADOS DO USUARIO:\n");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CPF da empresa: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getemail());
        System.out.println("Telefone da empresa: " + empresa.gettelefone());


                sc.close();
        
    }
}
