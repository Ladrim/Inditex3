package org.alfonso.infraestructure.entities;

public class TariffEntity
{
    private final Integer brandId;
    private final Integer priority;
    private final Float price;
    private final String currency;
    private final String startDate;
    private final String finalDate;

    public TariffEntity(Integer brandId, Integer priority, Float price,
                        String currency, String startDate, String finalDate)
    {
        this.brandId = brandId;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
        this.startDate = startDate;
        this.finalDate = finalDate;
    }
}
