public class NotenPruefung {

    public void notePruefen(int punkte) {

        /*
         * Zuerst wird geprüft:
         *
         * Sind mindestens 90 Punkte erreicht?
         */
        if (punkte >= 90) {

            System.out.println("Sehr gut");


        /*
         * Falls die erste Bedingung falsch war,
         * prüft Java diese Bedingung.
         */
        } else if (punkte >= 75) {

            System.out.println("Gut");


        } else if (punkte >= 50) {

            System.out.println("Bestanden");


        /*
         * Wenn keine Bedingung davor stimmt,
         * wird else ausgeführt.
         */
        } else {

            System.out.println("Nicht bestanden");
        }
    }
}
