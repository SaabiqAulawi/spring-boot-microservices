package com.laute.microservices.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public record ProductResponse (String id, String name, String description, BigDecimal price){
//    private String id;
//    private String name;
//    private String description;
//    private BigDecimal price;
}