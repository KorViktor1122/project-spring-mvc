package v.korneev.spring.mvc.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import v.korneev.spring.mvc.product.Product;
import v.korneev.spring.mvc.productrepository.ProductRepository;

import java.util.List;

@Component
public class ProductService {

    private ProductRepository productRepositiry;

    @Autowired

    public void ProductRepository(ProductRepository productRepositiry) {
        this.productRepositiry = productRepositiry;
    }

    public List<Product> getProducts(){
        return productRepositiry.getProducts();
    }

    public void save (Product product){
        productRepositiry.save(product);
    }

    public void removeById(Long id){
        productRepositiry.removeById(id);
    }
}
