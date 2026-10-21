public class TestAuto {
    public static void main(String[] args){
        Auto samochod = null;
        try{
        System.out.println(samochod.brand);}
        catch(NullPointerException e){
            System.out.println("Car jest null");
        }
    }
}
