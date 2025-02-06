package org.alfonso.infraestructure.entities;

import java.util.List;

public class ProductEntity
{
    private final String productName;
    private final Integer productId;
    private final List<TariffEntity> tariffEntityList;

    public ProductEntity(String productName, Integer productId, List<TariffEntity> tariffEntityList)
    {
        this.productName = productName;
        this.productId = productId;
        this.tariffEntityList = tariffEntityList;
    }
}
