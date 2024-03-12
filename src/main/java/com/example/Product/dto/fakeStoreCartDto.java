package com.example.Product.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter

public class fakeStoreCartDto {
    private List<fakeStoreProductDto> items;
    private double totalCost;

    public fakeStoreCartDto(List<fakeStoreProductDto> items, double totalCost, String userId) {
        this.items = items;
        this.totalCost = totalCost;
    }

    public List<fakeStoreProductDto> getItems() {
        return items;
    }

    public void setItems(List<fakeStoreProductDto> items) {
        this.items = items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    public void addItem(fakeStoreProductDto item) {
        this.items.add(item);
        this.totalCost += item.getPrice();
    }
}



