package atividade1;

import java.util.Scanner;


public class ContaCorrente extends Conta{

    float taxaSaque = (float)0.10;
    float contaSaldo;

   @Override
    public  void sacar(float valorSaque){

        System.out.print("Digite o valor a ser sacado da Conta Corrente:R$ ");
        Scanner scan = new Scanner(System.in);
        valorSaque = scan.nextFloat();
        if(getSaldoConta()<valorSaque){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        contaSaldo = getSaldoConta()-valorSaque;
        contaSaldo = contaSaldo - taxaSaque;
        this.saldoConta = contaSaldo;
    }
    public void saldo(){

        System.out.print("Conta Corrente - ");
        System.out.println("Saldo:R$"+getSaldoConta());




    }
}
