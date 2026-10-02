import java.util.Scanner;

/*
 * Scanner brauchen wir,
 * damit der Benutzer etwas über die Tastatur eingeben kann.
 */

public class Benutzereingabe {

    /*
     * Wir erstellen einen Scanner.
     *
     * System.in bedeutet:
     * Die Eingabe kommt von der Tastatur.
     */
    Scanner scanner = new Scanner(System.in);


    public void datenEinlesen() {

        // Wir geben zuerst eine Frage aus.
        System.out.print("Wie heißt du? ");

        /*
         * scanner.nextLine()
         * wartet auf eine Texteingabe.
         *
         * Die Eingabe wird anschließend
         * in der Variable name gespeichert.
         */
        String name = scanner.nextLine();


        // Jetzt fragen wir nach dem Alter.
        System.out.print("Wie alt bist du? ");

        /*
         * nextInt()
         * liest eine ganze Zahl ein.
         */
        int alter = scanner.nextInt();


        // Jetzt geben wir die gespeicherten Werte aus.

        System.out.println("Hallo " + name);

        System.out.println(
                "Du bist " + alter + " Jahre alt."
        );
    }
}
