package Zadanie7;

public class Main {
    void main(){
        Gradebook dziennik = new Gradebook("Jan", "Kowalski");
        dziennik.addGrade(5);
        dziennik.addGrade(4);
        dziennik.addGrade(3);
        System.out.println(dziennik);
        dziennik.removeGrade(0);
        System.out.println(dziennik);
    }
}
