/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjtform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author chandrag
 */
public class result extends javax.swing.JFrame {

    /**
     * Creates new form result
     */
    public result() {
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

        event = new javax.swing.JComboBox<>();
        two2 = new javax.swing.JComboBox<>();
        one1 = new javax.swing.JComboBox<>();
        one = new javax.swing.JTextField();
        two = new javax.swing.JTextField();
        three = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        two1 = new javax.swing.JComboBox<>();
        three1 = new javax.swing.JComboBox<>();
        three2 = new javax.swing.JComboBox<>();
        one2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        st = new javax.swing.JTextField();
        nd = new javax.swing.JTextField();
        rd = new javax.swing.JTextField();
        st1 = new javax.swing.JTextField();
        nd1 = new javax.swing.JTextField();
        rd1 = new javax.swing.JTextField();
        st2 = new javax.swing.JTextField();
        nd2 = new javax.swing.JTextField();
        rd2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        event.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW" }));
        getContentPane().add(event);
        event.setBounds(130, 60, 85, 22);

        two2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        getContentPane().add(two2);
        two2.setBounds(368, 413, 275, 22);

        one1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });
        getContentPane().add(one1);
        one1.setBounds(368, 238, 275, 22);

        one.setText("CHEST_NO");
        getContentPane().add(one);
        one.setBounds(264, 97, 85, 22);

        two.setText("CHEST_NO");
        getContentPane().add(two);
        two.setBounds(264, 133, 85, 22);

        three.setText("CHEST_NO");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three);
        three.setBounds(264, 176, 85, 22);

        jLabel1.setText("EVENT:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(34, 60, 43, 16);

        jLabel2.setText("1st PLACE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 100, 62, 16);

        jLabel3.setText("2nd PLACE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(34, 136, 66, 16);

        jLabel4.setText("3rd PLACE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(124, 316, 64, 16);

        jLabel5.setText("4X100 RELAY");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(21, 229, 76, 16);

        jLabel6.setText("4X400 RELAY");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(21, 359, 76, 16);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(551, 131, 63, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(264, 502, 63, 25);

        two1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        getContentPane().add(two1);
        two1.setBounds(368, 278, 275, 22);

        three1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        getContentPane().add(three1);
        three1.setBounds(368, 313, 275, 22);

        three2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        three2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three2ActionPerformed(evt);
            }
        });
        getContentPane().add(three2);
        three2.setBounds(368, 448, 275, 22);

        one2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COIMBATORE INSTITUTE OF TECHNOLOGY", "SRI ESHWAR COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF TECHNOLOGY", "PSG COLLEGE OF APPLIED SCIENCE", "HINDUSTHAN COLLEGE OF TECHNOLOGY", "KONGU COLLEGE OF TECHNOLOGY", "BANNARI AMMAN INSTITUTE OF TECHNOLOGY", "SRI SAKTHI INSTITUTE OF ENGINEERING AND TECHNOLOGY", "KUMARAGURU COLLEGE OF TECHNOLOGY", "SRI SAKTHI COLLEGE OF TECHNOLOGY", "SRI KRISHNA COLLEGE OF TECHNOLOGY", "SRI RAMAKRISHNA COLLEGE OF TECHNOLOGY", "AKSHAYA COLLEGE OF TECHNOLOGY", "KPR INSTITUTE OF ENGINEERING AND TECHNOLOGY", "GOVERNMENT COLLEGE OF TECHNOLOGY", "KALAINAR KARUNANITHI INSITUTE OF TECHNOLOGYV", "COIMBATORE INSTITUTE OF ENGINEERING AND TECHNOLOGY", "Dr.NGP INSTITUTE OF TECHNOLOGY", "SNS COLLEGE OF TECHNOLOGY", "KARPAGAM INSTITUTE OF TECHNOLOGY", "PARK INSTITUTE OF TECHNOLOGY", "KATHIR COLLEGE OF TECHNOLOGY", "AISWARYA COLLEGE OF TECHNOLOGY", "NANDHA COLLEGE OF TECHNOLOGY", "MAHENDHIRA COLLEGE OF TECHNOLOGY" }));
        getContentPane().add(one2);
        one2.setBounds(368, 378, 275, 22);

        jLabel7.setText("1st PLACE:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(126, 381, 62, 16);

        jLabel8.setText("1st PLACE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(126, 241, 62, 16);

        jLabel9.setText("2nd PLACE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(126, 416, 66, 16);

        jLabel10.setText("2nd PLACE:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(122, 281, 66, 16);

        jLabel11.setText("3rd PLACE:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(44, 186, 64, 16);

        jLabel12.setText("3rd PLACE:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(128, 451, 64, 16);

        st.setText("TIMING");
        getContentPane().add(st);
        st.setBounds(419, 97, 80, 22);

        nd.setText("TIMING");
        getContentPane().add(nd);
        nd.setBounds(419, 133, 80, 22);

        rd.setText("TIMING");
        rd.setPreferredSize(new java.awt.Dimension(48, 25));
        getContentPane().add(rd);
        rd.setBounds(419, 176, 80, 20);
        getContentPane().add(st1);
        st1.setBounds(264, 238, 85, 22);
        getContentPane().add(nd1);
        nd1.setBounds(264, 278, 85, 22);

        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });
        getContentPane().add(rd1);
        rd1.setBounds(264, 313, 85, 22);
        getContentPane().add(st2);
        st2.setBounds(264, 378, 85, 22);
        getContentPane().add(nd2);
        nd2.setBounds(264, 413, 85, 22);
        getContentPane().add(rd2);
        rd2.setBounds(264, 448, 85, 22);

        jPanel1.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\chandrag\\Desktop\\bg3.png")); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, -2, 680, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kowreesh","kowree3801");
            String sql = "insert into result values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            String sec,time1,time2,time3;
            int i,place1,place2,place3;
            sec=event.getSelectedItem().toString();
            ps.setString(1,sec);
            place1=Integer.parseInt(one.getText());
            ps.setInt(2, place1);
            place2=Integer.parseInt(two.getText());
            ps.setInt(3, place2);
            place3=Integer.parseInt(three.getText());
            ps.setInt(4, place3);
            time1=st.getText();
            ps.setString(5, time1);
            time2=nd.getText();
            ps.setString(6, time2);
            time3=rd.getText();
            ps.setString(7, time3);
            ps.executeUpdate();
            //conn.close();
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED EVENT DETAILS");
   
            String qr1="select * from participants where cheat_no in ("+place1+")";
            PreparedStatement pss1 = conn.prepareStatement(qr1);
            ResultSet rss1 = pss1.executeQuery();
            while(rss1.next()){
                String col=rss1.getString("college_name");
                String name=rss1.getString("part_name");
                String mail=rss1.getString("email");
                
                String sql1 = "insert into certificate values(?,?,?,?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                
                ps1.setString(1, name);
                ps1.setString(2, col);
                ps1.setString(3, time1);
                ps1.setString(4, sec);
                ps1.setString(5, "First");
                ps1.setString(6, mail);
                ps1.executeUpdate();
            }
            rss1.close();
            pss1.close();
            
             String qr11="select * from participants where cheat_no in ("+place2+")";
            PreparedStatement pss2 = conn.prepareStatement(qr11);
            ResultSet rss2 = pss2.executeQuery();
            while(rss2.next()){
                String col=rss2.getString("college_name");
                String name=rss2.getString("part_name");
                String mail=rss2.getString("email");
                
                String sql2 = "insert into certificate values(?,?,?,?,?,?)";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                
                ps2.setString(1, name);
                ps2.setString(2, col);
                ps2.setString(3, time2);
                ps2.setString(4, sec);
                ps2.setString(5, "Second");
                ps2.setString(6, mail);
                ps2.executeUpdate();
            }
            rss2.close();
            pss2.close();
            
             String qr13="select * from participants where cheat_no in ("+place3+")";
            PreparedStatement pss3 = conn.prepareStatement(qr13);
            ResultSet rss3 = pss3.executeQuery();
            while(rss3.next()){
                String col=rss3.getString("college_name");
                String name=rss3.getString("part_name");
                String mail=rss3.getString("email");
                
                String sql3 = "insert into certificate values(?,?,?,?,?,?)";
                PreparedStatement ps3 = conn.prepareStatement(sql3);
                
                ps3.setString(1, name);
                ps3.setString(2, col);
                ps3.setString(3, time3);
                ps3.setString(4, sec);
                ps3.setString(5, "Third");
                ps3.setString(6, mail);
                ps3.executeUpdate();
            }
            rss3.close();
            pss3.close();
        }
        catch(Exception x)
        {
            //System.out.println(x);
            JOptionPane.showMessageDialog(null,x);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_one1ActionPerformed

    private void three2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_three2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        test.ConnectDB(st1.getText(),one1.getSelectedItem().toString(),1);
        test.ConnectDB(nd1.getText(),two1.getSelectedItem().toString(),2);
        test.ConnectDB(rd1.getText(),three1.getSelectedItem().toString(),3);
        test.Connectted(st2.getText(),one2.getSelectedItem().toString(),1);
        test.Connectted(nd2.getText(),two2.getSelectedItem().toString(),2);
        test.Connectted(rd2.getText(),three2.getSelectedItem().toString(),3);

        JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADD THE RELAY RESULT");
    }//GEN-LAST:event_jButton2MouseClicked

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd1ActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> event;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField nd;
    private javax.swing.JTextField nd1;
    private javax.swing.JTextField nd2;
    private javax.swing.JTextField one;
    private javax.swing.JComboBox<String> one1;
    private javax.swing.JComboBox<String> one2;
    private javax.swing.JTextField rd;
    private javax.swing.JTextField rd1;
    private javax.swing.JTextField rd2;
    private javax.swing.JTextField st;
    private javax.swing.JTextField st1;
    private javax.swing.JTextField st2;
    private javax.swing.JTextField three;
    private javax.swing.JComboBox<String> three1;
    private javax.swing.JComboBox<String> three2;
    private javax.swing.JTextField two;
    private javax.swing.JComboBox<String> two1;
    private javax.swing.JComboBox<String> two2;
    // End of variables declaration//GEN-END:variables
}
