package Zadanie9;

public class Main {
    static int[] mergeArrays(int[] firstTab, int[] secondTab){
        int bothLength = firstTab.length + secondTab.length - 1;
        int[] newTab = new int[bothLength];

        for(int i = 0; i < firstTab.length; i++){
            newTab[i] = firstTab[i];
        }

        for(int j = 0; j < secondTab.length; j++){
            newTab[firstTab.length - 1 + j] = secondTab[j];
        }
        return newTab;
    }
    static void main() {
        int[] myFirstTab = {1,2,3,4,5};
        int[] mySecondTab = {6,7,8,9,10};

        int[] mergedTab = mergeArrays(myFirstTab, mySecondTab);
        for(int i = 0; i < mergedTab.length; i++){
            System.out.print(mergedTab[i] + " ");
        }
    }
}
