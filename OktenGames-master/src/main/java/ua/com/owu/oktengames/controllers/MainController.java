package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.owu.oktengames.models.Game;
import ua.com.owu.oktengames.servicesImpl.GameService;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
