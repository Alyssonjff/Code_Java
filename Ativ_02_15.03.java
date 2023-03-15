package br.edu.univas;
import java.util.Scanner;
public class Ativ_02 {
    public static void main(String[] args){
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
}
