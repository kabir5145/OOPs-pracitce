

class Vehicle{
public void drive(){
    System.out.println("repairing a vehicle ");
   }
}
class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("repairing a car");
    }
}
public class inheritance {
    public static void main(String[] args) {
         //problem 1
        Vehicle v = new Vehicle();
        v.drive();
        Car c = new Car();
        c.drive();
        
    }
}
