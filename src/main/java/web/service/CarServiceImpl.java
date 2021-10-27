package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Honda", "Fit", 2006));
            carList.add(new Car("Mercedes-Benz", "G-Class", 2004));
            carList.add(new Car("Lexus", "LX570", 2019));
            carList.add(new Car("Toyota", "Camry", 2018));
            carList.add(new Car("Kia", "Rio", 2020));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}