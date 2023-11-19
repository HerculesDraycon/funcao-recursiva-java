/*O programa implementa uma função recursiva que calcula a soma de todos
os elementos em um array de inteiros.*/

public class Ex9 {
    public static void main(String[] args) {
        int elementos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(SomaArray(elementos, elementos.length-1));

    }

    static int SomaArray(int[] elementos, int i){

        if(i == 0){
            return elementos[0];
        } else {
            return elementos[i] + SomaArray(elementos, i-1);
        }

    }
}
