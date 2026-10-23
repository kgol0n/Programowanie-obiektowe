package Zadanie2;


import java.util.Random;

public class Main {
    static void main() {
        Random random = new Random();
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i++){
            numbers[i] = random.nextInt(100) + 1;
        }

        int suma = 0;
        for(int i = 0; i < 20; i++){
            suma += numbers[i];
        }
        double avg = suma/20;
        System.out.println(avg);
            }
}
