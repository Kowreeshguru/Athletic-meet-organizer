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
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        chest_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        event2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW", "NONE" }));
        getContentPane().add(event2);
        event2.setBounds(300, 500, 128, 31);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ATHLETE'S NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 220, 105, 16);

        sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW", "NONE" }));
        getContentPane().add(sub);
        sub.setBounds(300, 540, 128, 37);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEX:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 270, 28, 16);

        jLabel13.setText("RELAY:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(120, 600, 41, 16);

        jLabel5.setText("DOB:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 320, 29, 16);

        relay1.setText("4x100");
        getContentPane().add(relay1);
        relay1.setBounds(300, 600, 63, 25);

        relay2.setText("4x400");
        getContentPane().add(relay2);
        relay2.setBounds(380, 600, 63, 25);

        jLabel7.setText("DEPARTMENT:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 370, 84, 16);

        jLabel8.setText("YEAR:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 410, 35, 27);

        jLabel9.setText("EVENT1:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 470, 50, 16);

        college.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeActionPerformed(evt);
            }
        });
        getContentPane().add(college);
        college.setBounds(300, 650, 326, 22);

        jLabel10.setText("EVENT2:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 500, 50, 16);

        jLabel11.setText("SUBTITUTE:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 550, 71, 16);
        getContentPane().add(reg_no);
        reg_no.setBounds(280, 180, 247, 22);
        getContentPane().add(name);
        name.setBounds(280, 220, 247, 22);

        male.setText("MALE");
        getContentPane().add(male);
        male.setBounds(300, 270, 59, 25);

        female.setText("FEMALE");
        getContentPane().add(female);
        female.setBounds(400, 270, 73, 25);

        dob.setText("DD/MM/YYYY");
        getContentPane().add(dob);
        dob.setBounds(300, 320, 247, 22);

        jLabel12.setText("COLLEGE NAME");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(120, 650, 88, 16);
        getContentPane().add(year);
        year.setBounds(300, 420, 247, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION FORM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 203, 27);

        dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.E mech", "B.E EEE", "B.E ECE", "B.E Civil", "B.Tech chem", "B.Tech IT", "M.Sc SS", "M.Sc DS", "M.Sc DCS", "M.Sc MLAI", "B.Tech robotics", "B.E Inst&Oper" }));
        getContentPane().add(dept);
        dept.setBounds(300, 370, 115, 22);

        jTextPane1.setText("Thank you for registration in our meet.Please fill in your information and we will contact you shortly to complete your membership.");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 537, 50);

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
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 700, 105, 25);

        event1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW", "NONE" }));
        getContentPane().add(event1);
        event1.setBounds(300, 460, 128, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CHEST NO:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(110, 110, 65, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mail ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 231, 39, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(280, 228, 247, 22);

        jPanel1.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\chandrag\\Desktop\\bg2.png")); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(0, 0, 630, 720);

        chest_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chest_noActionPerformed(evt);
            }
        });
        jPanel1.add(chest_no);
        chest_no.setBounds(280, 110, 247, 22);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTER NO:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 150, 84, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String qr="select table_name from user_tables";
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kowreesh","kowree3801");
            PreparedStatement ps = null;
            ps = conn.prepareStatement(qr);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            conn.close();
            rs.close();
        }
        catch(Exception x)
        {
            System.out.println(x);
            //JOptionPane.showMessageDialog(null,x);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(name.getText().trim().isEmpty() && reg_no.getText().trim().isEmpty() && chest_no.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"ALL DETAILS ARE REQUIRED,SHOULD NOT BE EMPTY");
        }
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kowreesh","kowree3801");
            String sql = "insert into participants values(?,?,?,?,?,?,?,null,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            String col;
            col=college.getSelectedItem().toString();
            ps.setString(5, col);
            ps.setInt(1, Integer.parseInt(chest_no.getText()));
            String dep;
            dep=dept.getSelectedItem().toString();
            ps.setString(2,dep);
            ps.setInt(3, Integer.parseInt(reg_no.getText()));
            ps.setString(4,name.getText());
            String sex = null;
            if(male.isSelected()){
                sex="male";
            }
            else if(female.isSelected()){
                sex="female";
            }
            ps.setString(6, sex);
            ps.setString(7, dob.getText());
            //ps.setInt(8,null);
            ps.setInt(8, Integer.parseInt(year.getText()));
            
            String ent1;
            ent1=event1.getSelectedItem().toString();
            ps.setString(9, ent1);
            String ent2;
            ent2=event2.getSelectedItem().toString();
            ps.setString(10, ent2);
            String subt;
            subt=sub.getSelectedItem().toString();
            ps.setString(11, subt);
            
            int rel;
            if(relay1.isSelected() && relay2.isSelected()){
                rel=2;
            }
            else if(relay1.isSelected() || relay2.isSelected()){
                rel=1;
            }
            else{
                rel=0;
            }
            ps.setInt(12, rel);
            ps.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED PARTICIPANT DETAILS");
            dispose();
        }
        catch(Exception x)
        {
            //System.out.println(x);
            JOptionPane.showMessageDialog(null,x);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collegeActionPerformed

    private void chest_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chest_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chest_noActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chest_no;
    private javax.swing.JComboBox<String> college;
    private javax.swing.JComboBox<String> dept;
    private javax.swing.JTextField dob;
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
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField jTextField1;
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
