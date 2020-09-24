package ua.com.owu.oktengames.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.com.owu.oktengames.models.ConditionState;
import ua.com.owu.oktengames.repo.ConditionStateRepo;
import ua.com.owu.oktengames.services.IConditionStateService;

import java.util.List;

@AllArgsConstructor
@Service
public class ConditionStateService implements IConditionStateService {

    private ConditionStateRepo conditionStaterepo;

    @Override
    public void addConditionState(ConditionState conditionState) {
        conditionStaterepo.save(conditionState);
    }

    @Override
    public List<ConditionState> getAllConditionStates() {
        return conditionStaterepo.findAll();
    }
}
