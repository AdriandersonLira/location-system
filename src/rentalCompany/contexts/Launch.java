package rentalCompany.contexts;

public class Launch extends Rating {
    private static final int RELEASE = 1;

    @Override
    public int getPriceCode() {
        int release = RELEASE;

        return release;
    }

    @Override
    public double getRentAmount(int daysRented) {
        double price = daysRented * 3.00;

        return price;
    }

    @Override
    public int getFrequentRentPoints(int daysRented) {
        int points = daysRented > 1
                ? 2
                : 1;

        return points;
    }
}
