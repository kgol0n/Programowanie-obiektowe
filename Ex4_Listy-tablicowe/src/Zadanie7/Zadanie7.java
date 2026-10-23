package Zadanie7;

public class Zadanie7 {
    static int minimumValue(int[] tab){
        int minVal = tab[0];
        for(int i:tab){
            if(i < minVal){
                minVal = i;
            }
        }
        return minVal;
    }
    static void main() {
        int[] tab = {40, -256, 512, -1024, 2048};
        System.out.println(minimumValue(tab));
    }
}
