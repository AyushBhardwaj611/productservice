package dev.ayush.productservice.controllers;

import dev.ayush.productservice.Dtos.ExceptionDto;
import dev.ayush.productservice.Dtos.GenericProductDto;
import dev.ayush.productservice.Exceptions.NotFoundException;
import dev.ayush.productservice.models.Product;
import dev.ayush.productservice.services.FakeStoreProductService;
import dev.ayush.productservice.services.ProductService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    // @Autowired
    // feild injection
    private ProductService productService;
    // constructer injection is the best practice as it makes the code more readable
    // spring automatically uses autowired annotation on the constrocter injection

    public ProductController(@Qualifier("FakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    //setter injection
    // @Autowired
    // public void setProductService(ProductService productService) {
    // this.productService = productService;
    //


@GetMapping
public List<GenericProductDto> getAllProducts(){
        return productService.GetAllProducts();

}

@GetMapping("/{id}")
public GenericProductDto getProductById(@PathVariable("id") Long id) throws NotFoundException {
    return productService.getProductById(id);
}


@DeleteMapping ( "/{id}")
public GenericProductDto deleteProductById(@PathVariable("id") Long id) throws NotFoundException {
    return productService.deleteProductById(id);
}

@PostMapping
public GenericProductDto createProduct(@NonNull @RequestBody GenericProductDto product){
        return productService.createProduct(product);
}

@PatchMapping("{id}")
public GenericProductDto updateProductById(@PathVariable("id") Long id,@RequestBody GenericProductDto product){
        return productService.updateProductById(id, product);
}

}
