package br.edu.univas;

import java.util.Scanner;
public class Ativ_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t *****");
        System.out.println("Digite 0 para sair");
        int[] array = new int[1000];
        int total = 0;
        for (int i = 0;i< array.length;i++){
            System.out.println("qual numero sera somado");
            array[i] = sc.nextInt();
            if (array[i] == 0){
                System.out.println("a soma de todos os numeros foi de = " +(total));
                break;
            }
            total += array[i]; ;
        }
    }
}