public ListItem<T> foo(ListItem<T> lst1, ListItem<T> lst2) {
    if (lst1 == null) {
        return bar(lst2, null);
    } else {
        ListItem<T> neu = new ListItem<>();
        neu.key = lst1.key;
        neu.next = foo(lst1.next, lst2);
        return neu;
    }
}

public ListItem<T> bar(ListItem<T> lst, ListItem<T> lstReversed) {
    if (lst == null) {
        return lstReversed;
    } else {
        ListItem<T> neu = new ListItem<>();
        neu.key = lst.key;
        neu.next = lstReversed;

        return bar(lst.next, neu);
    }
}
