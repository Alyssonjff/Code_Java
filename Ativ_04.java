package br.edu.univas;

import java.util.Scanner;

public class Ativ_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numero = new double[4];
        double[] elevado = new double[numero.length];
        for (int i = 0;i< numero.length;i++){
            System.out.println("Digite um numero");
            numero[i] = sc.nextDouble();
            elevado[i] = Math.pow(numero[i],2);
            System.out.println("Seu numero elevado ao quadrado é = " +elevado[i]);
        }
    }
}
