/*Programa com função recursiva que calcula a soma dos dígitos
de um número inteiro positivo.*/

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo.");
        int n = input.nextInt();

        System.out.println(SomaAlg(n));

        input.close();

    }

    static int SomaAlg(int n){
        if(n/10 == 0){
            return n;
        } else {
            return (n%10) + SomaAlg(n/10);
        }
    }
}
