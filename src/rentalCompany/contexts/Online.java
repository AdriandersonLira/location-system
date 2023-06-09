package rentalCompany.contexts;

public class Online extends Rating {
    private static final int ONLINE = 3;

    @Override
    public int getPriceCode() {
        int online = ONLINE;

        return online;
    }

    @Override
    public double getRentAmount(int daysRented) {
        double price = daysRented > 3
                ? daysRented * 3.0
                : daysRented * 4.0;

        return price;
    }
}
