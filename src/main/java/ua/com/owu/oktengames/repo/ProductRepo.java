package ua.com.owu.oktengames.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ua.com.owu.oktengames.models.Product;

@NoRepositoryBean
public interface ProductRepo<T extends Product> extends JpaRepository<T, Integer> {
}
