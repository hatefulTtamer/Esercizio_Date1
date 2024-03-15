/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateString1 = date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateString2 = date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateString3 = date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Data 1: " + dateString1);
        System.out.println("Data 2: " + dateString2);
        System.out.println("Data 3: " + dateString3);

    }
}