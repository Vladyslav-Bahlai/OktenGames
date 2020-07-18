package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.Gamepad;

public interface GamepadRepo extends JpaRepository<Gamepad, Integer> {
}
