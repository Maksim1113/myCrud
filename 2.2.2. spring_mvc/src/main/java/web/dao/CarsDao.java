package web.dao;

import org.springframework.stereotype.Component;
import web.models.CarModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDao {
    List<CarModel> cars;

    public CarsDao() {
        cars = new ArrayList<>();
        cars.add(new CarModel(1, "ferrari", "A345TP"));
        cars.add(new CarModel(2, "lada", "A340BB"));
        cars.add(new CarModel(3, "dodge", "A345TP"));
        cars.add(new CarModel(4, "fiat", "A345TP"));
        cars.add(new CarModel(5, "lotus", "A345TP"));
    }

    public List<CarModel> getCars() {
        return cars;
    }
    public List<CarModel> getCarsCount(int count){
        List<CarModel> carsNew = new ArrayList<>();
        carsNew = cars.stream().limit(count).collect(Collectors.toList());
        return carsNew;


    }
}
