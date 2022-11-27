package com.example.resturantmenu.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsData implements IItemsData{
    private List<FoodItem> items;

    public ItemsData(){
        items = new ArrayList<>();
        items.add(new FoodItem("Pad Thai", "Noodles", 35));
        items.add(new FoodItem("Chicken Noodles", "Noodles", 40));
        items.add(new FoodItem("Shrimps Noodles", "Noodles", 55));
        items.add(new FoodItem("Vegetables Noodles", "Noodles", 30));
        items.add(new FoodItem("California Sushi", "Sushi", 30));
        items.add(new FoodItem("Maki Tempura", "Sushi", 35));
        items.add(new FoodItem("Shrimps Sushi", "Sushi", 40));
        items.add(new FoodItem("Sashimi Sushi", "Sushi", 50));
        items.add(new FoodItem("Diet Cola", "Drinks", 5));
        items.add(new FoodItem("Coca Cola", "Drinks", 5));
        items.add(new FoodItem("Sprite", "Drinks", 5));
        items.add(new FoodItem("Fanta", "Drinks", 5));
        items.add(new FoodItem("Water", "Drinks", 5));

    }
    @Override
    public List<String> getCategories() {
        List<String> cats = new ArrayList<>();
        cats.add("Select Item");
        cats.add("Noodles");
        cats.add("Sushi");
        cats.add("Drinks");
        return cats;
    }

    @Override
    public List<FoodItem> getItemsByCat(String cat) {
        List<FoodItem> result = new ArrayList<>();

        for(FoodItem it : items){
            if(it.getCat().equals(cat)){
                result.add(it);
            }
        }
        return result;
    }
}