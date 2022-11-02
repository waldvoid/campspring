package kodlamaio.rentACar.dataAccess.concretes;

import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //sen veritabanı erişimi nesnesisin
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        //Elinde boş bir liste olacak
        brands = new ArrayList<Brand>();
        //Dolduralım
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Fiat"));
        brands.add(new Brand(5, "Renault"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
