package br.edu.univas;

import java.util.Scanner;

public class Ativ_07 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int numbers[] = new int[1000];
        int maior = 0;
        int menor = 0;
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] > maior){
                maior = numbers[i];
            } else if (numbers[i] ==0) {
                break;
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (j == 0) {
                menor = numbers[1];
            }
            if(numbers[j] < menor){
                menor = numbers[j];
            }
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor = "+ menor);
    }
}
