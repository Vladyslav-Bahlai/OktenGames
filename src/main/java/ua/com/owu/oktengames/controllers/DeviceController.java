package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.oktengames.models.Device;
import ua.com.owu.oktengames.servicesImpl.DeviceService;
import ua.com.owu.oktengames.servicesImpl.GameService;
import ua.com.owu.oktengames.servicesImpl.GamepadService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DeviceController {
    private DeviceService deviceService;
    private GameService gameService;
    private GamepadService gamepadService;

    @PostMapping("/add-device")
    public void addDevice(@RequestBody Device device){
        System.out.println(device.toString());
        deviceService.addDevice(device);
        device.getExtraGames().forEach(game -> {
            game.setDevice(device);
            gameService.saveGame(game);
        });
        device.getGamepads().forEach(gamepad -> {
            gamepad.setDevice(device);
            gamepadService.addGamepad(gamepad);
        });
    }

    @GetMapping("/all-devices")
    public List<Device> getAllDevices(){
        return deviceService.getAllDevices();
    }

    @GetMapping("/get-devices/{id}")
    public Device getDeviceById(@PathVariable int id){
        return deviceService.getDeviceById(id);
    }
}
