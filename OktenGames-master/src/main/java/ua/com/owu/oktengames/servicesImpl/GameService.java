package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.Game;
import ua.com.owu.oktengames.repo.GameRepo;
import ua.com.owu.oktengames.services.IGameService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GameService implements IGameService {

    private GameRepo gameRepo;

    public void addGame(Game game){
        gameRepo.save(game);
    }

    public List<Game> getAllGames(){
        return gameRepo.findAll();
    }

    /**
     * Return the Game object if present, otherwise return null
     */
    public Game getGameById(int id){
        Optional<Game> gameOptional = gameRepo.findById(id);
        return gameOptional.orElse(null);
    }

    /**
     * Removes Game object from database by id if it exists.
     * @return true if operation was successful, otherwise false.
     */
    public boolean deleteGameById(int id){
        Optional<Game> gameOptional = gameRepo.findById(id);
        if (!gameOptional.isPresent()) return false;
        gameRepo.delete(gameOptional.get());
        return true;
    }
}
