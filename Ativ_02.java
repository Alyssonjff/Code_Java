package br.edu.univas;

import java.util.Scanner;

public class Ativ_02 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[]  numbers = new int[1000];
        int sumNumber = 0;
        double readQuanty = 0;
        System.out.println("**\t Olá digite o valor para calcular a média aritmética\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            sumNumber += numbers[i];
            readQuanty++;
            if (numbers[i] == 0) {
                readQuanty = readQuanty -1;
                break;
            }
        }
        System.out.printf("Resultado da média aritmética é = %.2f %n",  sumNumber/readQuanty);
    }
}
