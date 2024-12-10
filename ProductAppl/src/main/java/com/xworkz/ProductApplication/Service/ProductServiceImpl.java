package com.xworkz.ProductApplication.Service;

import com.xworkz.ProductApplication.productDto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public boolean validSave(ProductDto productDto) {
        return true;
    }
}
