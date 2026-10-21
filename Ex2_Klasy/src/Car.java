public class Car {
    String brand;
    String model;
    int speed = 0;

    void accelerate(int value){
        this.speed += value;
    }

    void deaccelerate(int value){
        this.speed -= value;
    }
}
