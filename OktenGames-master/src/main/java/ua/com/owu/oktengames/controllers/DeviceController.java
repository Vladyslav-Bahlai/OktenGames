package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ua.com.owu.oktengames.models.Device;
import ua.com.owu.oktengames.servicesImpl.DeviceService;

import java.util.List;

@RestController
@AllArgsConstructor
public class DeviceController {
    private DeviceService deviceService;

    @PostMapping("/add-device")
    public void addGame(@RequestBody Device device){
        System.out.println(device.toString());
        deviceService.addDevice(device);
    }

    @GetMapping("/all-devices")
    public List<Device> getAllGames(){
        return deviceService.getAllDevices();
    }

    @GetMapping("/get-devices/{id}")
    public Device getGameById(@PathVariable int id){
        return deviceService.getDeviceById(id);
    }
}
