package web.service;

import web.domain.Car;

import java.util.List;

public class CarService {

    public static List<Car> getList(List<Car> cars, int quantity) {
        return cars.stream().limit(quantity).toList();
    }
}
