public class Main{
    public static void main(String[] args){
        Dog pies = new Dog();
        pies.bark();

        Car auto = new Car();
        auto.speed = 50;
        auto.accelerate(50);
        System.out.println(auto.speed);
        auto.deaccelerate(25);
        System.out.println(auto.speed);

        BankAccount konto = new BankAccount();
        konto.balance = 1000;
        konto.deposit(1500);
        System.out.println(konto.balance);
        konto.withdraw(50);
        System.out.println(konto.balance);

        Point punkt1 = new Point();
        punkt1.x = 4;
        punkt1.y = 2;

        Point punkt2 = new Point();
        punkt2.x = -3;
        punkt2.y = -6;

        System.out.println(punkt1.distance(punkt2));
    }
}