package com.learning;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this(name, price, 0);
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public boolean reserve(int quantity) {
        if (quantity <= (this.quantityStock - this.reserved)) {
            this.reserved += quantity;
            return true;
        }

        return false;
    }

    public boolean unReserve(int quantity) {
        if (quantity > this.reserved) {
            System.out.println("Error! reserve stock is less than un reserve amount " + this.name);
            return false;
        }

        this.reserved -= quantity;
        return true;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public boolean checkout(int quantity) {
        if (quantity > this.reserved) {
            System.out.println("Error! reserve stock is less than checkout amount " + this.name);
            return false;
        }

        this.reserved -= quantity;
        this.quantityStock -= quantity;

        return true;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (this == obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) {
            return 0;
        }

        if (o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ":" + this.price;
    }
}
