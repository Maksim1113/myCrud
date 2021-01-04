package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.CarModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private CarsDao carsDao;

    @Autowired
    public CarService(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public List<CarModel> getCars(){
        return carsDao.getCars();
    }

    public List<CarModel> getCarsCount(int count){

        return carsDao.getCarsCount(count);

    }
}
