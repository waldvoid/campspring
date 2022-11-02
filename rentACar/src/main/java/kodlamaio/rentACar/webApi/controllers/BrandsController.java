package kodlamaio.rentACar.webApi.controllers;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation - bilgilendirme
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired // böylece newlemeden otomatik olarak kim kullanıyor bulup ona gidecek yazmasan da otomatik kullanıyor
    // yeni spring versiyonlarında ama gör diye ekledim
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    // bu isimle çağırabilsin
    @GetMapping("/getall")
    public List<Brand> getAll() {
        return brandService.getAll();
    }

}
