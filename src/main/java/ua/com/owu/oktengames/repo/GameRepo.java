package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.owu.oktengames.models.Game;

public interface GameRepo extends JpaRepository<Game, Integer> {
}
