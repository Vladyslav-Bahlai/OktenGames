package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.oktengames.models.ConditionState;
import ua.com.owu.oktengames.models.Device;
import ua.com.owu.oktengames.servicesImpl.ConditionStateService;
import ua.com.owu.oktengames.servicesImpl.DeviceService;


import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/devices")
public class DeviceController {
    private DeviceService deviceService;
    private ConditionStateService conditionStateService;

    @PostMapping("/add-device")
    public Device addDevice(@RequestBody Device device){
        System.out.println(device.toString());
        deviceService.addDevice(device);
        for (ConditionState conditionState : device.getConditionStates()) {
            conditionState.getDevices().add(device);
            conditionStateService.addConditionState(conditionState);
        }

        return device;
    }

    @GetMapping("/all-devices")
    public List<Device> getAllDevices(){
        return deviceService.getAllDevices();
    }

    @GetMapping("/get-devices/{id}")
    public Device getDeviceById(@PathVariable int id){
        return deviceService.getDeviceById(id);
    }
    @GetMapping("/conditionStates")
    public List<ConditionState> getAllConditionStates(ConditionState conditionState){
        return conditionStateService.getAllConditionStates();
    }
}
