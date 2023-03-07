package br.edu.univas;

import java.util.Scanner;

public class Main {
        public static void Exercicio01(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] numeros = new int[10];
        }
    public static void Exercicio02(String[]args){
        Scanner scan = new Scanner(System.in);
        int[]  numbers = new int[1000];
        int sumNumber = 0;
        double readQuanty = 0;
        System.out.println("**\t Olá digite o valor para calcular a média aritmética\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            sumNumber += numbers[i];
            readQuanty++;
            if (numbers[i] == 0) {
                readQuanty = readQuanty -1;
                break;
            }
        }
        System.out.printf("Resultado da média aritmética é = %.2f %n",  sumNumber/readQuanty);
    }
    public static void Exercicio03(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**\t Olá digite o valor para calcular a soma.\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        int[]  numbers = new int[1000];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
            if (numbers[i] == 0) {
                break;
            }
        }
        System.out.println("Resultado da soma é: " + sum);
    }
    public static void Exercicio04(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        double[] numbers = new double[1000];
        double[] multi = new double[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            multi[i] = Math.pow(numbers[i],2);
            System.out.println("Número ao quadrado é: " + multi[i]);
            if (numbers[i] == 0) {
                break;
            }

        }

    }
    public static void Exercicio05(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        int[] numbers = new int[1000];
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            if(verificaPrimo(numbers[i])){
                System.out.println(numbers[i] + " é primo. ");
            }
        }

    }
    public static boolean verificaPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
    public static void Exercicio06(String[] args){
        Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int[]  numbers = new int[1000];
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Por favor digite o " + (i + 1) + "º valor: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] ==0){
                break;
            }else if(numbers[i] % 2 == 0){
                par++;
            } else{
                impar++;
            }

        }
        System.out.println("O total de números pares é: "  + par);
        System.out.println("O total de números impares é: " + impar);
    }
    public static void Exercicio07(String[]args){
        Scanner scan = new Scanner (System.in);
        int numbers[] = new int[1000];
        int maior = 0;
        int menor = 10000;
        System.out.println("**\t Por favor digite um número\t**");
        System.out.println("**\t Pressione 0 para sair.\t**");
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite o " +(i+1)+"º valor: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] > maior){
                maior = numbers[i];
            }
            if (numbers[i] == 0) {
                break;
            }
            if (numbers[i] < menor){
                menor = numbers[i];
            }
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor = "+ menor);
    }
    public static void Exercico08(String[] args){
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
    public static void Exercicio09(String[] args){
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
            if (!existe){
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
            if (!existe){
                System.out.println(arrayB[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
