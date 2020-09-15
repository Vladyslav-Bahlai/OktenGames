package ua.com.owu.oktengames.services;

import ua.com.owu.oktengames.models.Color;
import ua.com.owu.oktengames.models.ConditionState;

import java.util.List;

public interface IConditionStateService {
    void addConditionState(ConditionState conditionState);
    List<ConditionState> getAllConditionStates();
}
