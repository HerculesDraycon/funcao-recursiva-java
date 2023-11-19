/*Programa com função recursiva que conte quantos dígitos um número
inteiro positivo possui.*/

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo.");
        int num = input.nextInt();

        System.out.println(ContDig(num));

        input.close();

    }

    static int ContDig(int num){
        if (num/10 == 0){
            return 1;
        } else {
            return 1+ContDig(num/10);
        }
    }
}
