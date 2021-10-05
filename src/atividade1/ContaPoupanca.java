package atividade1;


import java.util.Scanner;

public class ContaPoupanca extends Conta{

    //float taxaSaque = (float)0.10;
    float poupancaSaldo;

    @Override
    public void sacar(float valorSaque){

        System.out.print("Digite o valor a ser sacado na Poupança:R$ ");
        Scanner scan = new Scanner(System.in);
        valorSaque = scan.nextFloat();
        if(getSaldoConta()<valorSaque){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        poupancaSaldo = getSaldoConta()-valorSaque;
        //poupancaSaldo = poupancaSaldo - taxaSaque;
        this.saldoConta = poupancaSaldo;
    }
    public void saldo(){

        System.out.print("Poupança - ");
        System.out.println("Saldo:R$"+getSaldoConta());

    }
}
