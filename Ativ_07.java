package br.edu.univas;

import java.util.Scanner;
public class Ativ_07 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[1000];
        int maior = 0;
        int menor = 100000;
        System.out.println("\t *****");
        System.out.println("Digite 0 para sair");
        for (int i = 0;i<numeros.length;i++){
            System.out.println("Digite um numero");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0){
                System.out.println("menor = " +menor);
                System.out.println("maior = " +maior);
                break;
            }
            else if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor ){
                menor = numeros[i];
            }
        }
    }
}