package br.edu.univas;

import java.util.Scanner;

public class Ativ_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arrayA = new int[1000];
        int[] arrayB = new int[arrayA.length];
        int cancel = 3;

        for(int i = 0;i< arrayA.length;i++){
            System.out.println("Qual numero sera gravado no primeiro array?");
            arrayA[i] = sc.nextInt();
            System.out.println("Qual numero sera gravado no segundo array?");
            arrayB[i] = sc.nextInt();
            System.out.println("Deseja parar? digite 0 se sim, se não 1");
            cancel = sc.nextInt();
            if (cancel == 0){
                break;
            }

        }

        for (int i = 0;i < arrayA.length;i++) {
            for (int j = 0;j<arrayA.length;j++){
                if (arrayA[i] == arrayB[j] && arrayA[i] != 0){
                    System.out.println("O numero " + arrayA[i] +" se repetiu");
                }
            }
        }

    }
}
