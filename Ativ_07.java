package br.edu.univas;

import java.util.Scanner;

public class Ativ_07 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ate quantos contar");
        int x = sc.nextInt();
        int[] numeros = new int[x];
        int maior = 0;
        int menor = 100000;
        
        for (int i = 0;i<numeros.length;i++){
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor ){
                menor = numeros[i];
            }
        }
        System.out.println("menor = " +menor);
        System.out.println("maior = " +maior);
    }
}
