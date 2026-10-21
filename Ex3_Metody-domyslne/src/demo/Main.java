package demo;

public class Main {
    void main() {
        Person osoba1 = new Person("Jan", "Kowalski", 25);
        Person osoba2 = new Person("Jan", "Kowalski", 25);

        System.out.println(osoba1);
        System.out.println(osoba2);
        System.out.println(osoba1.equals(osoba2));
    }
}
