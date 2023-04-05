package rentalCompany.templates;

import rentalCompany.models.Client;
import rentalCompany.models.Rent;

public class Html extends Extract {
    public Html(Client client) {
        super(client);
    }

    @Override
    public String getHeader() {
        String header = "<h1>" +
                            "Registro de Alugueis referente ao cliente: " +
                            "<em>" +
                                this.client.getName() +
                            "</em>" +
                        "<h1>";
        return header;
    }

    @Override
    public String getBody(Rent rent) {
        String body = "<p>" +
                            rent.getDVD().getTitle() +
                            ": R$ " +
                            rent.getRentAmount() +
                      "</p>";
        return body;
    }

    @Override
    public String getFooter() {
        String footer = "<p>" +
                            "<h3>" +
                                "Você acumulou " +
                                    "<em>" +
                                    this.client.getFrequentRentPoints() +
                                    "pontos" +
                                    "</em>" +
                                "de alugador frequente!" +
                            "</h3>" +
                        "</p>";
        return footer;
    }
}
