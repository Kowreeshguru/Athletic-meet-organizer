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
public class resultview extends javax.swing.JFrame {

    /**
     * Creates new form resultview
     */
    public resultview() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        no3 = new javax.swing.JTextField();
        no1 = new javax.swing.JTextField();
        no2 = new javax.swing.JTextField();
        clg3 = new javax.swing.JTextField();
        clg1 = new javax.swing.JTextField();
        clg2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eve = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        relay11 = new javax.swing.JTextField();
        relay12 = new javax.swing.JTextField();
        relay13 = new javax.swing.JTextField();
        relay41 = new javax.swing.JTextField();
        relay42 = new javax.swing.JTextField();
        relay43 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tym1 = new javax.swing.JTextField();
        tym2 = new javax.swing.JTextField();
        tym3 = new javax.swing.JTextField();
        time11 = new javax.swing.JTextField();
        time12 = new javax.swing.JTextField();
        time13 = new javax.swing.JTextField();
        time41 = new javax.swing.JTextField();
        time42 = new javax.swing.JTextField();
        time43 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        name3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        over1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        over2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("SELECT THE EVENT:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(32, 18, 118, 16);

        jLabel2.setText("1st PLACE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(46, 133, 62, 16);

        jLabel3.setText("2nd PLACE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 187, 66, 16);

        jLabel4.setText("3rd PLACE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(44, 244, 64, 16);

        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });
        getContentPane().add(no3);
        no3.setBounds(154, 241, 80, 22);
        getContentPane().add(no1);
        no1.setBounds(154, 130, 80, 22);
        getContentPane().add(no2);
        no2.setBounds(154, 184, 80, 22);
        getContentPane().add(clg3);
        clg3.setBounds(530, 241, 273, 22);

        clg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clg1ActionPerformed(evt);
            }
        });
        getContentPane().add(clg1);
        clg1.setBounds(530, 130, 273, 22);
        getContentPane().add(clg2);
        clg2.setBounds(530, 184, 273, 22);

        jLabel5.setText("CHEST NO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(174, 87, 60, 16);

        jLabel6.setText("COLLEGE NAME");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(622, 87, 88, 16);

        eve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100 mts", "200 mts", "400 mts", "800 mts", "1500 mts", "5000 mts", "10000 mts", "20 km walk", "110 M H", "400 M H", "LONG JUMP", "HIGH JUMP", "TRIPLE JUMP", "POLE VAULT", "SHORT PUT", "JAVELIN THROW", "DISCUSS THROW", "HAMMER THROW" }));
        getContentPane().add(eve);
        eve.setBounds(168, 15, 128, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("SHOW RESULT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(373, 13, 172, 25);

        jLabel7.setText("4X100 RELAY");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 390, 76, 16);

        relay11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay11ActionPerformed(evt);
            }
        });
        getContentPane().add(relay11);
        relay11.setBounds(40, 410, 273, 22);
        getContentPane().add(relay12);
        relay12.setBounds(40, 440, 273, 22);
        getContentPane().add(relay13);
        relay13.setBounds(38, 472, 273, 22);

        relay41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay41ActionPerformed(evt);
            }
        });
        getContentPane().add(relay41);
        relay41.setBounds(530, 410, 273, 22);
        getContentPane().add(relay42);
        relay42.setBounds(530, 440, 273, 22);
        getContentPane().add(relay43);
        relay43.setBounds(530, 472, 273, 22);

        jLabel8.setText("4X400 RELAY");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(620, 380, 76, 16);
        getContentPane().add(tym1);
        tym1.setBounds(821, 130, 93, 22);
        getContentPane().add(tym2);
        tym2.setBounds(821, 184, 93, 22);
        getContentPane().add(tym3);
        tym3.setBounds(821, 241, 93, 22);
        getContentPane().add(time11);
        time11.setBounds(370, 410, 92, 22);
        getContentPane().add(time12);
        time12.setBounds(370, 440, 96, 22);
        getContentPane().add(time13);
        time13.setBounds(372, 472, 96, 22);

        time41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time41ActionPerformed(evt);
            }
        });
        getContentPane().add(time41);
        time41.setBounds(820, 410, 79, 22);

        time42.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(time42);
        time42.setBounds(820, 440, 79, 22);

        time43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time43ActionPerformed(evt);
            }
        });
        getContentPane().add(time43);
        time43.setBounds(821, 472, 79, 22);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("SHOW RELAY RESULTS");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(388, 501, 195, 25);

        jLabel9.setText("TIME");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(835, 78, 79, 16);

        jLabel10.setText("NAME");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(352, 87, 33, 16);
        getContentPane().add(name1);
        name1.setBounds(284, 130, 201, 22);
        getContentPane().add(name2);
        name2.setBounds(284, 184, 201, 22);
        getContentPane().add(name3);
        name3.setBounds(284, 241, 201, 22);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\chandrag\\Desktop\\bg5.png")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 930, 580);

        over1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                over1ActionPerformed(evt);
            }
        });
        getContentPane().add(over1);
        over1.setBounds(154, 317, 270, 22);

        jLabel12.setText("OVERALL FIRST:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 320, 96, 16);
        getContentPane().add(over2);
        over2.setBounds(547, 317, 220, 22);

        jLabel13.setText("OVERALL SECOND:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(430, 320, 109, 16);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText("OVERALL");
        getContentPane().add(jButton3);
        jButton3.setBounds(776, 316, 123, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clg1ActionPerformed

    private void relay11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relay11ActionPerformed

    private void relay41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relay41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relay41ActionPerformed

    private void time41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time41ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String event,time1,time2,time3;
        int chest1,chest2,chest3;
        try{
            String qr="select * from result where event='"+eve.getSelectedItem().toString()+"'";
            
            System.out.println(qr);
            //System.out.println(qr1);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:dbms","kowreesh","kowree3801");
            PreparedStatement ps = conn.prepareStatement(qr);
            ResultSet rs = ps.executeQuery();
           
            rs.next();
                event=rs.getString("event");
                chest1=rs.getInt("first");
                chest2=rs.getInt("second");
                chest3=rs.getInt("third");
                time1=rs.getString("time1");
                time2=rs.getString("time2");
                time3=rs.getString("time3");
                
                no1.setText(""+chest1);
                no2.setText(""+chest2);
                no3.setText(""+chest3);
                tym1.setText(time1);
                tym2.setText(time2);
                tym3.setText(time3);
                
            //}
            String qr1="select * from participants where cheat_no in ("+chest1+","+chest2+","+chest3+")";
             PreparedStatement pss = conn.prepareStatement(qr1);
            ResultSet rss = pss.executeQuery();
            System.out.println(qr1);
		while(rss.next())
		{
                String col=rss.getString("college_name");
                String name=rss.getString("part_name");
                System.out.println(qr1);
		if(rss.getInt("cheat_no")==chest1)
		{
		 clg1.setText(col);
                 name1.setText(name);
		}
		else if(rss.getInt("cheat_no")==chest2)
		{
                   clg2.setText(col);
                 name2.setText(name);
		}
		else if(rss.getInt("cheat_no")==chest3)
		{
                 clg3.setText(col);
                 name3.setText(name);
		}
               }
            
            //System.out.print(qr);
            rs.close();
            ps.close();
            rss.close();
            pss.close();
        }
        catch(Exception x)
        {
            //System.out.println(x);
            JOptionPane.showMessageDialog(null,x);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //String clg11,clg12,clg13,clg41,clg42,clg42,tym11,tym12,tym13,tym41,tym42,tym43;
        try{
            String qr="select * from relay ";
            
            System.out.println(qr);
            //System.out.println(qr1);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:dbms","kowreesh","kowree3801");
            PreparedStatement ps = conn.prepareStatement(qr);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
            if(rs.getInt("relay1")==1){
                relay11.setText(rs.getString("name"));
                time11.setText(rs.getString("timing1"));
            }
            if(rs.getInt("relay1")==2){
                relay12.setText(rs.getString("name"));
                time12.setText(rs.getString("timing1"));
            }
            if(rs.getInt("relay1")==3){
                relay13.setText(rs.getString("name"));
                time13.setText(rs.getString("timing1"));
            }
            if(rs.getInt("relay2")==1){
                relay41.setText(rs.getString("name"));
                time41.setText(rs.getString("timing2"));
            }
            if(rs.getInt("relay2")==2){
                relay42.setText(rs.getString("name"));
                time42.setText(rs.getString("timing2"));
            }
            if(rs.getInt("relay2")==3){
                relay43.setText(rs.getString("name"));
                time43.setText(rs.getString("timing2"));
            }}
            //System.out.print(qr);
            rs.close();
            ps.close();

        }
        catch(Exception x)
        {
            //System.out.println(x);
            JOptionPane.showMessageDialog(null,x);
        }
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void time43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time43ActionPerformed

    private void over1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_over1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_over1ActionPerformed

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
            java.util.logging.Logger.getLogger(resultview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clg1;
    private javax.swing.JTextField clg2;
    private javax.swing.JTextField clg3;
    private javax.swing.JComboBox<String> eve;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField no1;
    private javax.swing.JTextField no2;
    private javax.swing.JTextField no3;
    private javax.swing.JTextField over1;
    private javax.swing.JTextField over2;
    private javax.swing.JTextField relay11;
    private javax.swing.JTextField relay12;
    private javax.swing.JTextField relay13;
    private javax.swing.JTextField relay41;
    private javax.swing.JTextField relay42;
    private javax.swing.JTextField relay43;
    private javax.swing.JTextField time11;
    private javax.swing.JTextField time12;
    private javax.swing.JTextField time13;
    private javax.swing.JTextField time41;
    private javax.swing.JTextField time42;
    private javax.swing.JTextField time43;
    private javax.swing.JTextField tym1;
    private javax.swing.JTextField tym2;
    private javax.swing.JTextField tym3;
    // End of variables declaration//GEN-END:variables
}
