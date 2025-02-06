package org.alfonso.application;

import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;
import org.alfonso.domain.tariff.BrandId;
import org.alfonso.domain.tariff.Price;

import java.util.Date;

public class ProductUseCase
{
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public Price findBy(ProductId productId, Date date , BrandId brandId)
    {
        Product product = productRepository.findByProductId(productId);

        return product.findBy(date,brandId);
    }
}
