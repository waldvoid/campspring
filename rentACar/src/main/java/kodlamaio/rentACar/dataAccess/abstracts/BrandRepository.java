package kodlamaio.rentACar.dataAccess.abstracts;

import kodlamaio.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
