package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.oktengames.models.ConditionState;

public interface ConditionStateRepo extends JpaRepository<ConditionState, Integer> {
}
