package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Game;

import java.util.List;

public interface IGameService {
    void saveGame(Game game);
    List<Game> getAllGames();
    Game getGameById(int id);
    boolean deleteGameById(int id);
}
