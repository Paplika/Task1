package lv.javaguru.OOP.InheritanceTask;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("BMW");
        car.setColour("White");
        car.setYear(1999);

        Bus bus = new Bus();
        bus.setBrand("Mersedes");
        bus.setColour("Green");
        bus.setYear(2005);
        bus.setSeatNumber(56);

        Truck truck = new Truck();
        truck.setBrand("Volvo");
        truck.setColour("Silver");
        truck.setYear(2010);
        truck.setFullMass(10000);

        System.out.println();
        System.out.println(car);
        System.out.println();
        System.out.println(bus);
        System.out.println();
        System.out.println(truck);

    }
}
