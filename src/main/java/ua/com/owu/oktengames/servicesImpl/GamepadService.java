package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.Gamepad;
import ua.com.owu.oktengames.repo.GamepadRepo;
import ua.com.owu.oktengames.services.IGamepadService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GamepadService implements IGamepadService {

    private GamepadRepo gamepadRepo;
    @Override
    public void addGamepad(Gamepad gamepad) {
        gamepadRepo.save(gamepad);
    }

    @Override
    public List<Gamepad> getAllGamepads() {
        return gamepadRepo.findAll();
    }

    @Override
    public Gamepad getGamepadById(int id) {
        Optional<Gamepad> gamepadOptional = gamepadRepo.findById(id);
        return gamepadOptional.orElse(null);
    }

    @Override
    public boolean deleteGamepadById(int id) {
        Optional<Gamepad> gamepadOptional = gamepadRepo.findById(id);
        if (!gamepadOptional.isPresent()) return false;
        gamepadRepo.delete(gamepadOptional.get());
        return true;
    }
}
