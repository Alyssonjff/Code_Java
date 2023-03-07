package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class Ativ_10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros serao analisados");
        int x = sc.nextInt();
        int[] ArrayA = new int[x];
        int[] ArrayB = new int[x];
        int j = 0;
        for (int i=0;i < x;i++){
            System.out.println("Qual numero do primeiro array");
            ArrayA[i] = sc.nextInt();
            System.out.println("Qual numero do segundo array");
            ArrayB[i] = sc.nextInt();
        }
        Arrays.sort(ArrayA);
        Arrays.sort(ArrayB);
        for (int i = 0;i != x ;i++){
            if (ArrayA[i] <= ArrayB[j]){
                System.out.print(ArrayA[i] + " - ");
            }
            if (ArrayB[j] <= ArrayA[i]){
                System.out.print(ArrayB[j] + " - ");
                j++;
            }
        }
    }
}
