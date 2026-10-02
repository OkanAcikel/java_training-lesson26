public class DatentypKonvertierung {

    public void konvertieren() {

        /*
         * Diese 25 ist zunächst TEXT.
         */
        String zahlAlsText = "25";


        /*
         * Wir möchten aus dem Text
         *
         * "25"
         *
         * eine echte Zahl
         *
         * 25
         *
         * machen.
         */
        int zahl = Integer.parseInt(zahlAlsText);


        /*
         * Eine ganze Zahl kann automatisch
         * in eine Kommazahl umgewandelt werden.
         *
         * 25 wird also zu 25.0
         */
        double kommazahl = zahl;


        /*
         * Jetzt machen wir aus einer Kommazahl
         * wieder eine ganze Zahl.
         *
         * ACHTUNG:
         * Die Nachkommastellen werden abgeschnitten.
         */
        double wert = 12.8;

        int ganzeZahl = (int) wert;


        /*
         * Jetzt machen wir aus einer Zahl
         * wieder einen Text.
         */
        String text = String.valueOf(zahl);


        // Ergebnisse ausgeben

        System.out.println(zahl);

        System.out.println(kommazahl);

        System.out.println(ganzeZahl);

        System.out.println(text);
    }
}
