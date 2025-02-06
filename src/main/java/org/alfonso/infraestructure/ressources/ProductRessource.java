package org.alfonso.infraestructure.ressources;

import java.util.List;

public class ProductRessource
{
    private final String productName;
    private final Integer productId;
    private final List<TariffRessource> tariffRessourceList;

    public ProductRessource(String productName, Integer productId, List<TariffRessource> tariffRessourceList) {
        this.productName = productName;
        this.productId = productId;
        this.tariffRessourceList = tariffRessourceList;
    }

    public String getProductName()
    {   return productName;}

    public Integer getProductId()
    {   return productId;}

    public List<TariffRessource> getTariffRessourceList()
    {   return tariffRessourceList;}
}
