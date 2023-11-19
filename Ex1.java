/* Programa com função recursiva para calcular o fatorial de um número
inteiro não negativo.*/

import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro não negativo.");
        int n = input.nextInt();

        System.out.println("Resultado = " + fat(n));

        input.close();

    }

    static int fat(int n){

        if(n == 0){
            return 1;
        } else {
            return n*fat(n-1);
        }

    }

}