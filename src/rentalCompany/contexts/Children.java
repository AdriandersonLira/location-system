package rentalCompany.contexts;

public class Kids extends Rating {
    private static final int KIDS = 2;
    @Override
    public int getPriceCode() {
        int kids = KIDS;
        
        return kids;
    }

    @Override
    public double getRentAmount(int daysRented) {
        double price = 1.5;

        price = daysRented > 3 ? (daysRented * 3) * 1.5 : price;

        return price;
    }
}
