/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DoAn_QuanLyBanBanh.GUI;

import DoAn_QuanLyBanBanh.BUS.AccountBUS;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author nhu
 */
public class HomeGUI extends javax.swing.JFrame {
    AccountBUS taikhoan= new AccountBUS();
    /**
     * Creates new form Home
     */
    public HomeGUI() {
        initComponents();
//        this.setVisible(true);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelProduct = new javax.swing.JLabel();
        jLabelCustomer = new javax.swing.JLabel();
        jLabelSale = new javax.swing.JLabel();
        jLabelEmployee = new javax.swing.JLabel();
        jLabelPurchasing = new javax.swing.JLabel();
        jLabelStatistics = new javax.swing.JLabel();
        jLabelManufacture = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 750));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(245, 245, 187));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 700));

        jLabel2.setText("jLabel2");

        jLabelProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/cake.png"))); // NOI18N
        jLabelProduct.setText("    Sản phẩm");
        jLabelProduct.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProductMouseClicked(evt);
            }
        });

        jLabelCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/customer.png"))); // NOI18N
        jLabelCustomer.setText("     Khách hàng");
        jLabelCustomer.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCustomerMouseClicked(evt);
            }
        });

        jLabelSale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/grocery-store.png"))); // NOI18N
        jLabelSale.setText("     Bán hàng");
        jLabelSale.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSaleMouseClicked(evt);
            }
        });

        jLabelEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/clipboard.png"))); // NOI18N
        jLabelEmployee.setText("     Nhân viên");
        jLabelEmployee.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmployeeMouseClicked(evt);
            }
        });

        jLabelPurchasing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPurchasing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/cargo-truck.png"))); // NOI18N
        jLabelPurchasing.setText("     Nhập hàng");
        jLabelPurchasing.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelPurchasing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPurchasingMouseClicked(evt);
            }
        });

        jLabelStatistics.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/bar-chart.png"))); // NOI18N
        jLabelStatistics.setText("     Thống kê");
        jLabelStatistics.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStatisticsMouseClicked(evt);
            }
        });

        jLabelManufacture.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelManufacture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/enterprise.png"))); // NOI18N
        jLabelManufacture.setText("     Nhà cung cấp");
        jLabelManufacture.setPreferredSize(new java.awt.Dimension(200, 30));
        jLabelManufacture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelManufactureMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/products/Bakery-icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1050, 1050, 1050)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPurchasing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabelSale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPurchasing, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 50, 200, 700);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/products/thiet-ke-cua-hang-banh-ngot-1.png"))); // NOI18N

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(body);
        body.setBounds(200, 50, 1000, 650);

        jPanel2.setBackground(new java.awt.Color(181, 181, 112));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ CỬA HÀNG SWEET BAKERY");
        jLabel1.setPreferredSize(new java.awt.Dimension(313, 50));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DoAn_QuanLyBanBanh/IMG/menu/close.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

    }//GEN-LAST:event_jLabel10MouseClicked
//    public void switchPanel(JPanel panel) {
//        body.removeAll();
//        body.add(panel);
//        body.revalidate();
//        body.repaint();
//    }
    
    private void jLabelSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSaleMouseClicked
        
         
        jLabelSale.setOpaque(true);
        jLabelSale.setBackground(new Color(255,255,102));
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(null);
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(null);
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(null);
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(null);
         jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(null);
         jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(null);
        
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        Sale_GUI emForm = new Sale_GUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
        
    


    }//GEN-LAST:event_jLabelSaleMouseClicked

    private void jLabelProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProductMouseClicked
//        ArrayList<AccountDTO> arr = 
//        if()
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(new Color(255,255,102));
        jLabelSale.setOpaque(true); 
        jLabelSale.setBackground(null);
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(null);
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(null);
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(null);
         jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(null);
         jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(null);
       
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        Product_GUI emForm = new Product_GUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
        
         
    }//GEN-LAST:event_jLabelProductMouseClicked

    private void jLabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseClicked
        // TODO add your handling code here:
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(new Color(255,255,102));
        jLabelSale.setOpaque(true); 
        jLabelSale.setBackground(null);
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(null);
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(null);
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(null);
         jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(null);
         jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(null);
        
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        Customer_GUI emForm = new Customer_GUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
    }//GEN-LAST:event_jLabelCustomerMouseClicked

    private void jLabelEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmployeeMouseClicked
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(new Color(255,255,102));
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(null);
        jLabelSale.setOpaque(true); 
        jLabelSale.setBackground(null);
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(null);
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(null);
         jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(null);
         jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(null);
        
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        Employee_GUI emForm = new Employee_GUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
    }//GEN-LAST:event_jLabelEmployeeMouseClicked

    private void jLabelManufactureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelManufactureMouseClicked
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(new Color(255,255,102));
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(null);
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(null);
        jLabelSale.setOpaque(true); 
        jLabelSale.setBackground(null);
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(null);
        jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(null);
         jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(null);
        
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        Manufacture_GUI emForm = new Manufacture_GUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
    }//GEN-LAST:event_jLabelManufactureMouseClicked

    private void jLabelPurchasingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPurchasingMouseClicked
        // TODO add your handling code here:
        jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(new Color(255,255,102));
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(null);
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(null);
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(null);
        jLabelSale.setOpaque(true); 
        jLabelSale.setBackground(null);
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(null);
         jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(null);
        
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        Purchasing_GUI emForm = new Purchasing_GUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
    }//GEN-LAST:event_jLabelPurchasingMouseClicked

    private void jLabelStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStatisticsMouseClicked
        // TODO add your handling code here:
        jLabelStatistics.setOpaque(true);
        jLabelStatistics.setBackground(new Color(255,255,102));
        jLabelPurchasing.setOpaque(true);
        jLabelPurchasing.setBackground(null);
        jLabelManufacture.setOpaque(true);
        jLabelManufacture.setBackground(null);
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setBackground(null);
        jLabelCustomer.setOpaque(true);
        jLabelCustomer.setBackground(null);
        jLabelSale.setOpaque(true); 
        jLabelSale.setBackground(null);
        jLabelProduct.setOpaque(true);
        jLabelProduct.setBackground(null);
        
        body.removeAll();  // Remove all existing components from the body panel
        body.setLayout(new BorderLayout());  // Set the layout if not already set

        StatGUI emForm = new StatGUI();  // Create an instance of EmployeeGUI
        body.add(emForm, BorderLayout.CENTER);  // Add EmployeeGUI to the center of the body panel

        body.revalidate();  // Revalidate the panel to apply layout changes and refresh UI
        body.repaint();  // Repaint the panel to ensure the UI updates visually
    }//GEN-LAST:event_jLabelStatisticsMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginGUI lg = new LoginGUI();
        lg.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelEmployee;
    private javax.swing.JLabel jLabelManufacture;
    private javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelPurchasing;
    private javax.swing.JLabel jLabelSale;
    private javax.swing.JLabel jLabelStatistics;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}