package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        super();
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<GetAllBrandResponse> getAll(){
        return brandService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequeste){
        brandService.add(createBrandRequeste);
    }

}
