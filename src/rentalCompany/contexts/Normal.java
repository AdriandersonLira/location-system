package rentalCompany.contexts;

public class Normal extends Rating {
    private static final int NORMAL = 0;

    @Override
    public int getPriceCode() {
        int normal = NORMAL;

        return normal;
    }

    @Override
    public double getRentAmount(int daysRented) {
        double price = 2.0;

        if (daysRented > 2) {
            price += (daysRented - 2) * 1.5;
        }

        return price;
    }
}
