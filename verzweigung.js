public class Verzweigungen {

    public void alterPruefen(int alter) {

        /*
         * if bedeutet:
         *
         * WENN
         *
         * die Bedingung in der Klammer stimmt,
         * wird der Code darunter ausgeführt.
         */

        if (alter >= 18) {

            System.out.println("Du bist volljährig.");

        } else {

            /*
             * else bedeutet:
             *
             * SONST
             */

            System.out.println("Du bist minderjährig.");
        }
    }
}
