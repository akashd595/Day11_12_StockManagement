package com.bridgelabz.day11_12;

public class Stock {
    private String stockName;
    private int noOfStocks;
    private double priceOfStock;
    private double totalValue;

    public double getTotalValue() {
        return totalValue;
    }
    StockPortfolio stockPortfolio = new StockPortfolio();

    public void setTotalValue() {
        this.totalValue = getNoOfStocks()*getPriceOfStock();
    }
    public Stock() {

    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfStocks() {
        return noOfStocks;
    }

    public void setNoOfStocks(int noOfStocks) {
        this.noOfStocks = noOfStocks;
    }

    public double getPriceOfStock() {
        return priceOfStock;
    }

    public void setPriceOfStock(int priceOfStock) {
        this.priceOfStock = priceOfStock;
    }
    public void Stock(){}
    public Stock(String stockName, int noOfStocks, double priceOfStock) {
        this.stockName = stockName;
        this.noOfStocks = noOfStocks;
        this.priceOfStock = priceOfStock;
    }

    @Override
    public String toString() {
        setTotalValue();
        return "Company "+stockName+"\nNumber of stocks "+noOfStocks+"\nPrice of each stock "+priceOfStock+
                "\nTotal value of stocks "+getTotalValue()+"\n\n";
    }
}
