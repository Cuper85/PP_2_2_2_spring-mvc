package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final List<Car> cars = new ArrayList<>();

    public CarController() {
        cars.add(new Car("BMW", "750", 2022));
        cars.add(new Car("Audi", "A8", 2020));
        cars.add(new Car("Toyota", "Camry", 2021));
        cars.add(new Car("Mercedes", "S500", 2024));
        cars.add(new Car("Honda", "Pilot", 2022));
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        List<Car> result;
        if (count == null || count >= cars.size()) {
            result = cars;
        } else {
            result = cars.subList(0, count);
        }
        model.addAttribute("cars", result);
        return "cars";
    }
}
