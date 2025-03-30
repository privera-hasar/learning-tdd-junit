package cl.hasar.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxServiceTest {

    @Test
    public void calculateIva1000ShouldReturn190() {
        // Arrange: Given amount = 1000
        var amount = 1000L;

        // Act: When calculate IVA of amount
        var sut = new TaxService();
        var actual = sut.calculateIva(amount);

        // Assert: Then should return 1190
        var expected = 190L;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateIva100ShouldReturn19() {
        // Arrange: Given amount = 100
        var amount = 100L;

        // Act: When calculate IVA of amount
        var sut = new TaxService();
        var actual = sut.calculateIva(amount);

        // Assert: Then should return 19
        var expected = 19L;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateIva10ShouldReturn2() {
        // Arrange: Given amount = 10
        var amount = 10L;

        // Act: When calculate IVA of amount
        var sut = new TaxService();
        var actual = sut.calculateIva(amount);

        // Assert: Then should return 2
        var expected = 2L;
        Assertions.assertEquals(expected, actual);
    }
}
