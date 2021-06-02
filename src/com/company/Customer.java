package com.company;
public class Customer {
    //Editions maybe should be a list of objects so we can request different amount of various editions
    private int requrestedCount;
    private Edition requestedEdition;

    public Customer(int requrestedCount, Edition requestedEdition) {
        this.requrestedCount = requrestedCount;
        this.requestedEdition = requestedEdition;
    }

    public int getRequrestedCount() {
        return requrestedCount;
    }

    public Edition getRequestedEdition() {
        return requestedEdition;
    }

    public double incomeFromClient(){
        return this.requrestedCount * this.requestedEdition.price();
    }
}
