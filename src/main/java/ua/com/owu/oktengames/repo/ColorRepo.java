package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.Color;

public interface ColorRepo extends JpaRepository<Color, Integer> {
}
