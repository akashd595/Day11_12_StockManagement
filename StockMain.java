package com.bridgelabz.day11_12;

import java.util.Scanner;

public class StockMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        System.out.println();
        System.out.println("Enter your choice ");

        boolean check = true;
        while(check == true){
            System.out.println("Press \n 1. add stock, \n 2. stock Value, \n 3. exit");
            byte choice = scanner.nextByte();
            switch (choice){
                case 1:
                    stockPortfolio.addNumberOfStocks();
                    break;
                case 2:
                    System.out.println(stockPortfolio.list.toString());
                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("Please choose carefully");
            }
        }
    }
}
