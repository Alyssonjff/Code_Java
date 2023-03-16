import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual palavra");
        String stringIn = sc.nextLine();
        char stringOut ;
        for (int i = 0;i  <= stringIn.length()-1;i++){
            if (i %2 == 0){
                stringOut = stringIn.toUpperCase().charAt(i);
                System.out.print(stringOut);
            }else{
                stringOut = stringIn.toLowerCase().charAt(i);
                System.out.print(stringOut);
            }
        }
    }
}
