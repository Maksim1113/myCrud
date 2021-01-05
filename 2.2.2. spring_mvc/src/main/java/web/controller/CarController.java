package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count",defaultValue = "5") int count,
                          Model model){
        if (count > 0 || count < 5) {

            model.addAttribute("cars", carService.getCarsCount(count));
            return "cars";
        }else {
            model.addAttribute("cars", carService.getCars());
            return "cars";
        }
    }



}
