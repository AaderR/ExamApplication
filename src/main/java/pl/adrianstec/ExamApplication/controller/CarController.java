package pl.adrianstec.ExamApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.adrianstec.ExamApplication.model.Car;
import pl.adrianstec.ExamApplication.repository.CarRepository;
import pl.adrianstec.ExamApplication.model.ThingToDo;
import pl.adrianstec.ExamApplication.repository.ThingToDoRepository;


@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;


    @GetMapping("/")
    public String home(ModelMap map) {
        map.put("cars", carRepository.findAll());
        map.put("car", new Car());
        return "home";
    }


    @PostMapping("/cars")
    public String create(@ModelAttribute Car car) {
        carRepository.save(car);
        return "redirect:/";
    }


    @GetMapping("/cars/{id}")
    public String things(@PathVariable Integer id, ModelMap map) {
        Car car = carRepository.findById(id).get();
        map.put("car", car);
        ThingToDo thingToDo = new ThingToDo();
        thingToDo.setCar(car);
        map.put("thingToDo", thingToDo);
        return "things";

    }

    @RequestMapping("/show/{carName}")
    public String showThings(@ModelAttribute   Car car ,ThingToDoRepository thingToDoRepository, ModelMap map) {
        car.getCarName();

        ThingToDo thingToDo = car.getThings();
        map.put("thingToDo",thingToDo);
        return "things";
    }


}
