/*Programa com função recursiva para verificar se uma string é um
palíndromo (lê-se igual de trás para frente).*/

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra.");
        String palavra = input.nextLine();

        System.out.println(VerifPalin(palavra, 0, palavra.length()-1));

        input.close();
    }

    static boolean VerifPalin(String palavra, int com, int fim){

        if(com >= fim){
            return true;
        }

        if(palavra.charAt(com) != palavra.charAt(fim)){
            return false;
        }

        return VerifPalin(palavra, com+1, fim-1);

    }
}
