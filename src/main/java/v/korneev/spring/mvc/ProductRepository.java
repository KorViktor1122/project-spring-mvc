package v.korneev.spring.mvc;

import org.springframework.stereotype.Component;

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
        products.add(new Product(2L,"potatoes", 50));
        products.add(new Product(3L,"cream",100));
        products.add(new Product(4L,"rice", 200));
    }

    public List<Product> getProducts(){
        return Collections.unmodifiableList(products);
    }

    public void save (Product product){
        products.add(product);
    }

    public void removeById (Long id){
        products.removeIf(b -> b.getId().equals(id));
    }
}
