package br.edu.univas;

public class StartApp2 {
    public static void main(String[] args){
        System.out.println("Comecou a aula 2 n nao lembro oq aconteceu no dia rs");

        int AnoDeNascimento = 2003;
        int AnoAtual = 2022;
        int idade = AnoAtual - AnoDeNascimento;
        System.out.println(idade);

        String nome = "Alysson jose de Franca Ferreira";
        System.out.println(nome);

        if (idade >= 18) {
            System.out.println("Voce e obrigado a votar");
        } else {
            System.out.println("Voce nao e obrigado a votar!!");
        }
    }
}
