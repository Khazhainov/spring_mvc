package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;

@Service
public class CarService {
    private static ArrayList<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("Toyota", "Supra", 1988));
        cars.add(new Car("Subaru", "Impreza", 2010));
        cars.add(new Car("Nissan", "Silvia", 1991));
    }

    public static ArrayList<Car> getCars() {
        return cars;
    }
}
