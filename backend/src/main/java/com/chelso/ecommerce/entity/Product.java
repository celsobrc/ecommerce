package com.chelso.ecommerce.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String sku;
    @Column(name = "image_url")
    private String imageUrl;
    //TODO: Relationship with category
    //TODO: Relationship with product attribute
    private Integer quantity;
    private String manufacturer;
    private boolean featured;
    // TODO: 21/07/2022 add relationship with product rating;
    private boolean deleted;
    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

}
