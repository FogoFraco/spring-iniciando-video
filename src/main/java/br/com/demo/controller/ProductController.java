package br.com.demo.controller;

import br.com.demo.dto.ProductDto;
import br.com.demo.entity.ProductEntity;
import br.com.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/save")
    public void save(@RequestBody ProductDto productDto){
        this.productService.save(productDto);
    }

    @GetMapping(value = "/get/{id}")
    public ProductEntity get(@PathVariable("id") Long id){
       return this.productService.get(id);
    }



}
