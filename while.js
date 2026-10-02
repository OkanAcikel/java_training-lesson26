public class WhileSchleife {

    public void zaehlen() {

        /*
         * Wir starten bei 1.
         */
        int zahl = 1;


        /*
         * while bedeutet:
         *
         * SOLANGE die Bedingung stimmt,
         * wiederhole den Code.
         *
         * Hier:
         *
         * Solange zahl kleiner oder gleich 10 ist.
         */
        while (zahl <= 10) {

            /*
             * Aktuelle Zahl ausgeben.
             */
            System.out.println(zahl);


            /*
             * zahl++ bedeutet:
             *
             * Erhöhe zahl um 1.
             *
             * Das Gleiche wäre:
             *
             * zahl = zahl + 1;
             */
            zahl++;
        }
    }
}
