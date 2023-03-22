import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Questao_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra: ");
        String readWord = scan.nextLine();
        String result = removeOddWord(readWord);
        System.out.println(result);
    }

    public static String removeOddWord(String readWord) {
        int[] countArray = new int[256];

        for (int i = 0; i < readWord.length(); i++) {
            char c = readWord.charAt(i);
            countArray[c]++;
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < readWord.length(); i++) {
            char c = readWord.charAt(i);
            if (countArray[c] % 2 == 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

