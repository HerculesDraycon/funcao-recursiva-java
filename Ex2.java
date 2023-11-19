/*Progarma com função recursiva para calcular o n-ésimo número da
sequência de Fibonacci.*/

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um número inteiro positivo.");
        int n = input.nextInt();

        System.out.println(Fibo(n));

        input.close();

    }

    static int Fibo(int n){
        if(n<3){
            return 1;
        } else {
            return Fibo(n-1) + Fibo(n-2);
        }
    }
}
