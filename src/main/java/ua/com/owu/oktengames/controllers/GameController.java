package ua.com.owu.oktengames.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.oktengames.models.Game;
import ua.com.owu.oktengames.models.GameAddon;
import ua.com.owu.oktengames.models.Platform;
import ua.com.owu.oktengames.servicesImpl.GameAddonService;
import ua.com.owu.oktengames.servicesImpl.GameService;
import ua.com.owu.oktengames.servicesImpl.PlatformService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@AllArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/games")
public class GameController {

    private GameService gameService;
    private GameAddonService gameAddonService;
    private PlatformService platformService;

    @PostMapping("/add")
    public Game addGame(@RequestBody Game game){
        System.out.println(game.toString());
        gameService.saveGame(game);
        for (Platform platform : game.getPlatforms()) {
            platform.getGames().add(game);
            platformService.addPlatform(platform);
        }
        return game;
    }

    @GetMapping("/all")
    public List<Game> getAllGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/get/{id}")
    public Game getGameById(@PathVariable int id){
        return gameService.getGameById(id);
    }

    /**
     * Adds DLC games by dlcIds to main game by gameId and updates database
     * dlcIds must be a string of numbers separated by _ symbol
     *
     * @param dlcIds String of DLC games IDs separated by _ symbol
     * @param gameId ID of a game to which DLCs are being added
     */
    @GetMapping("/add/{dlcIds}/to/{gameId}")
    public void addAdditionalContent(
            @PathVariable String dlcIds,
            @PathVariable int gameId)
    {
        // game object to which DLCs are being added
        Game mainGame = gameService.getGameById(gameId);
        // to parse string of DLC IDs into String array
        String[] addonIdsStringArr = dlcIds.split("_");
        // to convert our array of String IDs into List of Integer IDs
        List<Integer> dlcIdsArray = Arrays.stream(addonIdsStringArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        // finds game object in database for each DLC Id and adds it to main game list of DLCs
        dlcIdsArray.forEach(id -> {
            GameAddon gameAddon = gameAddonService.getGameAddonById(id);
            mainGame.getAdditionalContent().add(gameAddon);
            gameAddon.setMainGame(mainGame);
        });
        gameService.saveGame(mainGame);
    }

}
