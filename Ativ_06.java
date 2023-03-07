package br.edu.univas;

import java.util.Scanner;

public class Ativ_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[1000];
        int impar = 0;
        int par = 0;
        System.out.println("\t *****");
        System.out.println("Digite 0 para sair");
        for (int i =0;i < numeros.length;i++){
            System.out.println("Por favor digite um numero");
            numeros[i] = sc.nextInt();
            if (numeros[i] == 0) {
                System.out.printf("teve %s numeros impares",impar);
                System.out.println();
                System.out.printf("teve %s numeros pares",par);
                break;
            }
            else if (numeros[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
    }
}