package com.learning;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return next;
    }

    @Override
    public ListItem previous() {
        return previous;
    }

    @Override
    public ListItem setNext(ListItem value) {
        this.next = value;
        return this.next;
    }

    @Override
    public ListItem setPrevious(ListItem value) {
        this.previous = value;
        return this.previous;
    }

    @Override
    int compareTo(ListItem value) {
        if (value != null) {
            return ((String) this.getCurrentValue()).compareTo((String) value.getCurrentValue());
        }
        return -1;
    }
}
