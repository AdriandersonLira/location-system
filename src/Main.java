import rentalCompany.models.Client;
import rentalCompany.models.Console;
import rentalCompany.models.DVD;
import rentalCompany.models.Rent;
import rentalCompany.templates.Extract;
import rentalCompany.templates.Html;
import rentalCompany.templates.Text;
import rentalCompany.utils.VideoGame;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Adrianderson Lira");

        client.addRent(new Rent(new DVD("O Atirador"        , 0), 10));
        client.addRent(new Rent(new DVD("Luca"              , 2), 2));
        client.addRent(new Rent(new DVD("O Gato de Botas 2" , 1), 30));
        client.addRent(new Rent(new DVD("Arremessando Alto" , 1), 4));
        client.addRent(new Rent(new DVD("Moana"             , 2), 10));
        client.addRent(new Rent(new DVD("Uma Noite no Museu", 1), 30));
        client.addRent(new Rent(new Console("FIFA 23"       , 2, VideoGame.XBOX_SERIES_S), 7));
        client.addRent(new Rent(new Console("Call Of Duty"  , 2, VideoGame.PS5          ), 4));

        Extract extract = new Text(client);
        System.out.println(extract.extractGenerator());

        extract = new Html(client);
        System.out.println(extract.extractGenerator());
    }
}