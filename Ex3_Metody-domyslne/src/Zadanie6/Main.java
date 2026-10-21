package Zadanie6;

public class Main {
    void main() {
        MovieRating oceny = new MovieRating("Smoleńsk", "Kaczyński", 2);
        oceny.addRating(0, 1.0);
        oceny.addRating(1, 2.5);
        System.out.println(oceny);
    }

}
