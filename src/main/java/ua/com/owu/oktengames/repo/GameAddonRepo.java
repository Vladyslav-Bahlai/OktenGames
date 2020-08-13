package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.GameAddon;

public interface GameAddonRepo extends JpaRepository<GameAddon, Integer> {
}
