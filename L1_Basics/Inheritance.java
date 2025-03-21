//base class
class Vehicle{
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle=numberOfVehicle;

    }
    public void honk(){
        System.out.println("Honk!!!!");
    }
    public void printNoOfVehicle(){
        System.out.println(numberOfVehicle);
    }

}

//derived classes
class Car extends Vehicle{
    public Car(String numberOfCar){
        super(numberOfCar);
    }

    @Override
    public void honk(){
        System.out.println("Give me way!!");
    }
}

class Bus extends Vehicle{
    public Bus(String numberOfBus){
        super(numberOfBus);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        

        Car car=new Car("AC 4444");
        car.printNoOfVehicle();
        car.honk();

        Bus bus=new Bus("AC 8888");
        bus.printNoOfVehicle();
        bus.honk();
    }
}
