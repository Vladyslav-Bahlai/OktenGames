package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Gamepad;

import java.util.List;

public interface IGamepadService {
    void addGamepad(Gamepad gamepad);
    List<Gamepad> getAllGamepads();
    Gamepad getGamepadById(int id);
    boolean deleteGamepadById(int id);
}
