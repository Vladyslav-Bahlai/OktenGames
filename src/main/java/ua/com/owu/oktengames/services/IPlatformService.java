package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Platform;

import java.util.List;

public interface IPlatformService {
    void addPlatform(Platform platform);
    List<Platform> getAllPlatforms();
}
