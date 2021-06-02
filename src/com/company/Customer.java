package com.company;

import java.util.List;

public class Customer {
    private int requrestedCount;
    private List<Edition> editions;

    public Customer(int requrestedCount, List<Edition> editions) {
        this.requrestedCount = requrestedCount;
        this.editions = editions;
    }

    public int getRequrestedCount() {
        return requrestedCount;
    }

    public List<Edition> getEditions() {
        return editions;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "requrestedCount=" + requrestedCount +
                ", editions=" + editions +
                '}';
    }

    public double calculateBookIncome(){
        double price = 0;
        for (Edition edition : editions)
        {
            price = edition.price();
        }
        return price * requrestedCount;
    }
}
