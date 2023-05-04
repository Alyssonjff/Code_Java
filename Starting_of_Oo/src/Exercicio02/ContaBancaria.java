package Exercicio02;

public class ContaBancaria {
    public String titular;
    public int saldo;

    public void depositar(int adicionar){
        this.saldo += adicionar;
    }
    public void sacar(int retirada){
        this.saldo -= retirada;
    }
}
