public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");
        serviceStation.check(car1);
        serviceStation.check(truck1);
        serviceStation.check(bicycle1);
        serviceStation.check(car2);
        serviceStation.check(truck2);
        serviceStation.check(bicycle2);
    }
}
