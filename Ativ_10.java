package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class Ativ_10 {
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
        uniao(arrayA,arrayB);
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
    }
    public static void uniao(int[] vetor,int[] vetor2){
        int count = 0;
        int[] resultado = new int[vetor.length+ vetor2.length];
        for (int i = 0;i< vetor.length;i++){
            boolean existe = false;

            for (int j = 0;j < vetor2.length;j++){
                if (vetor[i] == vetor2[j]){
                    existe = true;
                }
            }
            if (!existe){
                resultado[count++] = vetor[i];
            }
        }
        for (int i = 0;i< vetor2.length;i++){
            boolean existe = false;

            for (int j = 0;j < resultado.length;j++){
                if (vetor2[i] == resultado[j]){
                    existe = true;
                }
            }
            if (!existe){
                resultado[count++] = vetor2[i];
            }
        }
    }
}
