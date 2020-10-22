package by.vyun.rewiew_question.repo;

import by.vyun.rewiew_question.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product getFirstById(Long id);

}
