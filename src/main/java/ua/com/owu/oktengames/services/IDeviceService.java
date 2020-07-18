package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Device;

import java.util.List;

public interface IDeviceService {
    void addDevice(Device device);
    List<Device> getAllDevices();
    Device getDeviceById(int id);
    boolean deleteDeviceById(int id);
}
