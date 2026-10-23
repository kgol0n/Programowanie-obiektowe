package Zadanie1;

public class Main{
    public static void main(String[] args){
        int[] numbers = new int[10];

        for(int i = 0; i < 10; i++){
            numbers[i] = i;
        }

        for(int i = 9; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}