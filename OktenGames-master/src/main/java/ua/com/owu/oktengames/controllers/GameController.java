package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.oktengames.models.Game;
import ua.com.owu.oktengames.servicesImpl.GameService;

import java.util.List;

@RestController
@AllArgsConstructor
public class GameController {

    private GameService gameService;

    @PostMapping("/add-game")
    public void addGame(@RequestBody Game game){
        System.out.println(game.toString());
        gameService.addGame(game);
    }

    @GetMapping("/all-games")
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/get-game/{id}")
    public Game getGameById(@PathVariable int id){
        return gameService.getGameById(id);
    }

}
