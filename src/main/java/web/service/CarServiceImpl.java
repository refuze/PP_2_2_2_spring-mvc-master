package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.domain.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    CarDao carDao;

    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> getList(int quantity) {
        return carDao.getList(quantity);
    }
}
