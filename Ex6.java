/*Programa com função recursiva para realizar uma busca binária
em um array ordenado.*/

import java.util.Scanner;
public class Ex6{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int valores[] = {2, 3, 5, 7, 11, 13, 17, 23, 31, 37};

        System.out.println("Selecione a chave que deseja buscar.");
        int x = input.nextInt();

        System.out.print("A chave selecionada está na posição: ");
        System.out.println(BuscaBinaria(valores, 0, valores.length, x));

        input.close();

    }

    static int BuscaBinaria(int[] valores, int com, int fim, int x){

        int p = (com+fim)/2;
        
        if(com>fim){
            return -1;
        } else if (valores[p] == x){
            return p;
        } else if (valores[p] < x){
            return BuscaBinaria(valores, p+1, fim, x);
        } else if (valores[p] > x){
            return BuscaBinaria(valores, com, p-1, x);
        }

        return 0;

    }
}