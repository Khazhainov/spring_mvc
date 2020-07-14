package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarList(@RequestParam(value = "locale", required = false) String locale,
                               ModelMap model) {
        model.addAttribute("header", (locale != null && locale.equals("en")) ? "CARS" : "МАШИНЫ");
        model.addAttribute("brand",(locale != null && locale.equals("en")) ? "Brand" : "Бренд");
        model.addAttribute("model", (locale != null && locale.equals("en")) ? "Model" : "Модель");
        model.addAttribute("year", (locale != null && locale.equals("en")) ? "Year" : "Год");
        model.addAttribute("cars", CarService.getCars());
        return "cars";
    }
}
