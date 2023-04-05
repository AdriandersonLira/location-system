package rentalCompany.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Rent> dvdsRented = new ArrayList<Rent>();

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Rent> getDvdsRented() {
        return dvdsRented;
    }

    public void addRent(Rent rent) {
        dvdsRented.add(rent);
    }

    public double getTotalValue() {
        double totalValue = 0;

        for (Rent rent: dvdsRented) {
            totalValue += rent.getRentAmount();
        }

        return totalValue;
    }

    public int getFrequentRentPoints() {
        int frequentRentPoints = 0;

        for (Rent rent: dvdsRented) {
            frequentRentPoints += rent.getFrequentRentPoints();
        }

        return frequentRentPoints;
    }
}
