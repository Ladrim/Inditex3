package org.alfonso.infraestructure;

import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;
import org.alfonso.domain.product.ProductName;
import org.alfonso.domain.tariff.Price;
import org.alfonso.infraestructure.ressources.ProductRessource;

import java.util.Arrays;
import java.util.List;

public class ProductAdapter
{
    private Product ressourceToDomain(ProductRessource productRessource)
    {
        ProductName productName = new ProductName(productRessource.getProductName());
        ProductId productId = new ProductId(productRessource.getProductId());


        List<Price> priceList = Arrays.asList();

        return new Product(productName,productId,priceList);
    }

    //EN LA TAREA2 SE HACEN 2 CAMBIOS
    //EN LA TAREA2 SE HACEN 3 CAMBIOS

}
