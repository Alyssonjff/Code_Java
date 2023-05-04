package codigo;

public class Carro {
    public int ano;
    public String modelo;
    public String fabricante;
    public int velocidade;

    public void acelerar(int valorIncremental){
        this.velocidade += valorIncremental;
    }
    public void frear(int valorDecremental){
        this.velocidade -= valorDecremental;
    }
}
