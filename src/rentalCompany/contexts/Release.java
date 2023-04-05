package rentalCompany.contexts;

public class Release extends Rating {
    private static final int RELEASE = 1;

    @Override
    public int getPriceCode() {
        int release = RELEASE;

        return release;
    }

    @Override
    public double getRentAmount(int daysRented) {
        double daysRentedCalc = daysRented * 3.00;

        return daysRentedCalc;
    }

    @Override
    public int getFrequentRentPoints(int daysRented) {
        int daysRentedCalc = daysRented > 1
                ? 2
                : 1;

        return daysRentedCalc;
    }
}
