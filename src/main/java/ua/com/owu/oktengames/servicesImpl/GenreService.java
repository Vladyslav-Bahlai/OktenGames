package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.Genre;
import ua.com.owu.oktengames.repo.GenreRepo;
import ua.com.owu.oktengames.services.IGenreService;

import java.util.List;

@Service
@AllArgsConstructor
public class GenreService implements IGenreService {

    private GenreRepo genreRepo;

    @Override
    public void addGenre(Genre genre) {
        genreRepo.save(genre);
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepo.findAll();
    }
}
