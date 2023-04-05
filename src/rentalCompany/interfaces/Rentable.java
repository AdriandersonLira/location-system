package rentalCompany.interfaces;

public interface Rentable {
    String getTitle();
    double getRentAmount(int daysRented);
    int getFrequentRentPoints(int daysRented);
}
