package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.Genre;

public interface GenreRepo extends JpaRepository<Genre, Integer> {
}
