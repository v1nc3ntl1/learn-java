package com.learning;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            if (item.reserve(quantity)){
                int inBasket = list.getOrDefault(item, 0);
                list.put(item, inBasket + quantity);
                return quantity;
            }

        }
        return 0;
    }

    public boolean unReserveItem(StockItem stockItem, int quantity){
        if ((stockItem != null) && (quantity > 0)) {
            boolean success = stockItem.unReserve(quantity);
            if (!success){
                System.out.println("Unable to unreserved item " + stockItem.getName());
                return false;
            }
            int inBasket = list.getOrDefault(stockItem, 0);
            list.put(stockItem, inBasket - quantity);
            return true;
        }

        return false;
    }

    public boolean checkout() {
        boolean success = true;
        for (Map.Entry<StockItem, Integer> item : this.list.entrySet()){
            success = item.getKey().checkout(item.getValue()) && success;
        }

        this.list.clear();
        return success;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + (list.size() == 1 ? " item " : " items ") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
