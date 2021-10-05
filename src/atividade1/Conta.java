package atividade1;


import java.util.Scanner;


public abstract class Conta {

    private int numeroConta;
    private int agenciaConta;
    private Cliente clienteConta;
    protected  float saldoConta = 0;


    public Conta(){}

    public Conta(int numeroConta, int agenciaConta, Cliente clienteConta,float saldoConta){

        this.numeroConta=numeroConta;
        this.agenciaConta=agenciaConta;
        this.clienteConta= clienteConta;
        this.saldoConta=saldoConta;

    }

    public void setNumeroConta(int numeroConta){

        do {
            System.out.print("Digite o número da conta:");
            Scanner lendo = new Scanner(System.in);
            numeroConta =lendo.nextInt();
            if (numeroConta<=0){
                System.out.println("Número de conta inválido");
            }

        }while (numeroConta<=0);
        this.numeroConta = numeroConta;
    }
    public  int getNumeroConta(){ return this.numeroConta; }

    public void setAgenciaConta(int agenciaConta){
        do {
            System.out.print("Digite o número da agência:");
            Scanner lendo2 = new Scanner(System.in);
            agenciaConta =lendo2.nextInt();
            if (agenciaConta<=0){
                System.out.println("Número de conta inválido");
            }

        }while (agenciaConta<=0);
        this.agenciaConta = agenciaConta;
    }
    public int getAgenciaConta(){ return this.agenciaConta; }

    public void setClienteConta(Cliente clienteConta){

        System.out.print("Digite o seu nome completo:");
        Scanner lendo3 = new Scanner(System.in);
        clienteConta.nomeCliente = lendo3.nextLine();
        System.out.print("Digito o seu CPF:");
        Scanner lendo2 = new Scanner(System.in);
        clienteConta.cpfCliente = lendo2.nextLine();
        this.clienteConta = clienteConta;
    }
    public Cliente getClienteConta(){ return this.clienteConta; }

    public float getSaldoConta(){

        return this.saldoConta;
    }

    public abstract void sacar(float valorSaque);

    public void depositar(float valorDeposito){
        System.out.print("Digite o valor a ser depositado na conta:R$ ");
        Scanner scan = new Scanner(System.in);
        valorDeposito = scan.nextFloat();
        this.saldoConta = getSaldoConta()+valorDeposito;

    }




}
