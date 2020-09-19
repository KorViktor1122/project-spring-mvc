package v.korneev.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")

public class ProductControler<CartService> {

    private CartService cartService;

    public ProductControler(CartService cartService) {
        this.cartService = cartService;
    }

//    @GetMapping("/products")
//    public String getAllproducts (Product product){
//        product.
//    }
//
//    @PostMapping("/add")
//    public String addProducts(Product product){
//        cartService.
//        return "redirect:/products/all";
//    }

}
