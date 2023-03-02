package br.edu.univas;

import java.util.Scanner;

public class Ativ_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos numeros serão analisados");
        int x = sc.nextInt();
        int[] arrayA = new int[x];
        int[] arrayB = new int[x];

        for(int i = 0;i< x;i++){
            System.out.println("qual numero sera gravado no primeiro array?");
            arrayA[i] = sc.nextInt();
            System.out.println("Qual numero sera gravado no segundo array?");
            arrayB[i] = sc.nextInt();
        }

        for (int i = 0;i < x;i++) {
            for (int j = 0;j<x;j++){
                if (arrayA[i] == arrayB[j]){
                    System.out.println(arrayA[i] +" = " +arrayB[j]);
                }
            }
        }

    }
}
