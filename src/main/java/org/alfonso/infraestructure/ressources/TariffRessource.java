package org.alfonso.infraestructure.ressources;

public class TariffRessource
{
    private final Integer brandId;
    private final Integer priority;
    private final Float price;
    private final String currency;
    private final String startDate;
    private final String endDate;

    public TariffRessource(Integer brandId, Integer priority, Float price, String currency,
                           String startDate, String endDate) {
        this.brandId = brandId;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
