package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.Game;
import ua.com.owu.oktengames.models.GameAddon;
import ua.com.owu.oktengames.repo.GameAddonRepo;
import ua.com.owu.oktengames.services.IGameAddonService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GameAddonService implements IGameAddonService {

    private GameAddonRepo gameAddonRepo;

    @Override
    public void saveGameAddon(GameAddon gameAddon) {
        gameAddonRepo.save(gameAddon);
    }

    @Override
    public List<GameAddon> getAllGameAddons() {
        return gameAddonRepo.findAll();
    }

    /**
     * Return the GameAddon object if present, otherwise return null
     */
    @Override
    public GameAddon getGameAddonById(int id) {
        Optional<GameAddon> gameOptional = gameAddonRepo.findById(id);
        return gameOptional.orElse(null);
    }

    /**
     * Removes GameAddon object from database by id if it exists.
     * @return true if operation was successful, otherwise false.
     */
    @Override
    public boolean deleteGameAddonById(int id) {
        GameAddon gameAddon = getGameAddonById(id);
        if (gameAddon == null) return false;
        gameAddonRepo.delete(gameAddon);
        return true;
    }
}
