package Zadanie7;

import java.util.ArrayList;
import java.util.Objects;

public class Gradebook {
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Gradebook(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        this.grades = new ArrayList<Integer>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Gradebook gradebook)) return false;
        return Objects.equals(getFirstName(), gradebook.getFirstName()) && Objects.equals(getLastName(), gradebook.getLastName()) && Objects.equals(getGrades(), gradebook.getGrades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGrades());
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public void removeGrade(int index){
        this.grades.remove(index);
    }

    public double averageGrade(){
    double avg = 0;
        for (Integer grade : this.grades) {
            avg += grade;
        }
        avg /= this.grades.size();
        return avg;
    }

    @Override
    public String toString() {
        return String.format("Gradebook for %s %s: Average Grade = %.2f, Grades: %s.", this.firstName, this.lastName, averageGrade(), this.grades);
    }
}
