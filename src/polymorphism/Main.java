package polymorphism;

public class Main {
    void useCar (Car car) {
        car.driving();
        System.out.println(car.getNumOfSeets());
    }
    public static void main(String[] args) {
        Main main = new Main();
        Car car = new Toyota(); // Toyota runs in runtime.
                                // It is a dynamical binding
        main.useCar(car);
    }
}
