package web.dao;

import org.springframework.stereotype.Repository;
import web.domain.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1L, "Lada", (byte) 19));
        cars.add(new Car(2L, "BMW", (byte) 2));
        cars.add(new Car(3L, "Lada", (byte) 17));
        cars.add(new Car(4L, "BMW", (byte) 22));
        cars.add(new Car(5L, "Lada", (byte) 7));
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getList(int quantity) {
        return cars.stream().limit(quantity).toList();
    }


}
