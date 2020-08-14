package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Game;
import ua.com.owu.oktengames.models.GameAddon;

import java.util.List;

public interface IGameAddonService {
    void saveGameAddon(GameAddon gameAddon);
    List<GameAddon> getAllGameAddons();
    GameAddon getGameAddonById(int id);
    boolean deleteGameAddonById(int id);
}
