package com.learning;

public class Main {

    private static  StockList stockList = new StockList();
    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("cake", 1.10, 7);
	    stockList.addStock(temp);

        temp = new StockItem("car", 12.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
        System.out.println("**********************************************");
        Basket timsBasket = new Basket("Tim");
        reserveItem(stockList, timsBasket, "car", 1);
        System.out.println(timsBasket);

        reserveItem(stockList, timsBasket, "car", 1);
        System.out.println(timsBasket);

        if (!reserveItem(stockList, timsBasket, "cake", 4))
            System.out.println("Unable to order cake with quantity 4");


        if (!reserveItem(stockList, timsBasket, "cake", 4))
            System.out.println("Unable to order cake with quantity 4");

        System.out.println("**************unreserve items*******************");
        if (unReserveItem(stockList, timsBasket, "cake", 2)){
            System.out.println("succeeded unreserve item cake with 2 quantity");
        }
        if (unReserveItem(stockList, timsBasket, "cake", 3)){
            System.out.println("succeeded unreserve item cake with 3 quantity");
        }
        System.out.println("*************unreserve items end****************");

        if (unReserveItem(stockList, timsBasket, "transformer model", 1)){
            System.out.println("succeeded unreserve item transformer model with 1 quantity");
        }else{
            System.out.println("No item named transformer in the basket");
        }

        System.out.println("****************Tim basket****************");
        System.out.println(timsBasket);

        System.out.println("******************************");
        System.out.println("checking out shopping cart");
        timsBasket.checkout();
        System.out.println("*********end checking out cart************");
        System.out.println(stockList);
        System.out.println("****************Tim basket****************");
        System.out.println(timsBasket);
        System.out.println("****************End Tim basket****************");
    }

    public static boolean reserveItem(StockList stockList, Basket basket, String itemName, int quantity){
        StockItem item = stockList.get(itemName);
        if (item == null) {
            System.out.println("We don't sell " + itemName);
            return false;
        }
        return basket.addToBasket(item, quantity) > 0;
    }

    public static boolean unReserveItem(StockList stockList, Basket basket, String itemName, int quantity){
        StockItem item = stockList.get(itemName);
        if (item == null) {
            System.out.println("We don't sell " + itemName);
            return false;
        }

        return basket.unReserveItem(item, quantity);
    }
}
