/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.app.sections;

import com.app.assets.CategoryPanel;
import com.app.main.HomePage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kirin
 */
public class CategorySection extends javax.swing.JPanel {

    /**
     * Creates new form CategorySection
     */
    public CategorySection() {
        initComponents();
        ProduceCategory.setCategoryName("Fresh Produce");
        BeverageCategory.setCategoryName("Beverages");
        SnackCategory.setCategoryName("Snacks");
        MeatCategory.setCategoryName("Meat");
        SeafoodCategory.setCategoryName("Seafood");
        
        // Set images for each category
        ProduceCategory.setCategoryImage("/com/app/images/freshproduce.jpg");
        BeverageCategory.setCategoryImage("/com/app/images/beverages.jpg");
        SnackCategory.setCategoryImage("/com/app/images/snacks.jpg");
        MeatCategory.setCategoryImage("/com/app/images/meat.jpg");
        SeafoodCategory.setCategoryImage("/com/app/images/seafood.jpg");
        
        ProduceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call a method in NewJFrame to switch to newpanel2
                ((HomePage) SwingUtilities.getWindowAncestor(CategorySection.this)).switchToProduceSection();
            }
        });
        
        BeverageButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Call a method in HomePage to switch to BeverageCard
            ((HomePage) SwingUtilities.getWindowAncestor(CategorySection.this)).switchToBeverageSection();
            }
        });
        
        SnackButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Call a method in HomePage to switch to BeverageCard
            ((HomePage) SwingUtilities.getWindowAncestor(CategorySection.this)).switchToSnackSection();
            }
        });
        
        MeatButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Call a method in HomePage to switch to BeverageCard
            ((HomePage) SwingUtilities.getWindowAncestor(CategorySection.this)).switchToMeatSection();
            }
        });

        SeafoodButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Call a method in HomePage to switch to BeverageCard
            ((HomePage) SwingUtilities.getWindowAncestor(CategorySection.this)).switchToSeafoodSection();
            }
        });


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CategorySectionBG = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ProducePanel = new javax.swing.JPanel();
        ProduceCategory = new com.app.assets.CategoryPanel();
        ProduceButton = new com.app.assets.CustomButton();
        BeveragePanel = new javax.swing.JPanel();
        BeverageCategory = new com.app.assets.CategoryPanel();
        BeverageButton = new com.app.assets.CustomButton();
        SnackPanel = new javax.swing.JPanel();
        SnackCategory = new com.app.assets.CategoryPanel();
        SnackButton = new com.app.assets.CustomButton();
        MeatPanel = new javax.swing.JPanel();
        MeatCategory = new com.app.assets.CategoryPanel();
        MeatButton = new com.app.assets.CustomButton();
        SeafoodPanel = new javax.swing.JPanel();
        SeafoodCategory = new com.app.assets.CategoryPanel();
        SeafoodButton = new com.app.assets.CustomButton();

        setPreferredSize(new java.awt.Dimension(1600, 900));

        CategorySectionBG.setBackground(new java.awt.Color(241, 242, 237));
        CategorySectionBG.setMaximumSize(new java.awt.Dimension(1600, 900));
        CategorySectionBG.setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Browse by Category");

        ProducePanel.setBackground(new java.awt.Color(241, 242, 237));

        ProduceButton.setText("Fresh Produce");
        ProduceButton.setPreferredSize(new java.awt.Dimension(220, 320));

        javax.swing.GroupLayout ProducePanelLayout = new javax.swing.GroupLayout(ProducePanel);
        ProducePanel.setLayout(ProducePanelLayout);
        ProducePanelLayout.setHorizontalGroup(
            ProducePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProducePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProduceButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(ProducePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProducePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProduceCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        ProducePanelLayout.setVerticalGroup(
            ProducePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProducePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProduceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ProducePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProducePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ProduceCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        BeveragePanel.setBackground(new java.awt.Color(241, 242, 237));

        BeverageButton.setText("Fresh Produce");
        BeverageButton.setPreferredSize(new java.awt.Dimension(220, 320));

        javax.swing.GroupLayout BeveragePanelLayout = new javax.swing.GroupLayout(BeveragePanel);
        BeveragePanel.setLayout(BeveragePanelLayout);
        BeveragePanelLayout.setHorizontalGroup(
            BeveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeveragePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BeverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(BeveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BeveragePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BeverageCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BeveragePanelLayout.setVerticalGroup(
            BeveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeveragePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BeverageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BeveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BeveragePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BeverageCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        SnackPanel.setBackground(new java.awt.Color(241, 242, 237));

        SnackButton.setText("Fresh Produce");
        SnackButton.setPreferredSize(new java.awt.Dimension(220, 320));

        javax.swing.GroupLayout SnackPanelLayout = new javax.swing.GroupLayout(SnackPanel);
        SnackPanel.setLayout(SnackPanelLayout);
        SnackPanelLayout.setHorizontalGroup(
            SnackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SnackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SnackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(SnackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SnackPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SnackCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        SnackPanelLayout.setVerticalGroup(
            SnackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SnackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SnackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SnackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SnackPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SnackCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        MeatPanel.setBackground(new java.awt.Color(241, 242, 237));

        MeatButton.setText("Fresh Produce");
        MeatButton.setPreferredSize(new java.awt.Dimension(220, 320));

        javax.swing.GroupLayout MeatPanelLayout = new javax.swing.GroupLayout(MeatPanel);
        MeatPanel.setLayout(MeatPanelLayout);
        MeatPanelLayout.setHorizontalGroup(
            MeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MeatButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(MeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MeatPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MeatCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MeatPanelLayout.setVerticalGroup(
            MeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MeatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MeatButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MeatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MeatPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MeatCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        SeafoodPanel.setBackground(new java.awt.Color(241, 242, 237));

        SeafoodButton.setText("Fresh Produce");
        SeafoodButton.setPreferredSize(new java.awt.Dimension(220, 320));

        javax.swing.GroupLayout SeafoodPanelLayout = new javax.swing.GroupLayout(SeafoodPanel);
        SeafoodPanel.setLayout(SeafoodPanelLayout);
        SeafoodPanelLayout.setHorizontalGroup(
            SeafoodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeafoodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeafoodButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(SeafoodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SeafoodPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SeafoodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        SeafoodPanelLayout.setVerticalGroup(
            SeafoodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SeafoodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SeafoodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SeafoodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SeafoodPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SeafoodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout CategorySectionBGLayout = new javax.swing.GroupLayout(CategorySectionBG);
        CategorySectionBG.setLayout(CategorySectionBGLayout);
        CategorySectionBGLayout.setHorizontalGroup(
            CategorySectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategorySectionBGLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(CategorySectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CategorySectionBGLayout.createSequentialGroup()
                        .addComponent(ProducePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BeveragePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(SnackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(MeatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(SeafoodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CategorySectionBGLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        CategorySectionBGLayout.setVerticalGroup(
            CategorySectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategorySectionBGLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addGap(111, 111, 111)
                .addGroup(CategorySectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeafoodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CategorySectionBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BeveragePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProducePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SnackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MeatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CategorySectionBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CategorySectionBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.app.assets.CustomButton BeverageButton;
    private com.app.assets.CategoryPanel BeverageCategory;
    private javax.swing.JPanel BeveragePanel;
    private javax.swing.JPanel CategorySectionBG;
    private com.app.assets.CustomButton MeatButton;
    private com.app.assets.CategoryPanel MeatCategory;
    private javax.swing.JPanel MeatPanel;
    private com.app.assets.CustomButton ProduceButton;
    private com.app.assets.CategoryPanel ProduceCategory;
    private javax.swing.JPanel ProducePanel;
    private com.app.assets.CustomButton SeafoodButton;
    private com.app.assets.CategoryPanel SeafoodCategory;
    private javax.swing.JPanel SeafoodPanel;
    private com.app.assets.CustomButton SnackButton;
    private com.app.assets.CategoryPanel SnackCategory;
    private javax.swing.JPanel SnackPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
