package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.Platform;
import ua.com.owu.oktengames.repo.PlatformsRepo;
import ua.com.owu.oktengames.services.IPlatformService;

import java.util.List;

@Service
@AllArgsConstructor
public class PlatformService implements IPlatformService {

    private PlatformsRepo platformsRepo;

    @Override
    public void addPlatform(Platform platform) {
        platformsRepo.save(platform);
    }

    @Override
    public List<Platform> getAllPlatforms() {
        return platformsRepo.findAll();
    }
}
