package demo;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        setAge(age);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty() == true) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty() == true) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        if (((Person) o).firstName.equals(this.firstName) && ((Person) o).lastName.equals(this.lastName)
                && ((Person) o).age == this.age) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }
}
