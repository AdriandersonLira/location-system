package rentalCompany.models;

import rentalCompany.contexts.*;
import rentalCompany.interfaces.Rentable;

public class DVD implements Rentable {
    private Rating rating;
    private int priceCode;
    private final String title;

    public DVD(String title, int priceCode) {
        this.title = title;
        this.setPriceCode(priceCode);
    }

    public String getTitle() {
        String title = this.title;

        return title;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case 0:
                this.rating = new Normal();
                break;
            case 1:
                this.rating = new Launch();
                break;
            case 2:
                this.rating = new Children();
                break;
            case 3:
                this.rating = new Online();
                break;
            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 0 a 2.");
        }

        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return this.rating.getPriceCode();
    }

    public double getRentAmount(int daysRented) {
        return this.rating.getRentAmount(daysRented);
    }

    public int getFrequentRentPoints(int daysRented) {
        return this.rating.getFrequentRentPoints(daysRented);
    }
}
