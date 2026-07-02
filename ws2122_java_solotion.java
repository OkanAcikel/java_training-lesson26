public class MyClass<T> {

    // Entspricht der Racket-Funktion foo
    public ListItem<Integer> foo(ListItem<Integer> lst1, ListItem<Integer> lst2) {

        // Solange beide Listen noch Elemente besitzen,
        // werden beide gleichzeitig um ein Element weitergeschoben.
        // Dadurch werden gleich viele Elemente "abgeschnitten".
        while (lst1 != null && lst2 != null) {
            lst1 = lst1.next;
            lst2 = lst2.next;
        }

        // Jetzt ist mindestens eine Liste zu Ende.

        // Sind beide gleichzeitig zu Ende,
        // waren die Listen gleich lang.
        if (lst1 == null && lst2 == null) {
            return null;        // entspricht empty in Racket
        }

        // Ist lst1 leer, war lst2 länger.
        // Dann wird für den Rest von lst2 die Ergebnisliste erzeugt.
        if (lst1 == null) {
            return bar(lst2, 0);
        }

        // Ist lst2 leer, war lst1 länger.
        return bar(lst1, 0);
    }


    // Entspricht der lokalen Racket-Funktion bar
    public ListItem<Integer> bar(ListItem<Integer> lst, int accu) {

        // Anfang der Ergebnisliste
        ListItem<Integer> head = null;

        // Zeigt immer auf das letzte Element der Ergebnisliste,
        // damit hinten angefügt werden kann.
        ListItem<Integer> tail = null;

        // Gehe die Restliste komplett durch.
        while (lst != null) {

            // Laufende Summe berechnen.
            // accu enthält immer die Summe aller bisherigen Werte.
            accu = accu + lst.key;

            // Neues Listenelement erzeugen.
            ListItem<Integer> neu = new ListItem<Integer>();
            neu.key = accu;
            neu.next = null;

            // Sonderfall:
            // Die Ergebnisliste ist noch leer.
            if (head == null) {
                head = neu;
                tail = neu;
            }
            // Normalfall:
            // Neues Element hinten anhängen.
            else {
                tail.next = neu;
                tail = neu;
            }

            // Zum nächsten Element der Eingabeliste gehen.
            lst = lst.next;
        }

        // Kopf der neuen Liste zurückgeben.
        return head;
    }
}
