package patterns;

import java.util.ArrayList;
import java.util.List;

public class FilterLesson {
    public static void main(String[] args) {
        CarF carF = new CarF(100,"green",4);
        CarF carF2 = new CarF(200,"black",2);
        CarF carF3 = new CarF(300,"blue",4);
        List<CarF> cars = new ArrayList<>();

        cars.add(carF);
        cars.add(carF2);
        cars.add(carF3);

        cars = new SpeedFilter().filter(cars);

        for(CarF car : cars) {
            System.out.println(car.getMaxSpeed());
        }




    }
}


interface CarFilter {
    List<CarF> filter (List<CarF> cars);
}

class SpeedFilter implements CarFilter{
    @Override
    public List<CarF> filter(List<CarF> cars) {
        List<CarF> list = new ArrayList<>();
        for(CarF car : cars) {
            if (car.getMaxSpeed() < 150) {
                list.add(car);
            }
        }
        return list;
    }
}

class CarF {

    public CarF(int maxSpeed, String color, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doors = doors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private int maxSpeed;
    private String color;
    private int doors;
}