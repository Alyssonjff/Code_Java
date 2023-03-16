import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Questao_03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite algo");
        String input = scan.nextLine();
        String output = removeOddOccurrence(input);
        System.out.println(output);
    }

    public static String removeOddOccurrence(String input) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Conta as ocorrências de cada letra na string de entrada
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        // Remove as letras que ocorrem um número ímpar de vezes
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (countMap.get(c) % 2 == 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

