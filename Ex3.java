/*Programa com função recursiva para calcular a potência de um número
base elevado a um expoente inteiro não negativo.*/

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma base inteira positiva.");
        int n = input.nextInt();
        System.out.println("Escolha a potência da base.");
        int pot = input.nextInt();

        System.out.println(Potencia(n, pot));

        input.close();

    }

    static int Potencia(int n, int pot){

        if(pot == 0){
            return 1;
        } else {
            return n*Potencia(n, pot-1);
        }
    }
}
