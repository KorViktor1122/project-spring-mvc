package v.korneev.spring.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductControler<ProductService> {

    private ProductService productService;

    @Autowired
    public ProductControler(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product_page")
    public String showProductPage(Model model){
        List<Product> list = productService.getProducts();
        model.addAttribute("products", list);
        return "welcom to shop";
    }

    @PostMapping("/add_products")
    public String addProducts(@RequestParam String title, @RequestParam float price){
        Product product = new Product(5L,title,price);
        productService.save(product);
        return "redirect:product_page";
    }


    @GetMapping("delete_product/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.removeById(id);
        return "redirect:products_page";
    }
}
