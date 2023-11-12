/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.app.transaction;

import com.app.assets.OrderPanel;
import com.app.details.FoodItem;
import com.app.details.FoodStorage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kirin
 */
public class CartSection extends javax.swing.JPanel implements OrderPanelListener {

    private List<CartItem> cartItems;  // List to store items in the cart

    /**
     * Creates new form CartSection
     */
    public CartSection() {
        initComponents();
        cartItems = new ArrayList<>();
    }

    @Override
    public void onAddToCart(String orderId) {
        // Retrieve the FoodItem based on the orderId
        FoodItem foodItem = getFoodItemByOrderId(orderId);

        // Add the FoodItem to the cart
        addItemToCart(foodItem);
    }

    // Add this method to find FoodItem by orderId
    private FoodItem getFoodItemByOrderId(String orderId) {
        for (FoodItem foodItem : FoodStorage.getInstance().getFoodItems()) {
            if (foodItem.getOrderId().equals(orderId)) {
                return foodItem;
            }
        }
        return null; // Return null if no matching FoodItem is found
    }

    /**
     * Method to add a new item to the cart.
     * 
     * @param foodItem The FoodItem to add.
     */
    // Modify the addItemToCart method to accept a FoodItem
    public void addItemToCart(FoodItem foodItem) {
    // Customize the order panel with the details of the food item
        OrderPanel orderPanel = new OrderPanel();
        orderPanel.setFoodName(foodItem.getName());
        orderPanel.setFoodDescription(foodItem.getDescription());
        orderPanel.setFoodPrice(foodItem.getPrice());
        orderPanel.setOrderId(foodItem.getOrderId());

        // Set the quantity based on your requirements
        orderPanel.setQuantity(1);  // Set the default quantity to 1

        // Add the order panel to the shopping cart
        add(orderPanel);

        // Refresh the layout to reflect the changes
        revalidate();
        repaint();
    }



    /**
     * Update the display of items in the cart.
     */
    private void updateCartDisplay() {
        // Clear the existing panels
        jPanel1.removeAll();

        // Add new panels for each item in the cart
        for (CartItem cartItem : cartItems) {
            OrderPanel orderPanel = new OrderPanel();
            orderPanel.setFoodName(cartItem.getFoodItem().getName());
            orderPanel.setFoodDescription(cartItem.getFoodItem().getDescription());
            orderPanel.setFoodPrice(cartItem.getFoodItem().getPrice());
            orderPanel.setOrderId(cartItem.getFoodItem().getOrderId());
            orderPanel.setQuantity(cartItem.getQuantity());  // You need to add a method to set the quantity in OrderPanel
            jPanel1.add(orderPanel);
        }

        // Refresh the layout to reflect the changes
        revalidate();
        repaint();
    }
    
    public void displayOrders() {
    System.out.println("Cart Contents:");

        for (CartItem cartItem : cartItems) {
            FoodItem foodItem = cartItem.getFoodItem();
            System.out.println("Order ID: " + foodItem.getOrderId());
            System.out.println("Food Name: " + foodItem.getName());
            System.out.println("Food Price: " + foodItem.getPrice());
            System.out.println("Quantity: " + cartItem.getQuantity());
            System.out.println("------------");
        }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setPreferredSize(new java.awt.Dimension(1600, 900));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1240, 320));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(591, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
