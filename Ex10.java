/*O programa implementa uma função recursiva que calcula o maior
elemento em um array de inteiros.*/

public class Ex10 {
    public static void main(String[] args) {
        
        int numeros[] = {12, 27, 45, 50, 60, 112, 220, 380};

        System.out.println(MaiorNum(numeros, numeros.length));

    }

    static int MaiorNum(int[] numeros, int tamanho){

        if(tamanho == 1){
            return numeros[0];
        }

        int maiorN = MaiorNum(numeros, tamanho-1);

        return Math.max(maiorN, numeros[tamanho - 1]);

    }
}