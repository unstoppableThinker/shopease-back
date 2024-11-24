package com.aelio.shopease.dtos;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {

    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private String brand;
    private boolean isNewArrival;
    private Float rating;
    private UUID categoryId;
    private UUID categoryTypeId;
    private List<ProductVariantDto> variants;
    private List<ProductResourceDto> productResources;
}
