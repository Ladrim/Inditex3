package org.alfonso.domain.tariff;

import java.util.Date;

public class DateInterval
{
    private final Date startDate;
    private final Date endDate;

    public DateInterval(Date startDate, Date endDate)
    {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isInTheInterval(Date date)
    {
        return !(startDate.before(date)|| endDate.after(date));
    }
}
