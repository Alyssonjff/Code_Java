package br.edu.univas;

import java.util.Scanner;

public class Ativ_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int total = 0;
        for (int i = 0;i< array.length;i++){
            System.out.println("qual numero sera somado");
            array[i] = sc.nextInt();
            total += array[i]; ;
        }

        System.out.println("a media de todos os numeros foi de = " +(total));
    }
}
