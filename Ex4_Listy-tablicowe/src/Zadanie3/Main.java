package Zadanie3;

public class Main {
    static void main() {
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = i+1;
        }

        for(int i = 0; i < 10; i++){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
