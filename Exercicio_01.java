package Exercicios.edu.univas;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Escolha sua opcao para calculo");
        System.out.println("1 - soma");
        System.out.println("2 - subtracao");
        System.out.println("3 - divisao");
        System.out.println("4 - multiplicacao");
        int choose = sc.nextInt();
        System.out.println("quantos numeros vao ser contados?");
        int i = sc.nextInt();
        if (choose == 1){
            soma(i,0);
        }else if (choose == 2){
            subtracao(i);
        }else if (choose == 3){
            divisao(i);
        }else if (choose == 4){
            multiplicacao(i);
        }
        System.out.println();
        System.out.println("deseja voltar a calculadora?");
        System.out.println("Y/N?");
        String palavra = sc.nextLine();
    }
    public static void soma(int quantidade, int mathSum){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < quantidade;i++){
            System.out.println("digite seu valor pra ser somado");
            int mathB = sc.nextInt();
            mathSum += mathB;
        }
        System.out.println("valor da soma = " +mathSum);

    }

    public static void subtracao(int quantidade){
        Scanner sc = new Scanner(System.in);
        int mathSubtraction = 0;
        for(int i = 0;i < quantidade;i++){
            if (i == 0){
                System.out.println("Qual numero a ser subtraido");
                mathSubtraction = sc.nextInt();
            }else {
                System.out.println("digite seu valor pra ser subtraido");
                int mathB = sc.nextInt();
                mathSubtraction -= mathB;
            }
        }
        System.out.println("valor da subtracao = " +mathSubtraction);
    }

    public static void divisao(int quantidade ){
        Scanner sc = new Scanner(System.in);
        double mathDivision = 0;
        for(int i = 0;i < quantidade;i++){
            if (i == 0){
                System.out.println("Digite o valor a ser dividido");
                mathDivision = sc.nextDouble();
            }else {
                System.out.println("digite seu valor pra ser dividido");
                double mathB = sc.nextDouble();
                mathDivision /= mathB;
            }
        }
        System.out.println("valor da Divisao = " + mathDivision);
    }

    public static void multiplicacao(int quantidade){
        Scanner sc = new Scanner(System.in);
        int mathMultiplication = 0;
        for(int i = 0;i < quantidade;i++){
            if (i == 0){
                System.out.println("Digite o valor a ser multiplicado");
                mathMultiplication = sc.nextInt();
            }else {
                System.out.println("digite seu valor pra ser multiplicado");
                int mathB = sc.nextInt();
                mathMultiplication += mathB;
            }
        }
        System.out.println("valor da multiplicacao = " + mathMultiplication);
    }

}
