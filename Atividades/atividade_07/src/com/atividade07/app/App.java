package com.atividade07.app;

import java.util.Scanner;

import com.atividade07.models.PessoaFisica;
import com.atividade07.models.PessoaJuridica;
import com.atividade07.models.contaPF;

public class App {
    public App() {
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        String pessoaTipo;
        String opcao;
        double valor;

        PessoaFisica usuario = newPessoaFisica(null, null, null);
                contaPF ccpf = new ContaPF("1234-5" , "10101-1" , 0, usuario);

        PessoaJuridica usuario = new PesoaJuridica(null, null, null, null);
                ContaPJ ccpj = new ContaPJ("1234-5" , "20101-1", 0, pj);

        System.out.println("Escolha o tipo de pessoa que deseja cadastrar: ");
        System.out.println("PF - Pessoa Física: ");
        System.out.println("PJ - Pessoa Jurídica: ");
        pessoaTipo = sc.nextLine();

        switch (pessoaTipo){
            case "PF" :
                

                System.out.println("Informe o nome do titular: ");
                usuario.setNome(sc.nextLine());
                System.out.println("Informe o CPF do Titular: ");
                usuario.setCpf(sc.nextLine());
                System.out.println("Informe o e-mail do titular: ");
                usuario.setEmail(sc.nextLine());

                cc.setPF(usuario);

                break;
                case"PJ":
                

                System.out.println("Informe a razão social da empresa: ");
                pj.setRazaoSocial(sc.nextLine());
                System.out.println("Informe o nome fantatasia da empresa: ");
                pj.setNomeFantasia(sc.nextLine());
                System.out.println("informe o cnpj da empresa: ");
                pj.setCnpj(sc.nextLine());
                System.out.println("informe o e-mail da empresa: ");
                pj.setEmail(sc.nextLine());

                ccpj.setPj(pj);

                break;
                default:
                    System.out.println("Pessoa 404");

                    if ("PF".equals(pessoaTipo) || "PJ".equals(pessoaTipo)){
                    do {
                        // menu
                        System.out.println("---- Opções do Roubank ----");
                        System.out.println("1 - Consultar dados da conta.");
                        System.out.println("2 - Fazer Depósito. ");
                        System.out.println("3 - Fazer Saque. ");
                        System.out.println("4 - Sair do programa. ");

                    switch (opcao) {
                        case "1":
                            if ("PF".equals(pessoaTipo)) {
                                ccpf.exibirDados();
                            }
                            else{
                                ccpj.exibirDados();

                            }
                            
                            }
                        }
                    
                            break;   
                            case "2":
                            System.out.println("Informe o valor do depósito em R$: ")
                            valor = sc.nextDouble();
                            
                            sc.nextLine();

                            if ("PF".equals(pessoaTipo) ) {
                                if (valor > 0 )  {                                  
                                
                                System.out.println("valor depositado com sucesso. ");
                                System.out.println("Saldo atual: R$ " + ccpf.fazerDeposito(valor));
                                
                            }
                            else{
                                System.out.println("Valor Inválido");
                            }  
                        }
                        else{
                            if (valor > 0 ) {
                                System.out.println("Valor depositado com sucesso. ");
                                System.out.println("Saldo atual: R$: " + ccpj.fazerDeposito(valor));
                                
                            }
                    
                        }
                            break;
                            case "3":
                                System.out.println("Informe o valor do saque em R$: ");  
                                valor = sc.nextDouble(); 
                                
                                sc.nextLine();

                                if ("PF".equals(pessoaTipo)) {
                                    if (valor > 0 && valor <= ccpf.getSaldo()) {
                                        System.out.println("Saldo efetuado com sucesso.");
                                        System.out.println("Saldo atual: R$ " + ccpf.fazerSaque(valor));
                                        
                                    }
                                    else{
                                        System.out.println("Valor do saque inválido. ");
                                    }
                                    
                                }
                                else{
                                    if (valor > 0 && valor <= ccpj.getSaldo()) {
                                        System.out.println("Saque efetuado com Sucesso.");
                                        System.out.println("Saldo atual: R$ " + ccpj.fazerSaque(valor));
                                        
                                    }
                                    else {
                                        System.out.println("Valor do saque inválido. ");
                                    }
                                }
                                break;
                                case "4":
                                    System.out.println("Programa encerrado.");
                                    System.out.println("Volte sempre. ");
                                    break;
                                    
                                    default:
                                        System.out.println("Opção inválida. ");
                    
                    
                    } while(! "4".equals(opcao));
        
        else {
            System.out.println("Não foi possivel cadastrar novo titular. ");
            System.out.println("Programa encerrado. ");
        }
        sc.close();
    }



        



// TODO: atividade 07
// Crie um programa de aplicativo de banco: o usuario poderá escolher se
// deseja entrar como pessoa física ou pessoa jurídica, deverá informar o 
// nome, email e cpf (classe PessoaFisica). ou nome fantasia, razão social
// e,aoç e cnpj (classe PessoaJurídica), e o programa deverá informar a 
// agência e a conta (classe conta) do titular (os dados do usuário serão
// setados uma única vez durante a 
