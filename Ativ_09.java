package br.edu.univas;

import java.util.Scanner;

public class Ativ_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros serao analisados?");
        int x = sc.nextInt();
        int[] ArrayA = new int[x];
        int[] ArrayB = new int[x];
        for (int i=0;i < x;i++){
            System.out.println("Qual numero do primeiro array");
            ArrayA[i] = sc.nextInt();
            System.out.println("Qual numero do segundo array");
            ArrayB[i] = sc.nextInt();
        }
        for (int i = 0;i < x;i++){
            for (int j = 0;j < x;j++){
                if (ArrayA[i] != ArrayB[j]){
                    System.out.println(ArrayA[i]);
                }
            }
            System.out.println();
        }
    }
}
