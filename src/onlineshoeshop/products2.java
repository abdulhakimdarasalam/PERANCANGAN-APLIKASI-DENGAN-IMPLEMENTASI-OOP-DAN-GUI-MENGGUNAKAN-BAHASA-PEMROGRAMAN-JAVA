package onlineshoeshop;

import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class products2 extends javax.swing.JFrame {
    private Statement St;
    private Connection con;
    private ResultSet Rs;
    private String sql="";
    
    public String brand;
    public String nm_sepatu;
    public int harga;
    public String ukuran;
    public String deskripsi;
    
    /**
     * Creates new form mainMenu
     */
    public void koneksiDatabase(){
        try {
            //menentukan driver database
            Class.forName("com.mysql.cj.jdbc.Driver");
            //untuk mengkoneksikan ke database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_tokosepatu", "root", "");
            //pesan koneksi berhasil
            System.out.println("koneksi berhasil!");
        } catch (Exception e) {
            //pesan koneksi gagal
            System.out.println("koneksi gagal!" + e.getMessage());
        }
    }
    
    Connection getConnection() {
        return con; 
    }
    
    public void disconnect() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void pullFromDb(Connection con, String kd){
        try {
            String query = "SELECT * FROM SEPATU WHERE kd_sepatu=?";
            
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, kd);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                brand = resultSet.getString("brand");
                nm_sepatu = resultSet.getString("nm_sepatu");
                harga = resultSet.getInt("harga");
                deskripsi = resultSet.getString("deskripsi");
            }
            ukuran = (String) cbUkuran.getSelectedItem();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public products2() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lBrand = new javax.swing.JLabel();
        lHarga = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        bCart = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lNama = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        cbUkuran = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 600));
        setPreferredSize(new java.awt.Dimension(360, 600));
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(360, 1200));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 45, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlineshoeshop/solesphere_logo3-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 6, -1, 101));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(260, 260));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 125, -1, -1));

        lBrand.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lBrand.setText("NEW BALANCE");
        jPanel1.add(lBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 403, 360, -1));

        lHarga.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lHarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHarga.setText("Rp3.100.000");
        jPanel1.add(lHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 456, 360, -1));

        jLabel5.setText("Ukuran Tersedia : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 487, -1, -1));

        jLabel6.setText("Warna Tersedia : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 509, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlineshoeshop/990v6 navy (1).jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 509, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlineshoeshop/990v6 black (1).jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 509, -1, -1));

        bCart.setText("Add to cart");
        bCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCartActionPerformed(evt);
            }
        });
        jPanel1.add(bCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 700, -1, -1));

        jLabel7.setText("Deskripsi : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 568, -1, -1));

        lNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNama.setText("  MADE IN USA 990v6");
        jPanel1.add(lNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 360, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(250, 100));

        taDesc.setEditable(false);
        taDesc.setBackground(new java.awt.Color(255, 204, 255));
        taDesc.setColumns(20);
        taDesc.setLineWrap(true);
        taDesc.setRows(5);
        taDesc.setWrapStyleWord(true);
        jScrollPane2.setViewportView(taDesc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 590, -1, -1));

        cbUkuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "37", "38", "39", "40", "41" }));
        jPanel1.add(cbUkuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 360, 600);

        setSize(new java.awt.Dimension(376, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home hm = new Home();
        hm.setVisible(true);
        hm.setLocationRelativeTo(null);
        hm.setDefaultCloseOperation(Home.DISPOSE_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void saveToDatabase(Connection conn, String username) {
        try {
            // Query untuk menyimpan data ke tabel akun
            String userN = username.concat("_cart");
            String query = "INSERT INTO " + userN + " (brand, nm_sepatu, harga, ukuran) VALUES (?, ?, ?, ?)";

            // Persiapan statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.brand);
            preparedStatement.setString(2, this.nm_sepatu);
            preparedStatement.setInt(3, this.harga);
            preparedStatement.setString(4, this.ukuran);
            // Eksekusi query
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void bCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCartActionPerformed
        // TODO add your handling code here:
        try {
            koneksiDatabase();
            Login lg = new Login();
            saveToDatabase(getConnection(), lg.usernameLogin);
            Home hm = new Home();
            hm.setVisible(true);
            hm.setLocationRelativeTo(null);
            hm.setDefaultCloseOperation(Home.DISPOSE_ON_CLOSE);
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bCartActionPerformed

    /**
     * @param args the command line arguments
     */
    public String kode;
    public void change(int x) {
        koneksiDatabase();
        if (x == 1) {
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/(1)1080v3 product.png")));
            kode = "SP1";
            pullFromDb(getConnection(), kode);
            lBrand.setText(brand);
            lNama.setText(nm_sepatu);
            lHarga.setText("Rp."+Integer.toString(harga));
            taDesc.setText(deskripsi);
        }
        
        else if (x == 2) {
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlineshoeshop/990v6_product-removebg-preview.png")));
            kode = "SP2";
            pullFromDb(getConnection(), kode);
            lBrand.setText(brand);
            lNama.setText(nm_sepatu);
            lHarga.setText("Rp."+Integer.toString(harga));
            taDesc.setText(deskripsi);
        } else {
            jLabel8.hide();
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
            java.util.logging.Logger.getLogger(products2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(products2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(products2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(products2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCart;
    private javax.swing.JComboBox<String> cbUkuran;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lBrand;
    private javax.swing.JLabel lHarga;
    private javax.swing.JLabel lNama;
    private javax.swing.JTextArea taDesc;
    // End of variables declaration//GEN-END:variables
}
