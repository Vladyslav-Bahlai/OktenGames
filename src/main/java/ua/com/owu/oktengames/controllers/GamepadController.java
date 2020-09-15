package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.oktengames.models.Color;
import ua.com.owu.oktengames.models.ConditionState;
import ua.com.owu.oktengames.models.Gamepad;
import ua.com.owu.oktengames.servicesImpl.ColorService;
import ua.com.owu.oktengames.servicesImpl.GamepadService;

import java.util.List;


@RestController
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/gamepads")
public class GamepadController {
    private GamepadService gamepadService;
    private ColorService colorService;

    @PostMapping("/add-gamepad")
    public void addGamepad(@RequestBody Gamepad gamepad) {
        System.out.println(gamepad.toString());
        gamepadService.addGamepad(gamepad);
    }

    @GetMapping("/all-gamepads")
    public List<Gamepad> getAllGamepads() {
        return gamepadService.getAllGamepads();
    }

    @GetMapping("/get-gamepad/{id}")
    public Gamepad getGamepadById(@PathVariable int id) {
        return gamepadService.getGamepadById(id);
    }

    @GetMapping("/colors")
    public List<Color> getAllColors(Color color) {
        return colorService.getAllColors();
    }
}
