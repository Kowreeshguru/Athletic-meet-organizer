/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtform;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author chandrag
 */
public class register1 extends javax.swing.JFrame {

    /**
     * Creates new form register1
     */
    public register1() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        event2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sub = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        relay1 = new javax.swing.JRadioButton();
        relay2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        college = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        reg_no = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        dob = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dept = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        event1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        chest_no = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(655, 770));

        jLabel2.setText("REGISTER NO:");

        event2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW", "NONE" }));

        jLabel3.setText("ATHLETE'S NAME:");

        sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW", "NONE" }));

        jLabel4.setText("SEX:");

        jLabel13.setText("RELAY:");

        jLabel5.setText("DOB:");

        relay1.setText("4x100");

        relay2.setText("4x400");

        jLabel7.setText("DEPARTMENT:");

        jLabel8.setText("YEAR:");

        jLabel9.setText("EVENT1:");

        college.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeActionPerformed(evt);
            }
        });

        jLabel10.setText("EVENT2:");

        jLabel11.setText("SUBTITUTE:");

        reg_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_noActionPerformed(evt);
            }
        });

        male.setText("MALE");

        female.setText("FEMALE");

        dob.setText("DD/MM/YYYY");

        jLabel12.setText("COLLEGE NAME");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION FORM");

        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.E mech", "B.E EEE", "B.E ECE", "B.E Civil", "B.Tech chem", "B.Tech IT", "M.Sc SS", "M.Sc DS", "M.Sc DCS", "M.Sc MLAI", "B.Tech robotics", "B.E Inst&Oper" }));

        jTextPane1.setText("Thank you for registration in our meet.Please fill in your information and we will contact you shortly to complete your membership.");
        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        event1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW", "NONE" }));
        event1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                event1ActionPerformed(evt);
            }
        });

        jLabel14.setText("CHEST NO:");

        chest_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chest_noActionPerformed(evt);
            }
        });

        jLabel6.setText("Mail ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel14)
                        .addGap(105, 105, 105)
                        .addComponent(chest_no, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2)
                        .addGap(86, 86, 86)
                        .addComponent(reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(email)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel8)
                        .addGap(145, 145, 145)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel9)
                        .addGap(130, 130, 130)
                        .addComponent(event1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel10)
                        .addGap(130, 130, 130)
                        .addComponent(event2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel11)
                        .addGap(109, 109, 109)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel13)
                        .addGap(139, 139, 139)
                        .addComponent(relay1)
                        .addGap(17, 17, 17)
                        .addComponent(relay2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel12)
                        .addGap(92, 92, 92)
                        .addComponent(college, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(48, 48, 48)
                                        .addComponent(female))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(chest_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(female)
                            .addComponent(male))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(event1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(event2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(relay1)
                    .addComponent(relay2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(college, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collegeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String qr = "select table_name from user_tables";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kowreesh", "kowree3801");
            PreparedStatement ps = null;
            ps = conn.prepareStatement(qr);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            conn.close();
            rs.close();
        } catch (Exception x) {
            System.out.println(x);
            //JOptionPane.showMessageDialog(null,x);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (name.getText().trim().isEmpty() && reg_no.getText().trim().isEmpty() && chest_no.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ALL DETAILS ARE REQUIRED,SHOULD NOT BE EMPTY");
        }
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kowreesh", "kowree3801");
            String sql = "insert into participants values(?,?,?,?,?,?,?,null,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            String col;
            col = college.getSelectedItem().toString();
            ps.setString(5, col);
            ps.setInt(1, Integer.parseInt(chest_no.getText()));
            String dep;
            dep = dept.getSelectedItem().toString();
            ps.setString(2, dep);
            ps.setInt(3, Integer.parseInt(reg_no.getText()));
            ps.setString(4, name.getText());
            String sex = null;
            if (male.isSelected()) {
                sex = "male";
            } else if (female.isSelected()) {
                sex = "female";
            }
            ps.setString(6, sex);
            ps.setString(7, dob.getText());
            //ps.setInt(8,null);
            ps.setInt(8, Integer.parseInt(year.getText()));

            String ent1;
            ent1 = event1.getSelectedItem().toString();
            ps.setString(9, ent1);
            String ent2;
            ent2 = event2.getSelectedItem().toString();
            ps.setString(10, ent2);
            String subt;
            subt = sub.getSelectedItem().toString();
            ps.setString(11, subt);

            int rel;
            if (relay1.isSelected() && relay2.isSelected()) {
                rel = 2;
            } else if (relay1.isSelected() || relay2.isSelected()) {
                rel = 1;
            } else {
                rel = 0;
            }
            ps.setInt(12, rel);
            ps.setString(13, email.getText());
            ps.executeUpdate();
            conn.close();
            System.out.println(sql);
            Email.send(email.getText(),name.getText());
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED PARTICIPANT DETAILS");
            dispose();
        } catch (NumberFormatException x) {
            //System.out.println(x);
            JOptionPane.showMessageDialog(null, "Register number should not contains character");
        } catch (Exception x) {
            //System.out.println(x);
            JOptionPane.showMessageDialog(null, x);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chest_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chest_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chest_noActionPerformed

    private void reg_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_noActionPerformed

    private void event1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_event1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_event1ActionPerformed

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
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chest_no;
    private javax.swing.JComboBox<String> college;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> event1;
    private javax.swing.JComboBox<String> event2;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField reg_no;
    private javax.swing.JRadioButton relay1;
    private javax.swing.JRadioButton relay2;
    private javax.swing.JComboBox<String> sub;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
