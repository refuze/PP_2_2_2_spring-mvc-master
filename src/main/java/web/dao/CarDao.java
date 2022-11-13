package web.dao;

import web.domain.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarDao {

    void add(Car car);

    List<Car> getList(int quantity);
}
