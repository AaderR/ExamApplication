package pl.adrianstec.ExamApplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.adrianstec.ExamApplication.model.Car;
import pl.adrianstec.ExamApplication.model.ThingToDo;
import pl.adrianstec.ExamApplication.repository.ThingToDoRepository;

@Controller
public class ThingToDoController {

    @Autowired
    private ThingToDoRepository thingsToDoRepository;

    @PostMapping("/things")
    public String create(@ModelAttribute ThingToDo thingToDo){
        thingsToDoRepository.save(thingToDo);
        return"redirect:/";
    }


}
