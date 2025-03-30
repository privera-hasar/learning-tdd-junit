package cl.hasar.tdd;

import cl.hasar.tdd.abstractions.IClock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.mockito.Mockito.*;

public class DateTimeServiceTest {

    /*
     * [/] crear prueba que no compile (viernes => true)
     * [/] crear los componentes mínimos para verla fallar
     * [/] crear la interfaz IClock
     *     [ ] crear la implementación de IClock (postergar)
     *     (No interrumpas una interrupción)
     */

    private IClock clock = mock(IClock.class);

    @Test
    public void isFridayOnFridayShouldReturnTrue() {
        // Arrange: Given today is 14-03-2025
        var today = LocalDate.of(2025, 3, 14);
        when(clock.now()).thenReturn(today);

        // Act: When ask if it's friday
        var sut = new DateTimeService(clock);
        var actual = sut.isFriday();

        // Assert: Then should return true
        var expected = true;
        Assertions.assertEquals(expected, actual);
        verify(clock, times(1)).now();
    }

    @Test
    public void isFridayOnSaturdayShouldReturnFalse() {
        // Arrange: Given today is 14-03-2025
        var today = LocalDate.of(2025, 3, 16);
        when(clock.now()).thenReturn(today);

        // Act: When ask if it's friday
        var sut = new DateTimeService(clock);
        var actual = sut.isFriday();

        // Assert: Then should return false
        var expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
