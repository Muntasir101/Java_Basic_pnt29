package OOP;

public class Car {
    static String Car_name;
    static String Car_model;

    void start_car() {
        System.out.println(Car_name + " Start..");
    }

    void stop_car() {
        System.out.println(Car_name+ " Stop..");
    }

    public Car(String Car_name, String Car_model){
        Car.Car_name = Car_name;
        Car.Car_model = Car_model;
    }

    public static void main(String[] args) {
        Car BMW = new Car("BMW", "B-2024");
        //System.out.println("Car Name: "+ Car_name+" Model: "+ Car_model);
        BMW.start_car();
        BMW.stop_car();

        Car Toyota = new Car("Toyota","T2024");
        //System.out.println("Car Name: "+ Car_name+" Model: "+ Car_model);
        Toyota.start_car();
        Toyota.stop_car();

        Car Suzuki = new Car("Suzuki","S2024");
        //System.out.println("Car Name: "+ Car_name+" Model: "+ Car_model);
        Suzuki.start_car();
        Suzuki.stop_car();
    }
}
