package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Service;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
        Service service = new Service();
        model.addAttribute("count", service.getCarList(count));
        return "cars";
    }
}
