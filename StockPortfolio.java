package com.bridgelabz.day11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {

    //Stock stock1 = new Stock();
    Scanner sc = new Scanner(System.in);
    ArrayList<Stock> list = new ArrayList<>();
    public void addStock(){
        System.out.println("Enter stock Name");
        String stockName = sc.next();
        System.out.println("Enter number of stock");
        int noOfStocks = sc.nextInt();
        System.out.println("Enter stock Value ");
        double priceOfStock = sc.nextDouble();

        Stock stock = new Stock(stockName, noOfStocks, priceOfStock);
        list.add(stock);
        System.out.println();
        System.out.println("Stocks added");
    }
    public void addNumberOfStocks(){
        System.out.println("Enter number of stocks you want to add");
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            addStock();
        }
    }
    public double totalStockValue(){
        double totalValue = 0;
        for (Stock stock : list){
            totalValue += stock.getNoOfStocks()*stock.getPriceOfStock();
        }
        return totalValue;
    }
}

