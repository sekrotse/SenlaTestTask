package by.senla.rest.senlarest.controller;

import by.senla.rest.senlarest.entity.Product;
import by.senla.rest.senlarest.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    public static final String APPLICATION_JSON = "application/json";
    public static final String ID_MAPPING = "/{id}";
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(produces = APPLICATION_JSON)
    public List<Product> getAllProduct() {
        return productService.findAll();
    }

    @GetMapping(path = ID_MAPPING, produces = APPLICATION_JSON)
    public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        return productService.findById(id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = APPLICATION_JSON)
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product) {
        productService.save(product);
    }
}
