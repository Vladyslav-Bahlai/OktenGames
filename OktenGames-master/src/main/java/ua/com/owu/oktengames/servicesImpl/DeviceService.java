package ua.com.owu.oktengames.servicesImpl;


import ua.com.owu.oktengames.models.Device;
import ua.com.owu.oktengames.repo.DeviceRepo;
import ua.com.owu.oktengames.services.IDeviceService;

import java.util.List;
import java.util.Optional;

public class DeviceService implements IDeviceService {
    private DeviceRepo deviceRepo;

    @Override
    public void addDevice(Device device) {
        deviceRepo.save(device);
    }

    @Override
    public List<Device> getAllDevices() {
        return deviceRepo.findAll();
    }

    @Override
    public Device getDeviceById(int id) {
        Optional<Device> deviceOptional = deviceRepo.findById(id);
        return deviceOptional.orElse(null);
    }

    @Override
    public boolean deleteDeviceById(int id) {
        Optional<Device> deviceOptional = deviceRepo.findById(id);
        if (!deviceOptional.isPresent()) return false;
        deviceRepo.delete(deviceOptional.get());
        return true;
    }
}
