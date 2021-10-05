package atividade1;

import java.util.Scanner;



public class Principal {
    public static void main(String[] args){
        int respMenuPrincipal;
        int respMenuPrincipal2;
        int respMenuInicial;
        int lendonumConta=0;
        int lendoAgencia=0;
        String nome = new String();
        String  cpf = new  String();
        Cliente cliente = new Cliente(nome, cpf);
        float valor = 0;

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        System.out.println("=========================");
        System.out.println("|   CONTROLE BANCÁRIO   |");
        System.out.println("=========================");

        contaCorrente.setClienteConta(cliente);
        contaCorrente.setNumeroConta(lendonumConta);
        contaCorrente.setAgenciaConta(lendoAgencia);

        do {

            System.out.println("==============================");
            System.out.print("Cliente:"+contaCorrente.getClienteConta().nomeCliente);
            System.out.println(" - Cpf:"+contaCorrente.getClienteConta().cpfCliente);
            System.out.println("Conta:"+contaCorrente.getNumeroConta()+" - Agencia:"+contaCorrente.getAgenciaConta());
            System.out.println("=============MENU=============");
            System.out.println("| [1] Para Conta Corrente    |");
            System.out.println("| [2] Para Conta Poupança    |");
            System.out.println("| [0] Para Sair              |");
            System.out.println("==============================");
            Scanner resp = new Scanner(System.in);
            respMenuInicial = resp.nextInt();
            switch (respMenuInicial){
                case 1:
                    do {
                        System.out.println("======================");
                        System.out.print("Cliente:"+contaCorrente.getClienteConta().nomeCliente);
                        System.out.println(" - Cpf:"+contaCorrente.getClienteConta().cpfCliente);
                        System.out.println("Conta:"+contaCorrente.getNumeroConta()+" - Agencia:"+contaCorrente.getAgenciaConta());
                        System.out.println("=== CONTA CORRENTE ===");
                        System.out.println("=========MENU=========");
                        System.out.println("| [1] Para Depositar |");
                        System.out.println("| [2] Para Sacar     |");
                        System.out.println("| [3] Para ver saldo |");
                        System.out.println("| [0] Menu Anterior  |");
                        System.out.println("======================");
                        Scanner resp2 = new Scanner(System.in);
                        respMenuPrincipal = resp2.nextInt();
                        switch (respMenuPrincipal){
                            case 1:
                                contaCorrente.depositar(valor);
                                break;
                            case  2:
                                contaCorrente.sacar(valor);
                                break;
                            case 3:
                                contaCorrente.saldo();
                                break;
                            case  0:
                                break;
                            default:
                                System.out.println("Opção Inválida!\nTenteNovamente");
                                break;
                        }
                    }while (respMenuPrincipal!=0);
                    break;
                case 2:
                    do {
                        System.out.println("======================");
                        System.out.print("Cliente:"+contaCorrente.getClienteConta().nomeCliente);
                        System.out.println(" - Cpf:"+contaCorrente.getClienteConta().cpfCliente);
                        System.out.println("Conta:"+contaCorrente.getNumeroConta()+" - Agencia:"+contaCorrente.getAgenciaConta());
                        System.out.println("=== CONTA POUPANÇA ===");
                        System.out.println("=========MENU=========");
                        System.out.println("| [1] Para Depositar |");
                        System.out.println("| [2] Para Sacar     |");
                        System.out.println("| [3] Para ver saldo |");
                        System.out.println("| [0] Menu anterior  |");
                        System.out.println("======================");
                        Scanner resp3 = new Scanner(System.in);
                        respMenuPrincipal2 = resp3.nextInt();
                        switch (respMenuPrincipal2){
                            case 1:
                                contaPoupanca.depositar(valor);
                                break;
                            case  2:
                                contaPoupanca.sacar(valor);
                                break;
                            case 3:
                                contaPoupanca.saldo();
                                break;
                            case  0:
                                break;
                            default:
                                System.out.println("Opção Inválida!\nTenteNovamente");
                                break;
                        }

                    }while (respMenuPrincipal2!=0);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!\nTenteNovamente");
                    break;

            }

        }while (respMenuInicial!=0);
    }
}
