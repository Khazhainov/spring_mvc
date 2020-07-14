package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarList(ModelMap model, HttpServletRequest request) {
        model.addAttribute("cars", CarService.getCars());
        String header = request.getLocale().equals(Locale.ENGLISH) ? "CARS" : "МАШИНЫ";
        String brand = request.getLocale().equals(Locale.ENGLISH) ? "Brand" : "Бренд";
        String carModel = request.getLocale().equals(Locale.ENGLISH) ? "Model" : "Модель";
        String year = request.getLocale().equals(Locale.ENGLISH) ? "Year" : "Год";
        model.addAttribute("header", header);
        model.addAttribute("brand", brand);
        model.addAttribute("carModel", carModel);
        model.addAttribute("year", year);
        return "cars";
    }
}
