/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class activeRequestsPanel extends javax.swing.JFrame {

    /**
     * Creates new form activeRequestsPanel
     */
    public activeRequestsPanel() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        jTable2.setModel(model);
        model.addColumn("Request ID");
        model.addColumn("Student ID");
        model.addColumn("Student Name");
        model.addColumn("Reason to Leave");
        model.addColumn("Leaving Date");
        model.addColumn("Leaving Time");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "abcd");
            Statement sta = con.createStatement();
            ResultSet res = sta.executeQuery("select a.requestid,a.studentid,a.reason,a.date,a.time,s.studentname from activerequests a, studentdetails s where a.studentid=s.studentid");
            if (res.next() == false) {
                
            } else {

                do {

                    String a = res.getString(1);
                    String s = res.getString(2);
                    String r = res.getString(3);
                    String d = res.getString(4);
                    String t = res.getString(5);
                    String n = res.getString(6);

                    model.addRow(new Object[]{
                        a, s, n, r, d, t
                    });

                } while (res.next());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("A c t i v e  R e q u e s t s");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(320, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(320, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 70, 320, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter request ID for action");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 572, -1, -1));

        jButton1.setBackground(new java.awt.Color(30, 215, 96));
        jButton1.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/myPackage/view/images/btn-go-back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, -1, -1));

        jButton2.setBackground(new java.awt.Color(30, 215, 96));
        jButton2.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/myPackage/view/images/btn-options.png"))); // NOI18N
        jButton2.setActionCommand("A c t i o n");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, -1, -1));

        jTable2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jTable2.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 107, 850, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/myPackage/view/images/background.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1040, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        wardenPanel n = new wardenPanel();
        n.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void decline(String id){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "abcd");
            Statement sta = con.createStatement();
            sta.executeUpdate("delete from activerequests where requestid='"+id+"'");
            this.dispose();
            activeRequestsPanel n = new activeRequestsPanel();
            n.setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public void accept(String id){
         String stud="";
         String d="";
         String t="";
         String reason="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostelmanagement", "root", "abcd");
            
            Statement s=con.createStatement();
            ResultSet r= s.executeQuery("select * from activerequests where requestid='"+id+"'");
            while(r.next()){
                stud=r.getString("studentid");
                t=r.getString("time");
                d=r.getString("date");
                reason=r.getString("reason");
            }
            
            Statement st = con.createStatement();
            st.executeUpdate("insert into confirmedrequests(studentid,departuretime,departuredate,type,reason) values('"+stud+"','"+t+"','"+d+"','Normal','"+reason+"')");
            
            Statement sta = con.createStatement();
            sta.executeUpdate("delete from activerequests where requestid='"+id+"'");
            this.dispose();
            activeRequestsPanel n = new activeRequestsPanel();
            n.setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object[] options = {"Accept Request",
            "Decline Request"};
        int n = JOptionPane.showOptionDialog(null,
                "What do you want to do ?",
                "Alert",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if (n == JOptionPane.YES_OPTION) {
            accept(jTextField1.getText());
        } else if (n == JOptionPane.NO_OPTION) {
            decline(jTextField1.getText());
        }
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
            java.util.logging.Logger.getLogger(activeRequestsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(activeRequestsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(activeRequestsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(activeRequestsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new activeRequestsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}