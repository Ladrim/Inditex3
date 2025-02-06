package org.alfonso.domain.tariff;

public class Price
{
    private final BrandId brandId;
    private final Priority priority;
    private final Money money;
    private final Currency currency;

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    private final DateInterval dateInterval;

    public Price(BrandId brandId, Priority priority, Money money, Currency currency, DateInterval dateInterval)
    {
        this.brandId = brandId;
        this.priority = priority;
        this.money = money;
        this.currency = currency;
        this.dateInterval = dateInterval;
    }

}
