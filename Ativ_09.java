package br.edu.univas;

import java.util.Scanner;

public class Ativ_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[1000];
        int[] arrayB = new int[arrayA.length];
        int cancel = 3;
        for (int i = 0;i< arrayA.length;i++){
            System.out.println("Digite o numero que sera salvo no primeiro array");
            arrayA[i] = sc.nextInt();
            System.out.println("Digite o numero que sera salvo no segundo array");
            arrayB[i] = sc.nextInt();
            System.out.println("Se deseja parar digite 0, se nao aperte qualquer numero");
            cancel = sc.nextInt();
            if (cancel == 0){
                break;
            }
        }
        difenca(arrayA,arrayB);
        difencaB(arrayB,arrayA);
    }
    public static void difenca(int[] arrayA,int[] arrayB){
        int count = 0;

        for (int i = 0;i< arrayA.length;i++){
            boolean existe = false;

            for (int j = 0;j < arrayB.length;j++){
                if (arrayA[i] == arrayB[j]){
                    existe = true;
                }
            }
            if (existe){
                System.out.println(arrayA[i]);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void difencaB(int[] arrayB,int[] arrayA){
        int count = 0;

        for (int i = 0;i< arrayB.length;i++){
            boolean existe = false;

            for (int j = 0;j < arrayA.length;j++){
                if (arrayB[i] == arrayA[j]){
                    existe = true;
                }
            }
            if (existe){
                System.out.println(arrayB[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
