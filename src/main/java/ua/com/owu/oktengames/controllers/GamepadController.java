package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.oktengames.models.Gamepad;
import ua.com.owu.oktengames.servicesImpl.GamepadService;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class GamepadController {
    private GamepadService gamepadService;

    @PostMapping("/add-gamepad")
    public void addGamepad(@RequestBody Gamepad gamepad){
        System.out.println(gamepad.toString());
        gamepadService.addGamepad(gamepad);
    }

    @GetMapping("/all-gamepads")
    public List<Gamepad> getAllGamepads(){
        return gamepadService.getAllGamepads();
    }

    @GetMapping("/get-gamepad/{id}")
    public Gamepad getGamepadById(@PathVariable int id){
        return gamepadService.getGamepadById(id);
    }

}
