package com.example.projectexample.sendmarket;

import java.io.Serializable;

public class Market implements Serializable {
    private String food;
    private int quantity;

    public Market (String food, int quantily){
        this.food = food;
        this.quantity = quantily;
    }

    public String getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Market{" +
                "food='" + food + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
