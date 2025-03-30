package cl.hasar.tdd;

import cl.hasar.tdd.abstractions.IClock;

import java.time.DayOfWeek;

public class DateTimeService {

    private IClock clock;

    public DateTimeService(IClock clock) {
        this.clock = clock;
    }

    public boolean isFriday() {
        return clock.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }
}
