package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.Device;

public interface DeviceRepo extends JpaRepository<Device, Integer> {
}
