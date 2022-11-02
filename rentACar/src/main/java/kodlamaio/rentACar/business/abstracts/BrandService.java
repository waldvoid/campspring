package kodlamaio.rentACar.business.abstracts;

import kodlamaio.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
