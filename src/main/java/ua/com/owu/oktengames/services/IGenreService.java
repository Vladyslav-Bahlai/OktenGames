package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Genre;

import java.util.List;

public interface IGenreService {
    void addGenre(Genre genre);
    List<Genre> getAllGenres();
}
