package com.learning;

public abstract class ListItem {
    protected ListItem next;
    protected ListItem previous;
    private Object currentValue;

    public ListItem(Object value) {
        this.currentValue = value;
    }

    public abstract ListItem next();

    public abstract ListItem previous();

    public abstract ListItem setNext(ListItem value);

    public abstract ListItem setPrevious(ListItem value);

    abstract int compareTo(ListItem value);

    public Object getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Object currentValue) {
        this.currentValue = currentValue;
    }
}
