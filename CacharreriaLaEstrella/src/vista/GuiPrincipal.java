/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**.
 *
 * @author dcorr
 */
public class GuiPrincipal extends javax.swing.JFrame {

  /**.
  * Creates new form GUIPrincipal
  */
  public GuiPrincipal() {
      
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
        jButtonProductos = new javax.swing.JButton();
        jButtonCompra = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButton1Informes = new javax.swing.JButton();
        jButton1Registrarfiado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1AvisoVencimiento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CACHARRERIA LA ESTRELLA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 40));

        jButtonProductos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonProductos.setText("Registrar Productos");
        jButtonProductos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonProductosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 40));

        jButtonCompra.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonCompra.setText("ComprarProductos");
        jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, 40));

        jButtonVender.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonVender.setText("VenderProductos");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 40));

        jButton1Informes.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton1Informes.setText("Informes");
        jButton1Informes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InformesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Informes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 40));

        jButton1Registrarfiado.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton1Registrarfiado.setText("Registrar fiado");
        jButton1Registrarfiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegistrarfiadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Registrarfiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/580b585b2edbce24c47b2422_opt_1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 370, 280));

        jButton1AvisoVencimiento.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton1AvisoVencimiento.setText("Alerta Vencimiento");
        jButton1AvisoVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AvisoVencimientoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AvisoVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/blue-wave-background-photoshop-backgrounds_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
        // TODO add your handling code here:
        GuiCompra VentanaCompra = new GuiCompra();
        VentanaCompra.setVisible(true);       
    }//GEN-LAST:event_jButtonCompraActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        // TODO add your handling code here:
        GuiProductos VentanaProductos = new GuiProductos();
        VentanaProductos.setVisible(true);      
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        // TODO add your handling code here:
        GuiVentas VentanaVentas = new GuiVentas();
        VentanaVentas.setVisible(true);
        
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jButton1InformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InformesActionPerformed
        // TODO add your handling code here:
        
        GuiInformes VentanaInformes = new GuiInformes();
        VentanaInformes.setVisible(true);
        
       //SELECT productos.categoria, SUM(venta.totalventa) as TotalCategoria
		   
//FROM productos INNER JOIN venta ON productos.codigo = venta.codigoproducto 
//where venta.fecha between '19/1/2021' and '19/1/2021' 
//group by productos.categoria
    }//GEN-LAST:event_jButton1InformesActionPerformed

    private void jButton1RegistrarfiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegistrarfiadoActionPerformed
        // TODO add your handling code here:
        GuiFiado VentanaFiado = new GuiFiado();
        VentanaFiado.setVisible(true);
    }//GEN-LAST:event_jButton1RegistrarfiadoActionPerformed

    private void jButtonProductosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonProductosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProductosAncestorAdded

    private void jButton1AvisoVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AvisoVencimientoActionPerformed
        // TODO add your handling code here:
        GuiProductosVencimiento NuevaVentana= new GuiProductosVencimiento();
        
        NuevaVentana.setVisible(true);   
    }//GEN-LAST:event_jButton1AvisoVencimientoActionPerformed

  /**.
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
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GuiPrincipal().setVisible(false);
      }
        });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1AvisoVencimiento;
    private javax.swing.JButton jButton1Informes;
    private javax.swing.JButton jButton1Registrarfiado;
    private javax.swing.JButton jButtonCompra;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    
}
