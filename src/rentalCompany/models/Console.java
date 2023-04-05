package rentalCompany.models;

import rentalCompany.contexts.*;
import rentalCompany.interfaces.Rentable;
import rentalCompany.utils.VideoGame;

public class Console implements Rentable {
    private Rating rating;
    private int priceCode;
    private final String title;
    private VideoGame videoGame;

    public Console(String title, int priceCode, VideoGame videoGame) {
        this.priceCode = priceCode;
        this.title = title;
        this.videoGame = videoGame;
        this.setPriceCode(priceCode);
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    private void setPriceCode(int priceCode) {
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

    @Override
    public double getRentAmount(int daysRented) {
        return this.rating.getRentAmount(daysRented);
    }

    @Override
    public int getFrequentRentPoints(int daysRented) {
        return this.rating.getFrequentRentPoints(daysRented);
    }
}
