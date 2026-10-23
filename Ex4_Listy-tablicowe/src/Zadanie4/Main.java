package Zadanie4;

import java.util.Random;

public class Main {
    static void main() {
        Random random = new Random();
        double[] numbers = new double[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextDouble(100) + 1;
        }

        double suma = 0;
        for(int i = 0; i < 10; i++){
            suma += numbers[i];
        }
        System.out.println(suma);
    }
}
