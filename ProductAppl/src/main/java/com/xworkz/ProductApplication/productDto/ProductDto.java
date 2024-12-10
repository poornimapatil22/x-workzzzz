package com.xworkz.ProductApplication.productDto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String type;
    private Double cost;
    private String manufacturer;
    private String date;
    private String warranty;

}
