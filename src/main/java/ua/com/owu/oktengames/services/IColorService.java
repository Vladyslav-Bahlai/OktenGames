package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Color;


import java.util.List;

public interface IColorService {
    void addColor(Color color);
    List<Color> getAllColors();
}
