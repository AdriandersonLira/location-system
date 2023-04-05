package rentalCompany.templates;

import rentalCompany.models.Client;
import rentalCompany.models.Rent;

import java.util.Iterator;

public abstract class Extract {
    protected Client client;
    protected StringBuilder document;

    public Extract(Client client) {
        this.client = client;
        this.document = new StringBuilder();
    }

    public abstract String getHeader();
    public abstract String getBody(Rent rent);
    public abstract String getFooter();

    public String extractGenerator() {
        Iterator<Rent> rents = client.getDvdsRented().iterator();

        // header do extrato
        document.append(getHeader());

        // body do extrato
        while(rents.hasNext()) {
            Rent rent = rents.next();
            document.append(getBody(rent)).append(System.getProperty("line.separator"));
        }

        // footer do extrato
        document.append(getFooter());
        document.append(System.getProperty("line.separator"));

        return document.toString();
    }
}
