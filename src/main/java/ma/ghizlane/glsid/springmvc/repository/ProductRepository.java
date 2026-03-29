package ma.ghizlane.glsid.springmvc.repository;

import ma.ghizlane.glsid.springmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}