package org.alfonso.application;

import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;

public interface ProductRepository
{
    public Product findByProductId(ProductId productId);
}
