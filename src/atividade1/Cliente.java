package atividade1;


public class Cliente  {

    protected String nomeCliente;
    protected  String cpfCliente;

    public Cliente(String nomeCliente, String cpfCliente){

        this.nomeCliente=nomeCliente;
        this.cpfCliente=cpfCliente;
    }



    public String getNomeCliente(){
        return this.nomeCliente;
    }


    public String getCpfCliente(){ return this.cpfCliente; }


}
