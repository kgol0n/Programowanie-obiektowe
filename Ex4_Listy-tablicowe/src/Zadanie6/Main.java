package Zadanie6;

public class Main {

    static int[] copyArrayWithIndex(int[] tab, int startIdx, int endIdx){
        int newTabLength = endIdx - startIdx + 1;
        int[] copiedArray = new int[newTabLength];

        for(int i = startIdx; i <= endIdx; i++){
            copiedArray[i - startIdx] = tab[i];
        }
        return copiedArray;
    }

    static void main() {
        int[] myNums = new int[5];
        for(int i = 0; i < 5; i++){
            myNums[i] = i+1;
        }

        int[] copiedNums = copyArrayWithIndex(myNums, 1, 3);
        for(int i = 0; i < copiedNums.length; i++){
            System.out.print(copiedNums[i] + " ");
        }

    }
}
