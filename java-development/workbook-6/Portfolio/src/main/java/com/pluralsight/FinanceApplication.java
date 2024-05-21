package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("My Portfolio", "Aisha");

        BankAccount bankAccount = new BankAccount("Aisha", "123", 1000);
        portfolio.add(bankAccount);

        House myHouse = new House(2015, 2000, 5);
        portfolio.add(myHouse);

        Gold myGold = new Gold(40);
        portfolio.add(myGold);

        CreditCard creditCard = new CreditCard("Aisha", "456", 2000);
        portfolio.add(myGold);

        Valuable mostValuableAsset = portfolio.getMostValuable();
        System.out.println("The value of the most valuable asset is: " + mostValuableAsset.getValue());

        Valuable leastValuableAsset = portfolio.getLeastValuable();
        System.out.println("The value of the least valuable asset is: " + leastValuableAsset.getValue());
    }
}
