package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarsController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String getCarsView(ModelMap model, @RequestParam("count") Optional<Integer> quantity) {
        model.addAttribute("cars", carService.getList(quantity.orElse(3)));

        return "cars";
    }
}
