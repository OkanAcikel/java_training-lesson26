public static ListItem<Integer> foo(ListItem<Integer> lst1, ListItem<Integer> lst2) {
    ListItem<Integer> p1 = lst1;
    ListItem<Integer> p2 = lst2;

    // Beide Listen gleichzeitig ablaufen,
    // bis eine Liste zu Ende ist
    while (p1 != null && p2 != null) {
        p1 = p1.next;
        p2 = p2.next;
    }

    // Der Rest der längeren Liste
    ListItem<Integer> rest;
    if (p1 != null) {
        rest = p1;
    } else {
        rest = p2;
    }

    // Wenn beide gleich lang waren
    if (rest == null) {
        return null;
    }

    ListItem<Integer> head = null;
    ListItem<Integer> tail = null;

    int sum = 0;

    // Präfixsummen des Restes bilden
    while (rest != null) {
        sum += rest.key;

        ListItem<Integer> neu = new ListItem<>();
        neu.key = sum;
        neu.next = null;

        if (head == null) {
            head = neu;
            tail = neu;
        } else {
            tail.next = neu;
            tail = neu;
        }

        rest = rest.next;
    }

    return head;
}
