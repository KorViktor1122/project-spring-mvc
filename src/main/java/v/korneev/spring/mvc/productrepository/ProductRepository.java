package v.korneev.spring.mvc.productrepository;

import org.springframework.stereotype.Component;
import v.korneev.spring.mvc.product.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void products(){
        products = new ArrayList<>();
        products.add(new Product(1L,"potatoes", 50));
        products.add(new Product(2L,"tomato", 50));
        products.add(new Product(3L,"cream",100));
        products.add(new Product(4L,"rice", 200));
    }

    public List<Product>getProducts(){
        return Collections.unmodifiableList(products);
    }

    public void save(Product product){
        products.add(product);
    }

    public void removeById(Long id){
        products.removeIf(b -> b.getId().equals(id));
    }
}
