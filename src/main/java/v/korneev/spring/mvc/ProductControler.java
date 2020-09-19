package v.korneev.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")

public class ProductControler<CartService> {

    private CartService cartService;

    public ProductControler(CartService cartService) {
        this.cartService = cartService;
    }



}
