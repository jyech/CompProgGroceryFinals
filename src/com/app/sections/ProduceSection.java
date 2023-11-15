/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.app.sections;

import com.app.assets.OrderPanel;
import com.app.main.HomePage;
import com.app.details.FoodStorage;
import com.app.details.FoodItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kirin
 */
public class ProduceSection extends javax.swing.JPanel {

    /**
     * Creates new form ProduceSection
     */
    public ProduceSection() {
        initComponents();
        
        FoodStorage.getInstance().addFoodItem(new FoodItem("1", "Apple", new ImageIcon(getClass().getResource("/com/app/images/apple.png")), 20.0, "Apple Description"));
        FoodStorage.getInstance().addFoodItem(new FoodItem("2", "Banana", new ImageIcon(getClass().getResource("/com/app/images/apple.png")), 20.0, "Apple Description"));
        FoodStorage.getInstance().addFoodItem(new FoodItem("3", "Kiwi", new ImageIcon(getClass().getResource("/com/app/images/apple.png")), 20.0, "Apple Description"));
        FoodStorage.getInstance().addFoodItem(new FoodItem("4", "Cabbage", new ImageIcon(getClass().getResource("/com/app/images/apple.png")), 20.0, "Apple Description"));
        FoodStorage.getInstance().addFoodItem(new FoodItem("5", "Potato", new ImageIcon(getClass().getResource("/com/app/images/apple.png")), 20.0, "Apple Description"));
        FoodStorage.getInstance().addFoodItem(new FoodItem("6", "Pechay", new ImageIcon(getClass().getResource("/com/app/images/apple.png")), 20.0, "Apple Description"));
        // Add more food items as needed
        
        // Initialize UI components based on the food items in FoodStorage
        initializeUI();
        
    }
    
    private void addOrderPanelToContainer(OrderPanel orderPanel) {
    ProduceSectionBG.add(orderPanel);
}

private void initializeUI() {
    List<com.app.assets.OrderPanel> foodNamePanels = Arrays.asList(ApplePanel, BananaPanel, CabbagePanel, KiwiPanel, PechayPanel, PotatoPanel);
    List<FoodItem> foodItems = FoodStorage.getInstance().getFoodItems();

    for (int i = 0; i < Math.min(foodNamePanels.size(), foodItems.size()); i++) {
        com.app.assets.OrderPanel foodNamePan = foodNamePanels.get(i);
        FoodItem foodItem = foodItems.get(i);

        foodNamePan.setFoodName(foodItem.getName());
        foodNamePan.setFoodDescription(foodItem.getDescription());
        foodNamePan.setFoodPrice(foodItem.getPrice());  // Assuming getPrice() returns a double
        foodNamePan.setOrderId(foodItem.getOrderId());
        foodNamePan.setOrderImage(foodItem.getImageIcon());  // Assuming getImageIcon() returns the ImageIcon

        // Assuming CartButton is the button that triggers "Add to Cart"
        JButton addToCartButton = foodNamePan.getCartButton();
        addToCartButton.addActionListener(new AddToCartListener(foodItem, foodNamePan));

        addOrderPanelToContainer(foodNamePan);
    }
}




    private class AddToCartListener implements ActionListener {
    private FoodItem foodItem;
    private OrderPanel orderPanel;

    public AddToCartListener(FoodItem foodItem, OrderPanel orderPanel) {
        this.foodItem = foodItem;
        this.orderPanel = orderPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the quantity from the OrderPanel
        int quantity = orderPanel.getQuantity();

        // Update the FoodItem with the obtained quantity
        foodItem.setUserQuantity(quantity);

        // Add the FoodItem to the cart
        HomePage homePage = (HomePage) SwingUtilities.getWindowAncestor(ProduceSection.this);
        homePage.addItemToCart(foodItem);
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

        ProduceSectionBG = new javax.swing.JPanel();
        FreshProduceLabel = new javax.swing.JLabel();
        ApplePanel = new com.app.assets.OrderPanel();
        BananaPanel = new com.app.assets.OrderPanel();
        KiwiPanel = new com.app.assets.OrderPanel();
        CabbagePanel = new com.app.assets.OrderPanel();
        PotatoPanel = new com.app.assets.OrderPanel();
        PechayPanel = new com.app.assets.OrderPanel();

        setPreferredSize(new java.awt.Dimension(1600, 900));

        ProduceSectionBG.setBackground(new java.awt.Color(241, 242, 237));

        FreshProduceLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        FreshProduceLabel.setText("Fresh Produce");

        javax.swing.GroupLayout ProduceSectionBGLayout = new javax.swing.GroupLayout(ProduceSectionBG);
        ProduceSectionBG.setLayout(ProduceSectionBGLayout);
        ProduceSectionBGLayout.setHorizontalGroup(
            ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                        .addComponent(FreshProduceLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                        .addGroup(ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CabbagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                                .addComponent(PotatoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(PechayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                                .addComponent(BananaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(KiwiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90))))
        );
        ProduceSectionBGLayout.setVerticalGroup(
            ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProduceSectionBGLayout.createSequentialGroup()
                        .addComponent(FreshProduceLabel)
                        .addGap(40, 40, 40)
                        .addComponent(ApplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(KiwiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BananaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(ProduceSectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CabbagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PotatoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PechayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProduceSectionBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProduceSectionBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.app.assets.OrderPanel ApplePanel;
    private com.app.assets.OrderPanel BananaPanel;
    private com.app.assets.OrderPanel CabbagePanel;
    private javax.swing.JLabel FreshProduceLabel;
    private com.app.assets.OrderPanel KiwiPanel;
    private com.app.assets.OrderPanel PechayPanel;
    private com.app.assets.OrderPanel PotatoPanel;
    private javax.swing.JPanel ProduceSectionBG;
    // End of variables declaration//GEN-END:variables
}