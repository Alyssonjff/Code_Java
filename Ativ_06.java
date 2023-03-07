package br.edu.univas;

import java.util.Scanner;

public class Ativ_06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int evenNumbers = 0;
        int oddNumbers = 0;
        int[]  numbers = new int[1000];
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] ==0){
                break;
            }else if(numbers[i] % 2 == 0){
                evenNumbers++;
            } else{
                oddNumbers++;
            }

        }
        System.out.println("O total de números pares é: "  + evenNumbers);
        System.out.println("O total de números impares é: " + oddNumbers);
    }
}
