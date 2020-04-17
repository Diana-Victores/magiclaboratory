/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import ContenedorMDI.ContenedorMDI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class MantenimientoProducto extends javax.swing.JFrame {

    /**
     * Creates new form MantenimientoProducto
     */
    public MantenimientoProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpelicula = new javax.swing.JTextField();
        txtclasificacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Label_status = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbuenestado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("REGISTRO PELICULAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setText("NOMBRE DE PELICULA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setText("CLASIFICACION ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        jPanel1.add(txtpelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 130, -1));

        txtclasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accion", "Comedia", "Terror", "Ciencia Ficcion ", "Aventura", "Suspenso", "Romance", "Infantil", "Caricatura" }));
        txtclasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclasificacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtclasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, -1));

        jLabel4.setText(" VALOR DE RENTA ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, -1));

        jButton1.setText("REGISTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 90, -1));

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 90, -1));

        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 90, -1));

        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 90, -1));
        jPanel1.add(Label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 80, -1));

        jLabel6.setText("PRODUCTO EN BUEN ESTADO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel1.add(txtbuenestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 130, -1));

        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, -1));
        jPanel1.add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtclasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclasificacionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ContenedorMDI bita=new ContenedorMDI();
        bita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/laboratorysFM2","root","");

            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/laboratorysFM2","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into registroproductos values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtpelicula.getText().trim());
            pst.setString(3, txtclasificacion.getSelectedItem().toString());
            pst.setString(4, txtvalor.getText().trim());
            pst.setString(5, txtbuenestado.getText().trim());
            
            pst.executeUpdate();

            txtpelicula.setText("");
            txtclasificacion.setSelectedItem("");
            txtvalor.setText("");
            txtbuenestado.setText("");
           
            label_status.setText("Registro exitoso");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtid.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/laboratorysFM2", "root", "");
            PreparedStatement pst = cn.prepareStatement("update registroproductos set NombrePelicula=?, CodigoClasificacion=?, CodigoValor=?,BuenEstado = ? where ID = " + ID);

            
            pst.setString(1, txtpelicula.getText().trim());
            pst.setString(2, txtclasificacion.getSelectedItem().toString());
            pst.setString(3, txtvalor.getText().trim());
            pst.setString(4, txtbuenestado.getText().trim());
            
           
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/laboratorysFM2", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from registroproductos where ID = ?");
            pst.setString(1, txtid.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                
                txtpelicula.setText(rs.getString("NombrePelicula"));
                txtclasificacion.setSelectedItem(rs.getString("CodigoClasificacion"));
                txtvalor.setText(rs.getString("CodigoValor"));
                txtbuenestado.setText(rs.getString("BuenEstado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/laboratorysFM2", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from registroproductos where ID = ?");

            pst.setString(1, txtid.getText().trim());
            
            pst.executeUpdate();
            txtpelicula.setText("");
            txtclasificacion.setSelectedItem("");
            txtvalor.setText("");
            txtbuenestado.setText("");
           
            

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_status;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txtbuenestado;
    private javax.swing.JComboBox<String> txtclasificacion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpelicula;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
