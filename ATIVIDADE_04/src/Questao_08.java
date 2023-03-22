/*
 Faça um programa que receba uma string e verifique se a mesma é um código
 válido de CNH (Carteira Nacional de Habilitação).
 */
public class Questao_08 {
    public static void main(String[] args) {
        String cnh = "06698928774";

        if (validaCNH(cnh)) {
            System.out.println("CNH válida!");
        } else {
            System.out.println("CNH inválida!");
        }
    }

    public static boolean validaCNH(String cnh) {
        if (cnh.length() != 11) {
            return false;
        }
        for (int i = 0; i < cnh.length(); i++) {
            if (!Character.isDigit(cnh.charAt(i))) {
                return false;
            }
        }
        boolean todosDigitosIguais = true;
        for (int i = 1; i < cnh.length(); i++) {
            if (cnh.charAt(i) != cnh.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cnh.charAt(i) - '0') * (9 - i);
        }
        int resto = soma % 11;
        char dv1 = (resto < 2) ? '0' : (char) ((11 - resto) + '0');
        if (cnh.charAt(9) != dv1) {
            return false;
        }
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cnh.charAt(i) - '0') * (10 - i);
        }
        resto = soma % 11;
        char dv2 = (resto < 2) ? '0' : (char) ((11 - resto) + '0');
        if (cnh.charAt(10) != dv2) {
            return false;
        }

        return true;
    }
}
