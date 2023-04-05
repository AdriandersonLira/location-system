package rentalCompany.contexts;

public abstract class Rating {
    public abstract int getPriceCode();

    public abstract double getRentAmount(int daysRented);

    public int getFrequentRentPoints(int daysRented) {
        return 1;
    }
}
