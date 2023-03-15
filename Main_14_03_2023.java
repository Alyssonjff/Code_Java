package br.edu.univas;

import java.util.Scanner;

public class Main_14_03_2023 {
    public static void Exercicio_01(String[] args) {
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
    public static void Exercicio_02(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque a data no padrão dd/mm/yyyy");
        String data = sc.nextLine();
        int dia = Integer.parseInt(data.substring(0,2));
        int mes = Integer.parseInt(data.substring(3,5));
        int ano = Integer.parseInt(data.substring(6,10));
        String MES = "";
        String DIA = "";
        switch (mes){
            case 1 : MES = "Janeiro"; break;
            case 2 : MES = "Fevereiro"; break;
            case 3 : MES = "Março"; break;
            case 4 : MES = "Abril"; break;
            case 5 : MES = "Maio"; break;
            case 6 : MES = "Junho"; break;
            case 7 : MES = "Julho"; break;
            case 8 : MES = "Agosto"; break;
            case 9 : MES = "Setembro"; break;
            case 10 : MES = "Outubro"; break;
            case 11 : MES = "Novembro"; break;
            case 12 : MES = "Dezembro"; break;



        }
        DIA = day(dia,DIA);
        System.out.printf("%s de %s de %d" ,DIA,MES,ano);
    }
    public static String day(int dia, String DIA){
        switch (dia){
            case 1 : DIA = "Um";break;
            case 2 :DIA = "Dois";break;
            case 3 :DIA = "Tres";break;
            case 4 :DIA = "Quatro";break;
            case 5 :DIA = "Cinco";break;
            case 6 :DIA = "Seis";break;
            case 7 :DIA = "Sete";break;
            case 8 :DIA = "Oito";break;
            case 9 :DIA = "Nove";break;
            case 10 :DIA = "Dez";break;
            case 11 :DIA = "Onze";break;
            case 12 :DIA = "Doze";break;
            case 13 :DIA = "Treze";break;
            case 14 :DIA = "Quatorze";break;
            case 15 :DIA = "Quinze";break;
            case 16 :DIA = "Dezessete";break;
            case 17 :DIA = "Dezesseis";break;
            case 18 :DIA = "Dezoito";break;
            case 19 :DIA = "Dezenove";break;
            case 20 :DIA = "Vinte";break;
            case 21 :DIA = "Vinte e um";break;
            case 22 :DIA = "Vinte e dois";break;
            case 23 :DIA = "Vinte e tres";break;
            case 24 :DIA = "Vinte e quatro";break;
            case 25 :DIA = "Vinte e cinco";break;
            case 26 :DIA = "Vinte e seis";break;
            case 27 :DIA = "Vinte e sete"; break;
            case 28 :DIA = "Vinte e oito";break;
            case 29 :DIA = "Vinte e nove";break;
            case 30 :DIA = "Trinta";break;
            case 31 :DIA = "Trinta e um";break;
        }
        return DIA;
    }
    public static void Exercicio_03(String[] args){
        Scanner scan = new Scanner(System.in);
        String readWord = "";
        String vowelUppercase = "";
        System.out.println("Por favor digite uma palavra: ");
        readWord = scan.nextLine();
        for(int i = 0; i < readWord.length(); i++){
            char aux = readWord.charAt(i);
            if(aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u' ||
                    aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U'){
                vowelUppercase += Character.toUpperCase(aux);
            }else {
                vowelUppercase += aux;
            }
        }
        System.out.println("A palavra digita com as vogais maiúscula: " + vowelUppercase);
    }
    public static void Exercicio_04(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite o seu CPF: ");
        String readCpf = scan.nextLine().replaceAll("[^0-9]", "");;
        if (validateCpf(readCpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido, por favor digite CPF válido! ");
        }
    }

    public static boolean validateCpf(String readCpf) {
        if (readCpf.length() != 11 || readCpf.matches("(.)\\1{10}")) {
            return false;
        }
        int[] number = new int[11];
        for (int i = 0; i < 11; i++) {
            number[i] = Integer.parseInt(readCpf.substring(i, i + 1));
        }
        int sum = 0;
        for(int i = 0; i < 9; i++){
            sum += number[i] * (10 - i);
        }
        int rest = sum % 11;
        int numberOne = 0;
        if(rest < 2) {
            numberOne = 0;
        } else {
            numberOne = 11 - rest;
        }
        if(number[9] != numberOne){
            return false;
        }
        sum = 0;
        for(int i = 0; i < 10; i++){
            sum += number[i] * (11 - i);
        }
        rest = sum % 11;
        int segundoDigito = rest < 2 ? 0 : 11 - rest;
        if(number[10] != segundoDigito){
            return false;
        }
        return true;
    }
}
