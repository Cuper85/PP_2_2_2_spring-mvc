package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("BMW", "750", 2022));
        cars.add(new Car("Audi", "A8", 2020));
        cars.add(new Car("Toyota", "Camry", 2021));
        cars.add(new Car("Mercedes", "S500", 2024));
        cars.add(new Car("Honda", "Pilot", 2022));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}


