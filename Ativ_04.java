package br.edu.univas;

import java.util.Scanner;

public class Ativ_04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        double[] numbers = new double[1000];
        double[] multi = new double[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            multi[i] = Math.pow(numbers[i],2);
            if (numbers[i] == 0) {
                break;
            }
            System.out.println("Número ao quadrado é: " + multi[i]);

        }

    }
}
