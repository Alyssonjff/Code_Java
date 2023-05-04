package codigo;

public class Principal {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Carro uno = new Carro();

        uno.ano = 2013;
        uno.modelo = "Uno";
        uno.fabricante = "FIAT";
        uno.velocidade = 0;
        uno.acelerar(5);
        System.out.println(uno.velocidade);

        Carro lamborhini = new Carro();

        lamborhini.ano = 2024;
        lamborhini.modelo = "Gallardo";
        lamborhini.fabricante = "LAMBORGHINI";
        System.out.println(lamborhini.modelo);
        lamborhini.acelerar(20);
        System.out.println(lamborhini.velocidade);

    }
}
