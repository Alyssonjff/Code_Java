package br.edu.univas;

import java.util.Scanner;

public class Ativ_03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**\t Olá digite o valor para calcular a soma.\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        int[]  numbers = new int[1000];
        int sumNumber = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            sumNumber += numbers[i];
            if (numbers[i] == 0) {
                break;
            }
        }
        System.out.println("Resultado da soma é: " + sumNumber);
    }
}
