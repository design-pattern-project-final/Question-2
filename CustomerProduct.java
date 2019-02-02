package sample;

import java.util.ArrayList;
import java.util.List;

public class CustomerProduct implements Product
{
    private String name;
    private double price;
    private int quantity;
    @Override
    public String getName() {
        return name ;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public void addProduct(Product product){
        List<Product> items = new ArrayList<>();
        items.add(product);
    }


}
