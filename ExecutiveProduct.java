package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ExecutiveProduct implements Product
{
    private String name;
    private double price;
    public int quantity;

    public ExecutiveProduct(){
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public ExecutiveProduct(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
