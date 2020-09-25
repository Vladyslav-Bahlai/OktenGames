package ua.com.owu.oktengames.repo;

import org.springframework.data.repository.NoRepositoryBean;
import ua.com.owu.oktengames.models.Product;

@NoRepositoryBean
public interface GameBaseRepo<T extends Product> extends ProductRepo<T> {
}
