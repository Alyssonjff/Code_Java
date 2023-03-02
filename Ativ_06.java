package br.edu.univas;

import java.util.Scanner;

public class Ativ_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ate qual numero contar");
        int x = sc.nextInt();
        int[] numeros = new int[x];
        int impar = 0;
        int par = 0;
        for (int i =0;i<= numeros.length-1;i++){
            numeros[i] = i;
            if (i%2 != 0){
                impar++;
            }else{
                par++;
            }
        }
        System.out.printf("teve %s numeros impares",impar);
        System.out.println();
        System.out.printf("teve %s numeros pares",par);
    }
}
