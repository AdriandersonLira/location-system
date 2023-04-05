package rentalCompany.contexts;

public class Children extends Rating {
    private static final int CHILDREN = 2;
    @Override
    public int getPriceCode() {
        int children = CHILDREN;

        return children;
    }

    @Override
    public double getRentAmount(int daysRented) {
        double price = 1.5;

        price = daysRented > 3 ? (daysRented - 3) * 1.5 + price : price;

        return price;
    }
}
