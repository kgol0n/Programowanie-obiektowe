package Zadanie5;

public class Main {
    static int[] copyArrayReverse(int[] lista){
        int[] reversedLista = lista.clone();

        for(int i = 0; i < reversedLista.length / 2; i++){
            int temp = reversedLista[i];
            reversedLista[i] = reversedLista[reversedLista.length - 1 - i];
            reversedLista[reversedLista.length - 1 - i] = temp;
        }

        return reversedLista;
    }
    static void main() {
        int[] myNums = new int[5];
        for(int i = 0; i < 5; i++){
            myNums[i] = i+1;
        }

        System.out.print("Przed zmianami: ");
        for(int i = 0; i < 5; i++){
            System.out.print(myNums[i] + " ");
        }

        int[] reversedNums = copyArrayReverse(myNums);

        System.out.println("");
        System.out.print("Po zmianach: ");
        for(int i = 0; i < 5; i++){
            System.out.print(reversedNums[i] + " ");
        }
    }
}
