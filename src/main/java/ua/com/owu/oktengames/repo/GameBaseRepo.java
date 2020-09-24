package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ua.com.owu.oktengames.models.GameBase;

@NoRepositoryBean
public interface GameBaseRepo <T extends GameBase>
        extends JpaRepository <T, Integer> {
}
