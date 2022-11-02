package kodlamaio.rentACar.business.concretes;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // sen business servis nesnesisin
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    //injection
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    // database'den alalım brandleri
    @Override
    public List<Brand> getAll() {
        // iş kuralları
        return brandRepository.getAll();
    }
}
