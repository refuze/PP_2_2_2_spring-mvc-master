package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.domain.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCarsView(ModelMap model, @RequestParam("count") Optional<Integer> quantity) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "Lada", (byte) 19));
        cars.add(new Car(2L, "BMW", (byte) 2));
        cars.add(new Car(3L, "Lada", (byte) 17));
        cars.add(new Car(4L, "BMW", (byte) 22));
        cars.add(new Car(5L, "Lada", (byte) 7));

        model.addAttribute("cars", CarService.getList(cars, quantity.orElse(5)));

        return "cars";
    }
}
