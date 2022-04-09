/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.awt.Image;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Computers-way
 */
public class HomePage extends javax.swing.JFrame {

    
    
    DefaultTableModel model;
    ArrayList<Integer> total = new ArrayList<Integer>();
    int count = 0;
    int ID;
    String Username;
    OfflinePayment payment;
    int price = 0;
    public HomePage() {
        initComponents();
        showMenProducts();
        showJewelleryProducts();
        showWomenProducts();
        showKidsProducts();
    }

    
    
    public HomePage(int id, String username){
        initComponents();
        this.ID = id;
        this.Username = username;
        showMenProducts();
        showJewelleryProducts();
        showWomenProducts();
        showKidsProducts();
    }
    
    public int getTotalPrice(){
        
        for(int i = 0; i < total.size(); i++){
            price = price + total.get(i);
        }
        
        return price;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upperpanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        rightpanel = new javax.swing.JPanel();
        cartpanel = new javax.swing.JPanel();
        lbl_img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carttable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        totalpricefield = new javax.swing.JTextField();
        confirmbtn = new javax.swing.JButton();
        removebtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        onlinepaymentpanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cardnumberfield = new javax.swing.JTextField();
        cardcontinuebtn = new javax.swing.JButton();
        offlinepaymentpanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        addressfield = new javax.swing.JTextField();
        addresscontinuebtn = new javax.swing.JButton();
        invoicepanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        leftpanel = new javax.swing.JPanel();
        menpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mentable = new javax.swing.JTable();
        menaddtocartbtn = new javax.swing.JButton();
        menqtyfield = new javax.swing.JTextField();
        menplusbtn = new javax.swing.JButton();
        menminusbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        womenpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        womenminusbtn = new javax.swing.JButton();
        womenqtyfield = new javax.swing.JTextField();
        womenplusbtn = new javax.swing.JButton();
        womenaddtocart = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        womentable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kidspanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        kidsminusbtn = new javax.swing.JButton();
        kdsqtyfield = new javax.swing.JTextField();
        kidsplusbtn = new javax.swing.JButton();
        kidsaddtocartbtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        kidstable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jewellerypanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jewelleryminusbtn = new javax.swing.JButton();
        jewelleryqtyfield = new javax.swing.JTextField();
        jewelleryplusbtn = new javax.swing.JButton();
        jewelleryaddtocart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jewellerytable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperpanel.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Men");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Women");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Kids");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Jewellery");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout upperpanelLayout = new javax.swing.GroupLayout(upperpanel);
        upperpanel.setLayout(upperpanelLayout);
        upperpanelLayout.setHorizontalGroup(
            upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperpanelLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(707, Short.MAX_VALUE))
        );
        upperpanelLayout.setVerticalGroup(
            upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperpanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(upperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(upperpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 140));

        rightpanel.setBackground(new java.awt.Color(153, 153, 153));
        rightpanel.setLayout(new java.awt.CardLayout());

        cartpanel.setBackground(new java.awt.Color(153, 153, 153));

        lbl_img.setBackground(new java.awt.Color(255, 255, 255));
        lbl_img.setText("hello me adil");

        carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S. No", "Product Name", "Product Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(carttable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Total Price");

        confirmbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        removebtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        removebtn.setText("Remove");
        removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebtnActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton7.setText("Online Payment");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton8.setText("Offline Payment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartpanelLayout = new javax.swing.GroupLayout(cartpanel);
        cartpanel.setLayout(cartpanelLayout);
        cartpanelLayout.setHorizontalGroup(
            cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartpanelLayout.createSequentialGroup()
                .addGroup(cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(cartpanelLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(cartpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartpanelLayout.createSequentialGroup()
                        .addComponent(totalpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartpanelLayout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        cartpanelLayout.setVerticalGroup(
            cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(confirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalpricefield))
                .addGap(55, 55, 55)
                .addGroup(cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        rightpanel.add(cartpanel, "card2");

        onlinepaymentpanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Online Payment");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("-----------------------------------------------------------------------------------");

        cardnumberfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardnumberfield.setText("Enter Credit Card Number");
        cardnumberfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardnumberfieldMouseClicked(evt);
            }
        });
        cardnumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumberfieldActionPerformed(evt);
            }
        });

        cardcontinuebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cardcontinuebtn.setText("Continue");
        cardcontinuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardcontinuebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout onlinepaymentpanelLayout = new javax.swing.GroupLayout(onlinepaymentpanel);
        onlinepaymentpanel.setLayout(onlinepaymentpanelLayout);
        onlinepaymentpanelLayout.setHorizontalGroup(
            onlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlinepaymentpanelLayout.createSequentialGroup()
                .addGroup(onlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(onlinepaymentpanelLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(onlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(onlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cardnumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(onlinepaymentpanelLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(cardcontinuebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        onlinepaymentpanelLayout.setVerticalGroup(
            onlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlinepaymentpanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(228, 228, 228)
                .addComponent(cardnumberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(cardcontinuebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        rightpanel.add(onlinepaymentpanel, "card3");

        offlinepaymentpanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Offline Payment");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("-----------------------------------------------------------------------------------");

        addressfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addressfield.setText("Enter house address");
        addressfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressfieldMouseClicked(evt);
            }
        });
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });

        addresscontinuebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addresscontinuebtn.setText("Continue");
        addresscontinuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresscontinuebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout offlinepaymentpanelLayout = new javax.swing.GroupLayout(offlinepaymentpanel);
        offlinepaymentpanel.setLayout(offlinepaymentpanelLayout);
        offlinepaymentpanelLayout.setHorizontalGroup(
            offlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offlinepaymentpanelLayout.createSequentialGroup()
                .addGroup(offlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(offlinepaymentpanelLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(offlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(offlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(offlinepaymentpanelLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(addresscontinuebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        offlinepaymentpanelLayout.setVerticalGroup(
            offlinepaymentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(offlinepaymentpanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(228, 228, 228)
                .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(addresscontinuebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        rightpanel.add(offlinepaymentpanel, "card4");

        invoicepanel.setBackground(new java.awt.Color(153, 153, 153));
        invoicepanel.setForeground(new java.awt.Color(0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("<html>\n<p>Thank You !! <br> for shopping with us</p>\n</html>");

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Check Invoice");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoicepanelLayout = new javax.swing.GroupLayout(invoicepanel);
        invoicepanel.setLayout(invoicepanelLayout);
        invoicepanelLayout.setHorizontalGroup(
            invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicepanelLayout.createSequentialGroup()
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton5)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        invoicepanelLayout.setVerticalGroup(
            invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicepanelLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        rightpanel.add(invoicepanel, "card5");

        getContentPane().add(rightpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 610, 880));

        leftpanel.setBackground(new java.awt.Color(255, 255, 255));
        leftpanel.setLayout(new java.awt.CardLayout());

        menpanel.setBackground(new java.awt.Color(255, 255, 255));

        mentable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Price"
            }
        ));
        mentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mentableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mentable);

        menaddtocartbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menaddtocartbtn.setText("Add to Cart");
        menaddtocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menaddtocartbtnActionPerformed(evt);
            }
        });

        menqtyfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menqtyfield.setText("1");

        menplusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menplusbtn.setText("+");
        menplusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menplusbtnActionPerformed(evt);
            }
        });

        menminusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menminusbtn.setText("-");
        menminusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menminusbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Men Section");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("-----------------------------------------------------------------");

        javax.swing.GroupLayout menpanelLayout = new javax.swing.GroupLayout(menpanel);
        menpanel.setLayout(menpanelLayout);
        menpanelLayout.setHorizontalGroup(
            menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menpanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menpanelLayout.createSequentialGroup()
                                .addComponent(menminusbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menplusbtn)
                                .addGap(18, 18, 18)
                                .addComponent(menaddtocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menpanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        menpanelLayout.setVerticalGroup(
            menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menpanelLayout.createSequentialGroup()
                .addGroup(menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menpanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(menpanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(menpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menaddtocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menplusbtn)
                    .addComponent(menminusbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        leftpanel.add(menpanel, "card2");

        womenpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Quantity");

        womenminusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        womenminusbtn.setText("-");
        womenminusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womenminusbtnActionPerformed(evt);
            }
        });

        womenqtyfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        womenqtyfield.setText("1");

        womenplusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        womenplusbtn.setText("+");
        womenplusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womenplusbtnActionPerformed(evt);
            }
        });

        womenaddtocart.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        womenaddtocart.setText("Add to Cart");
        womenaddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                womenaddtocartActionPerformed(evt);
            }
        });

        womentable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Price"
            }
        ));
        womentable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                womentableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(womentable);

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("----------------------------------------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Women Section");

        javax.swing.GroupLayout womenpanelLayout = new javax.swing.GroupLayout(womenpanel);
        womenpanel.setLayout(womenpanelLayout);
        womenpanelLayout.setHorizontalGroup(
            womenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(womenpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, womenpanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(womenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(womenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(womenpanelLayout.createSequentialGroup()
                        .addComponent(womenminusbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(womenqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(womenplusbtn)
                        .addGap(18, 18, 18)
                        .addComponent(womenaddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(womenpanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        womenpanelLayout.setVerticalGroup(
            womenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, womenpanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(womenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, womenpanelLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(womenpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(womenaddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(womenqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(womenplusbtn)
                    .addComponent(womenminusbtn))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        leftpanel.add(womenpanel, "card3");

        kidspanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantity");

        kidsminusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kidsminusbtn.setText("-");
        kidsminusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsminusbtnActionPerformed(evt);
            }
        });

        kdsqtyfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kdsqtyfield.setText("1");

        kidsplusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kidsplusbtn.setText("+");
        kidsplusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsplusbtnActionPerformed(evt);
            }
        });

        kidsaddtocartbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kidsaddtocartbtn.setText("Add to Cart");
        kidsaddtocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kidsaddtocartbtnActionPerformed(evt);
            }
        });

        kidstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Price"
            }
        ));
        kidstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kidstableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(kidstable);

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("-------------------------------------------------------------------");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Kids Section");

        javax.swing.GroupLayout kidspanelLayout = new javax.swing.GroupLayout(kidspanel);
        kidspanel.setLayout(kidspanelLayout);
        kidspanelLayout.setHorizontalGroup(
            kidspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kidspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kidspanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(kidspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kidspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kidspanelLayout.createSequentialGroup()
                        .addComponent(kidsminusbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kdsqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kidsplusbtn)
                        .addGap(18, 18, 18)
                        .addComponent(kidsaddtocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kidspanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        kidspanelLayout.setVerticalGroup(
            kidspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kidspanelLayout.createSequentialGroup()
                .addGroup(kidspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kidspanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(kidspanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addGroup(kidspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kidsaddtocartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kdsqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kidsplusbtn)
                    .addComponent(kidsminusbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        leftpanel.add(kidspanel, "card4");

        jewellerypanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Quantity");

        jewelleryminusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jewelleryminusbtn.setText("-");
        jewelleryminusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jewelleryminusbtnActionPerformed(evt);
            }
        });

        jewelleryqtyfield.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jewelleryqtyfield.setText("1");

        jewelleryplusbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jewelleryplusbtn.setText("+");
        jewelleryplusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jewelleryplusbtnActionPerformed(evt);
            }
        });

        jewelleryaddtocart.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jewelleryaddtocart.setText("Add to Cart");
        jewelleryaddtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jewelleryaddtocartActionPerformed(evt);
            }
        });

        jewellerytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Price"
            }
        ));
        jewellerytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jewellerytableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jewellerytable);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("------------------------------------------------------------------------------------------");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Jewellery Section");

        javax.swing.GroupLayout jewellerypanelLayout = new javax.swing.GroupLayout(jewellerypanel);
        jewellerypanel.setLayout(jewellerypanelLayout);
        jewellerypanelLayout.setHorizontalGroup(
            jewellerypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jewellerypanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jewellerypanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jewellerypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jewellerypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jewellerypanelLayout.createSequentialGroup()
                        .addComponent(jewelleryminusbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jewelleryqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jewelleryplusbtn)
                        .addGap(18, 18, 18)
                        .addComponent(jewelleryaddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jewellerypanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jewellerypanelLayout.setVerticalGroup(
            jewellerypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jewellerypanelLayout.createSequentialGroup()
                .addGroup(jewellerypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jewellerypanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jewellerypanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addGroup(jewellerypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jewelleryaddtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jewelleryqtyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jewelleryplusbtn)
                    .addComponent(jewelleryminusbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        leftpanel.add(jewellerypanel, "card5");

        getContentPane().add(leftpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 960, 880));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menpanel.setVisible(true);
        womenpanel.setVisible(false);
        kidspanel.setVisible(false);
        jewellerypanel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menpanel.setVisible(false);
        womenpanel.setVisible(true);
        kidspanel.setVisible(false);
        jewellerypanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        menpanel.setVisible(false);
        womenpanel.setVisible(false);
        kidspanel.setVisible(true);
        jewellerypanel.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        menpanel.setVisible(false);
        womenpanel.setVisible(false);
        kidspanel.setVisible(false);
        jewellerypanel.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mentableMouseClicked
        // TODO add your handling code here:
        int row = mentable.getSelectedRow();
        String clicked = (mentable.getModel().getValueAt(row, 0).toString());
        String imageurl = "";
        int userid = Integer.parseInt(clicked);
        ArrayList<Men> list = menProducts();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == userid){
                imageurl = list.get(i).getImage();
            }
        }
        imageurl = imageurl.replace("\\", "\\\\");
      ImageIcon icon = new ImageIcon(imageurl);
      Image image = icon.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH);
      icon = new ImageIcon(image);
      lbl_img.setIcon(icon);
      
        
    }//GEN-LAST:event_mentableMouseClicked

    private void menplusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menplusbtnActionPerformed
        // TODO add your handling code here:
        String value = menqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty++;
        String quantity = Integer.toString(qty);
        menqtyfield.setText(quantity);
    }//GEN-LAST:event_menplusbtnActionPerformed

    private void menminusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menminusbtnActionPerformed
        // TODO add your handling code here:
        String value = menqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty--;
        String quantity = Integer.toString(qty);
        menqtyfield.setText(quantity);
    }//GEN-LAST:event_menminusbtnActionPerformed

    private void menaddtocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menaddtocartbtnActionPerformed
        // TODO add your handling code here:
        try{
        count++;
        int row = mentable.getSelectedRow();
        String clicked = (mentable.getModel().getValueAt(row, 0).toString());
        int productid = Integer.parseInt(clicked);
        String productname = (mentable.getModel().getValueAt(row, 1).toString());
        String price = (mentable.getModel().getValueAt(row, 2).toString());
        int productprice = Integer.parseInt(price);
        String value = menqtyfield.getText();
        int qty = Integer.parseInt(value);
        int totalprice = productprice*qty;
        Object [] rows = {count,productname, qty, totalprice};
        model = (DefaultTableModel)carttable.getModel();
        model.addRow(rows);
        total.add(totalprice);}catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please select any item.");
                    count--;
        }
    }//GEN-LAST:event_menaddtocartbtnActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
        // TODO add your handling code here:
        String totalprice = Integer.toString(getTotalPrice());
        totalpricefield.setText(totalprice);
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebtnActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel)carttable.getModel();
        int row = carttable.getSelectedRow();
        String value = (carttable.getModel().getValueAt(row, 0).toString());
        int index = Integer.parseInt(value);
        System.out.println(index);
        total.remove(index-1);
        model.removeRow(row);
        count = index-1;
       
    }//GEN-LAST:event_removebtnActionPerformed

    private void jewelleryminusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jewelleryminusbtnActionPerformed
        // TODO add your handling code here:
        String value = jewelleryqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty--;
        String quantity = Integer.toString(qty);
        jewelleryqtyfield.setText(quantity);
        
    }//GEN-LAST:event_jewelleryminusbtnActionPerformed

    private void jewelleryplusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jewelleryplusbtnActionPerformed
        // TODO add your handling code here:
        String value = jewelleryqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty++;
        String quantity = Integer.toString(qty);
        jewelleryqtyfield.setText(quantity);
    }//GEN-LAST:event_jewelleryplusbtnActionPerformed

    private void jewelleryaddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jewelleryaddtocartActionPerformed
        // TODO add your handling code here:
        try{count++;
        int row = jewellerytable.getSelectedRow();
        String clicked = (jewellerytable.getModel().getValueAt(row, 0).toString());
        int productid = Integer.parseInt(clicked);
        String productname = (jewellerytable.getModel().getValueAt(row, 1).toString());
        String price = (jewellerytable.getModel().getValueAt(row, 2).toString());
        int productprice = Integer.parseInt(price);
        String value = jewelleryqtyfield.getText();
        int qty = Integer.parseInt(value);
        int totalprice = productprice*qty;
        Object [] rows = {count,productname, qty, totalprice};
        model = (DefaultTableModel)carttable.getModel();
        model.addRow(rows);
        total.add(totalprice);}catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Please select any item.");
            count--;
        }

    }//GEN-LAST:event_jewelleryaddtocartActionPerformed

    private void jewellerytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jewellerytableMouseClicked
        // TODO add your handling code here:
        int row = jewellerytable.getSelectedRow();
        String clicked = (jewellerytable.getModel().getValueAt(row, 0).toString());
        String imageurl = "";
        int productid = Integer.parseInt(clicked);
        ArrayList<Jewellery> list = jewelProducts();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == productid){
                imageurl = list.get(i).getImage();
            }
        }
        imageurl = imageurl.replace("\\", "\\\\");
      ImageIcon icon = new ImageIcon(imageurl);
      Image image = icon.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH);
      icon = new ImageIcon(image);
      lbl_img.setIcon(icon);
    }//GEN-LAST:event_jewellerytableMouseClicked

    private void kidsminusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsminusbtnActionPerformed
        // TODO add your handling code here:
        String value = kdsqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty--;
        String quantity = Integer.toString(qty);
        kdsqtyfield.setText(quantity);
    }//GEN-LAST:event_kidsminusbtnActionPerformed

    private void kidsplusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsplusbtnActionPerformed
        // TODO add your handling code here:
        String value = kdsqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty++;
        String quantity = Integer.toString(qty);
        kdsqtyfield.setText(quantity);
    }//GEN-LAST:event_kidsplusbtnActionPerformed

    private void kidsaddtocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kidsaddtocartbtnActionPerformed
        // TODO add your handling code here:
         try{       count++;
        int row = kidstable.getSelectedRow();
        String clicked = (kidstable.getModel().getValueAt(row, 0).toString());
        int productid = Integer.parseInt(clicked);
        String productname = (kidstable.getModel().getValueAt(row, 1).toString());
        String price = (kidstable.getModel().getValueAt(row, 2).toString());
        int productprice = Integer.parseInt(price);
        String value = kdsqtyfield.getText();
        int qty = Integer.parseInt(value);
        int totalprice = productprice*qty;
        Object [] rows = {count,productname, qty, totalprice};
        model = (DefaultTableModel)carttable.getModel();
        model.addRow(rows);
        total.add(totalprice);}catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please select any item.");
                    count--;
        }

    }//GEN-LAST:event_kidsaddtocartbtnActionPerformed

    private void kidstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kidstableMouseClicked
        // TODO add your handling code here:
        int row = kidstable.getSelectedRow();
        String clicked = (kidstable.getModel().getValueAt(row, 0).toString());
        String imageurl = "";
        int productid = Integer.parseInt(clicked);
        ArrayList<Kids> list = kidsProducts();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == productid){
                imageurl = list.get(i).getImage();
            }
        }
        imageurl = imageurl.replace("\\", "\\\\");
      ImageIcon icon = new ImageIcon(imageurl);
      Image image = icon.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH);
      icon = new ImageIcon(image);
      lbl_img.setIcon(icon);
    }//GEN-LAST:event_kidstableMouseClicked

    private void womenminusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womenminusbtnActionPerformed
        // TODO add your handling code here:
        String value = womenqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty--;
        String quantity = Integer.toString(qty);
        womenqtyfield.setText(quantity);
    }//GEN-LAST:event_womenminusbtnActionPerformed

    private void womenplusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womenplusbtnActionPerformed
        // TODO add your handling code here:
        String value = womenqtyfield.getText();
        int qty = Integer.parseInt(value);
        qty++;
        String quantity = Integer.toString(qty);
        womenqtyfield.setText(quantity);
    }//GEN-LAST:event_womenplusbtnActionPerformed

    private void womenaddtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_womenaddtocartActionPerformed
        // TODO add your handling code here:
        try{
        count++;
        int row = womentable.getSelectedRow();
        String clicked = (womentable.getModel().getValueAt(row, 0).toString());
        int productid = Integer.parseInt(clicked);
        String productname = (womentable.getModel().getValueAt(row, 1).toString());
        String price = (womentable.getModel().getValueAt(row, 2).toString());
        int productprice = Integer.parseInt(price);
        String value = womenqtyfield.getText();
        int qty = Integer.parseInt(value);
        int totalprice = productprice*qty;
        Object [] rows = {count,productname, qty, totalprice};
        model = (DefaultTableModel)carttable.getModel();
        model.addRow(rows);
        total.add(totalprice);}catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Please select any item.");
                    count--;
        }

        
    }//GEN-LAST:event_womenaddtocartActionPerformed

    private void womentableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_womentableMouseClicked
        // TODO add your handling code here:
        int row = womentable.getSelectedRow();
        String clicked = (womentable.getModel().getValueAt(row, 0).toString());
        String imageurl = "";
        int productid = Integer.parseInt(clicked);
        ArrayList<Women> list = womenProducts();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == productid){
                imageurl = list.get(i).getImage();
            }
        }
        imageurl = imageurl.replace("\\", "\\\\");
      ImageIcon icon = new ImageIcon(imageurl);
      Image image = icon.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH);
      icon = new ImageIcon(image);
      lbl_img.setIcon(icon);
    }//GEN-LAST:event_womentableMouseClicked

    private void cardnumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnumberfieldActionPerformed

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

    private void addressfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressfieldMouseClicked
        // TODO add your handling code here:
        addressfield.setText("");
    }//GEN-LAST:event_addressfieldMouseClicked

    private void cardnumberfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardnumberfieldMouseClicked
        // TODO add your handling code here:
        cardnumberfield.setText("");
    }//GEN-LAST:event_cardnumberfieldMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        cartpanel.setVisible(false);
        onlinepaymentpanel.setVisible(true);
        offlinepaymentpanel.setVisible(false);
        invoicepanel.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        cartpanel.setVisible(false);
        onlinepaymentpanel.setVisible(false);
        offlinepaymentpanel.setVisible(true);
        invoicepanel.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cardcontinuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardcontinuebtnActionPerformed
        // TODO add your handling code here:
        payment = new OfflinePayment();
        payment.confirmPayment("creditcard", null, ID, cardnumberfield.getText());
        cartpanel.setVisible(false);
        onlinepaymentpanel.setVisible(false);
        offlinepaymentpanel.setVisible(false);
        invoicepanel.setVisible(true);
    }//GEN-LAST:event_cardcontinuebtnActionPerformed

    private void addresscontinuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresscontinuebtnActionPerformed
        // TODO add your handling code here:
        payment = new OfflinePayment();
        payment.confirmPayment("cash", addressfield.getText(), ID, null);
        cartpanel.setVisible(false);
        onlinepaymentpanel.setVisible(false);
        offlinepaymentpanel.setVisible(false);
        invoicepanel.setVisible(true);
    }//GEN-LAST:event_addresscontinuebtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Invoice inv = new Invoice(ID, Username, price);
        inv.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

   
    
    public ArrayList<Men> menProducts(){
        ArrayList<Men> men = new ArrayList();
        String sql = "select * from men";
        dbconnection db = new dbconnection();
        try{
            ResultSet rs = db.st.executeQuery(sql);
            Men mens;
            while(rs.next()){
                mens = new Men(rs.getInt("price"), rs.getInt("productid"), rs.getString("productname"), rs.getString("productimage"));
                men.add(mens);
            }
        }catch(Exception e){System.out.println(e);}
        
        return men;
    } 
    
     public void showMenProducts(){
        ArrayList<Men> list = menProducts();
        model = (DefaultTableModel)mentable.getModel();
        Object rows [] = new Object[3];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getId();
            rows[1] = list.get(i).getName();
            rows[2] = list.get(i).getPrice();
            model.addRow(rows);
        }
        
    }
    
     public ArrayList<Women> womenProducts(){
        ArrayList<Women> women = new ArrayList();
        String sql = "select * from women";
        dbconnection db = new dbconnection();
        try{
            ResultSet rs = db.st.executeQuery(sql);
            Women womens;
            while(rs.next()){
                womens = new Women(rs.getInt("price"), rs.getInt("productid"), rs.getString("productname"), rs.getString("productimage"));
                women.add(womens);
            }
        }catch(Exception e){System.out.println(e);}
        
        return women;
    } 
    
     public void showWomenProducts(){
        ArrayList<Women> list = womenProducts();
        model = (DefaultTableModel)womentable.getModel();
        Object rows [] = new Object[3];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getId();
            rows[1] = list.get(i).getName();
            rows[2] = list.get(i).getPrice();
            model.addRow(rows);
        }
        
    }
     
     public ArrayList<Jewellery> jewelProducts(){
        ArrayList<Jewellery> jewel = new ArrayList();
        String sql = "select * from jewellery";
        dbconnection db = new dbconnection();
        try{
            ResultSet rs = db.st.executeQuery(sql);
            Jewellery jewels;
            while(rs.next()){
                jewels = new Jewellery(rs.getInt("price"), rs.getInt("productid"), rs.getString("productname"), rs.getString("productimage"));
                jewel.add(jewels);
            }
        }catch(Exception e){System.out.println(e);}
        
        return jewel;
    } 
    
     public void showJewelleryProducts(){
        ArrayList<Jewellery> list = jewelProducts();
        model = (DefaultTableModel)jewellerytable.getModel();
        Object rows [] = new Object[3];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getId();
            rows[1] = list.get(i).getName();
            rows[2] = list.get(i).getPrice();
            model.addRow(rows);
        }
        
    }
     
     public ArrayList<Kids> kidsProducts(){
        ArrayList<Kids> kid = new ArrayList();
        String sql = "select * from kids";
        dbconnection db = new dbconnection();
        try{
            ResultSet rs = db.st.executeQuery(sql);
            Kids kids;
            while(rs.next()){
                kids = new Kids(rs.getInt("price"), rs.getInt("productid"), rs.getString("productname"), rs.getString("productimage"));
                kid.add(kids);
            }
        }catch(Exception e){System.out.println(e);}
        
        return kid;
    } 
    
     public void showKidsProducts(){
        ArrayList<Kids> list = kidsProducts();
        model = (DefaultTableModel)kidstable.getModel();
        Object rows [] = new Object[3];
        for(int i = 0; i < list.size(); i++){
            rows[0] = list.get(i).getId();
            rows[1] = list.get(i).getName();
            rows[2] = list.get(i).getPrice();
            model.addRow(rows);
        }
        
    }
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addresscontinuebtn;
    private javax.swing.JTextField addressfield;
    private javax.swing.JButton cardcontinuebtn;
    private javax.swing.JTextField cardnumberfield;
    private javax.swing.JPanel cartpanel;
    private javax.swing.JTable carttable;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JPanel invoicepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jewelleryaddtocart;
    private javax.swing.JButton jewelleryminusbtn;
    private javax.swing.JPanel jewellerypanel;
    private javax.swing.JButton jewelleryplusbtn;
    private javax.swing.JTextField jewelleryqtyfield;
    private javax.swing.JTable jewellerytable;
    private javax.swing.JTextField kdsqtyfield;
    private javax.swing.JButton kidsaddtocartbtn;
    private javax.swing.JButton kidsminusbtn;
    private javax.swing.JPanel kidspanel;
    private javax.swing.JButton kidsplusbtn;
    private javax.swing.JTable kidstable;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JButton menaddtocartbtn;
    private javax.swing.JButton menminusbtn;
    private javax.swing.JPanel menpanel;
    private javax.swing.JButton menplusbtn;
    private javax.swing.JTextField menqtyfield;
    private javax.swing.JTable mentable;
    private javax.swing.JPanel offlinepaymentpanel;
    private javax.swing.JPanel onlinepaymentpanel;
    private javax.swing.JButton removebtn;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JTextField totalpricefield;
    private javax.swing.JPanel upperpanel;
    private javax.swing.JButton womenaddtocart;
    private javax.swing.JButton womenminusbtn;
    private javax.swing.JPanel womenpanel;
    private javax.swing.JButton womenplusbtn;
    private javax.swing.JTextField womenqtyfield;
    private javax.swing.JTable womentable;
    // End of variables declaration//GEN-END:variables
}
