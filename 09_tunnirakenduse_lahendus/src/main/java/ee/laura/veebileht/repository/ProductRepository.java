package ee.laura.veebileht.repository;

import ee.laura.veebileht.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
