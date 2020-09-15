package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.Color;
import ua.com.owu.oktengames.repo.ColorRepo;
import ua.com.owu.oktengames.services.IColorService;

import java.util.List;
@AllArgsConstructor
@Service
public class ColorService implements IColorService {

    private ColorRepo colorRepo;

    @Override
    public void addColor(Color color) {
        colorRepo.save(color);
    }

    @Override
    public List<Color> getAllColors() {
        return colorRepo.findAll();
    }
}
