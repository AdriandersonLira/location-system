package rentalCompany.models;

import rentalCompany.interfaces.Rentable;

public class Rent {
    private Rentable rentable;
    private int daysRented;
    private double price;

    public Rent(Rentable rentable, int daysRented) {
        this.rentable = rentable;
        this.daysRented = daysRented;
        this.price = 0;
    }

    public Rentable getDVD() {
        return rentable;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getRentAmount() {
        this.price = this.getDVD().getRentAmount(this.getDaysRented());

        return price;
    }

    public int getFrequentRentPoints() {
        return this.getDVD().getFrequentRentPoints(this.getDaysRented());
    }
}
