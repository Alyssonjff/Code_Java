package br.edu.univas;

import java.util.Scanner;

public class Ativ_03_15.03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();

        String saida = entrada.replaceAll("[aAeEiIoOuU]", "AEIOU");

        System.out.println("Resultado: " + saida);
    }
}
