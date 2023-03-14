package br.edu.univas;

import java.util.Scanner;

public class Ativi_01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        for (int i=0;;){
            String palavra = sc.nextLine();
            int b = 40 - palavra.length();
            int c = 0;
            for (int j = 0;j < b;j++){
            System.out.print("_");
            c++;
            }
        System.out.println(palavra);
        System.out.println(c + " = foi o total de palavras que faltou para completar");
        }
    }
}
