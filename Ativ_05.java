package br.edu.univas;

import java.util.Scanner;

public class Ativ_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100];
        int[] impares = new int[100];
        for (int i =0;i< numeros.length;i++){
            numeros[i] = i;
            if (i%2 != 0){
                impares[i] = i;
                System.out.println(impares[i]);
            }
        }
    }
}
