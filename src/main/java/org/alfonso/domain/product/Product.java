package org.alfonso.domain.product;

import org.alfonso.domain.tariff.BrandId;
import org.alfonso.domain.tariff.Price;

import java.util.Date;
import java.util.List;

public class Product
{
    private final ProductName productName;
    private final ProductId productId;
    private final List<Price> priceList;

    public Product(ProductName productName, ProductId productId, List<Price> priceList)
    {
        this.productName = productName;
        this.productId = productId;
        this.priceList = priceList;
    }

    public Price findBy(Date date, BrandId brandId)
    {
        return null;
        //null por los loles morenos rellenos
        //fin
    }
}
