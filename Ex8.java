/*O programa desenvolve uma função recursiva que inverte uma string.*/

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase = input.nextLine();

        System.out.println(InverteString(frase));

        input.close();

    }

    static String InverteString(String frase){

        if(frase.length() == 1){
            return frase;
        } else {
            return InverteString(frase.substring(1)) + frase.charAt(0);
        }

    }
}
