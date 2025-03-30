package cl.hasar.tdd;

public class TaxService {

    public long calculateIva(long amount) {
        return Math.round(amount * 0.19);
    }
}
