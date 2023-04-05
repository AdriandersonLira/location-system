package rentalCompany.templates;

import rentalCompany.models.Client;
import rentalCompany.models.Rent;

public class Text extends Extract {
    public Text(Client client) {
        super(client);
    }

    @Override
    public String getHeader() {
        String header = "\nRegistro de Alugueis referente ao cliente: " + this.client.getName() + "\n\n";

        return header;
    }

    @Override
    public String getBody(Rent rent) {
        String body = rent.getDVD().getTitle() + ": R$ " + rent.getRentAmount();

        return body;
    }

    @Override
    public String getFooter() {
        String footer = "\nVocê acumulou " + this.client.getFrequentRentPoints() + " pontos de alugador frequente!";

        String line = "\n\n-------------------------------------------------------------------------------------\n";

        return footer + line;
    }
}
