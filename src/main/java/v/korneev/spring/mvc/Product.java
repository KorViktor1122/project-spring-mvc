package v.korneev.spring.mvc;

public class Product {

    private Long id;
    private String title;
    private float price;
    private float voluem;

    public float getVoluem() {
        return voluem;
    }

    public void setVoluem(float voluem) {
        this.voluem = voluem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(Long id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product(){

    }
}
