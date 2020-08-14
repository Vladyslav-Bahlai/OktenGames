package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.Platform;

public interface PlatformsRepo extends JpaRepository<Platform, Integer> {
}
