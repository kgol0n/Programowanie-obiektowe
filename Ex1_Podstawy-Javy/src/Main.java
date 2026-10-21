import java.util.Scanner;
public class Main {
    static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        int age = 20;
        double price = 19.99;
        boolean active = true;
        char letter = 'A';
        String name = "John";

        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a % b);

        if(age >= 18) {
            System.out.println("Pełnoletni");
        } else {
            System.out.println("Niepełnoletni");
        }

        int[] numbers = {10, 20, 30, 40};
        for(int number : numbers){
            System.out.println(number);
        }

        name.length();
        name.toUpperCase();
        name.toLowerCase();
        name.charAt(0);
        name.equals("John");

        Scanner scanner = new Scanner(System.in); //Scannera tworzymy jednego, mozna go zamknac
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Cześć " + imie);
        scanner.close(); //zamkniecie scannera
    }
}
