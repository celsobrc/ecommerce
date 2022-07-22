package com.chelso.ecommerce.mapper;

import com.chelso.ecommerce.dto.ProductDto;
import com.chelso.ecommerce.entity.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductMapper {

    public Product productEntity2Dto(ProductDto dto){
        Product entity = new Product();
        entity.setName(dto.getProductName());
        entity.setImageUrl(dto.getImageUrl());
        entity.setSku(dto.getSku());
        entity.setPrice(dto.getPrice());
        entity.setDescription(dto.getDescription());
        entity.setManufacturer(dto.getManufacturer());
        entity.setFeatured(dto.isFeatured());
        return entity;
    }
}
