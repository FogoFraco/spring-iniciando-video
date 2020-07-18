package br.com.demo.service;

import br.com.demo.dto.ProductDto;
import br.com.demo.entity.ProductEntity;
import br.com.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(ProductDto productDto) {
        ProductEntity productEntity = new ProductEntity(productDto.getName(), productDto.getPrice(),
                productDto.getDescription());

        this.productRepository.save(productEntity);


    }

    public ProductEntity get(Long id) {
        Optional<ProductEntity> productRepositoryById = this.productRepository.findById(id);
        if(productRepositoryById.isPresent()){
            return productRepositoryById.get();
        }
        return null;


    }
}
