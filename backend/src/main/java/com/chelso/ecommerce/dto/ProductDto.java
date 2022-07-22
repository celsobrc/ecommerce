package com.chelso.ecommerce.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ProductDto implements Serializable {
    private String productName;
    private String imageUrl;
    private String sku;
    private BigDecimal price;
    private String description;
    private String manufacturer;
    // TODO: 21/07/2022 add relationship with product availability
    private boolean featured;
    // TODO: 21/07/2022 add relationship with product rating Dto list

}
