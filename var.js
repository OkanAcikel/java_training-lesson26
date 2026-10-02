public class Variablen {

    /*
     * Eine Variable ist wie eine kleine Box.
     * In dieser Box können wir einen Wert speichern.
     *
     * Jede Variable braucht:
     * 1. einen Datentyp
     * 2. einen Namen
     * 3. meistens einen Wert
     */

    // int = ganze Zahl
    int alter = 18;

    // double = Kommazahl
    double preis = 12.50;

    // boolean = nur true oder false
    boolean bestanden = true;

    // char = genau EIN Zeichen
    // Zeichen stehen in einfachen Anführungszeichen
    char note = 'A';

    // String = Text
    // Texte stehen in doppelten Anführungszeichen
    String name = "Anna";


    public void anzeigen() {

        // System.out.println gibt etwas auf dem Bildschirm aus.

        System.out.println("Name: " + name);

        System.out.println("Alter: " + alter);

        System.out.println("Preis: " + preis + " Euro");

        System.out.println("Bestanden: " + bestanden);

        System.out.println("Note: " + note);
    }
}
