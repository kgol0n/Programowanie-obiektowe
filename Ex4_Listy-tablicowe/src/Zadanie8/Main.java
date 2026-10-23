package Zadanie8;

public class Main {
    static int countZeros(int[] tab){
        int zerosCount = 0;
        for(int i : tab){
            if(i == 0){
                zerosCount++;
            }
        }
        return zerosCount;
    }
    static void main() {
        int[] tab = {0, 1, 2, 0, 3, 0, 4};
        System.out.println(countZeros(tab));
    }
}
