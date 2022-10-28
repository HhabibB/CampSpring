package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bu sinif bir bizness nesnesidir.
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository){
        super();
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //business rules
        return brandRepository.getAll();
    }
}