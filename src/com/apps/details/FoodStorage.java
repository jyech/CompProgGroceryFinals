/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apps.details;
/**
 *
 * @author Kirin
 */
import java.util.ArrayList;
import java.util.List;

public class FoodStorage {
    private static FoodStorage instance;
    private List<FoodItem> foodItems;

    private FoodStorage() {
        foodItems = new ArrayList<>();
    }

    public static synchronized FoodStorage getInstance() {
        if (instance == null) {
            instance = new FoodStorage();
        }
        return instance;
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public List<FoodItem> getFoodItems() {
        return new ArrayList<>(foodItems);
    }
}
