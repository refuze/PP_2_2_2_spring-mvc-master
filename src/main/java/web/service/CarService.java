package web.service;

import web.domain.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> getList(int quantity);
}
