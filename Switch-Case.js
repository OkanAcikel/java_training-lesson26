public class Wochentage {

    public void tagAnzeigen(int tag) {

        /*
         * Java schaut sich die Variable "tag" an.
         */
        switch (tag) {


            /*
             * Wenn tag den Wert 1 hat:
             */
            case 1:

                System.out.println("Montag");

                /*
                 * break beendet diesen Fall.
                 */
                break;


            // Wenn tag = 2
            case 2:

                System.out.println("Dienstag");

                break;


            // Wenn tag = 3
            case 3:

                System.out.println("Mittwoch");

                break;


            case 4:

                System.out.println("Donnerstag");

                break;


            case 5:

                System.out.println("Freitag");

                break;


            case 6:

                System.out.println("Samstag");

                break;


            case 7:

                System.out.println("Sonntag");

                break;


            /*
             * default wird ausgeführt,
             * wenn kein case passt.
             */
            default:

                System.out.println(
                        "Diese Zahl ist kein gültiger Wochentag."
                );
        }
    }
}
