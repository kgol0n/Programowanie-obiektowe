package Zadanie2;

import java.time.Year;
import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction) {
        setBrand(brand);
        setModel(model);
        setYearOfProduction(yearOfProduction);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "";
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "";
        }
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        if (yearOfProduction > Year.now().getValue()) {
            this.yearOfProduction = Year.now().getValue();
        } else {
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Vehicle " + this.brand + " " + this.model + ", Year: " + this.yearOfProduction;
    }
}
