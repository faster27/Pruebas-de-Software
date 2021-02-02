/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.Venta;
import persistencia.DAOProducto;
import persistencia.DAOVenta;

/**
 *
 * @author dcorr
 */
public class GUIVentas extends javax.swing.JFrame {

    /**
     * Creates new form GUIVentas
     */

   public GUIVentas() {
        initComponents();
        Calendar c1 = Calendar.getInstance();
        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH)+1);
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        
        String fecha = dia+"/"+mes+"/"+annio;
        jTextField5Fecha.setText(fecha);
        
       
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
        jTable1ProductosVenta = new javax.swing.JTable();
        jButtonRegresar = new javax.swing.JButton();
        jTextFieldCodigoProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonBuscarProducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodigoVenta = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5Fecha = new javax.swing.JTextField();
        jButton2AñadirProducto = new javax.swing.JButton();
        jTextFieldNombreProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecioVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3Vender = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1ProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "CodigoVenta", "Nombre", "Cantidad", "Fecha", "Precio/Unidad", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1ProductosVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 560, 110));

        jButtonRegresar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jTextFieldCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Codigo Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("nombre del producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Precio de venta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        jButtonBuscarProducto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButtonBuscarProducto.setText("Buscar");
        getContentPane().add(jButtonBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Codigo Venta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(jTextFieldCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 60, 20));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField5Fecha.setEditable(false);
        jTextField5Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5FechaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 100, 20));

        jButton2AñadirProducto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2AñadirProducto.setText("Añadir producto");
        jButton2AñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AñadirProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2AñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, 30));
        getContentPane().add(jTextFieldNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 90, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel8.setText("venta del producto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 320, 40));

        jTextFieldPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 90, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/result.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 280, 190));

        jButton3Vender.setText("Vender");
        jButton3Vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3VenderActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 130, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/blue-wave-background-photoshop-backgrounds_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButton3VenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3VenderActionPerformed
        JTable jTableTablaProductos1 = jTable1ProductosVenta;
        Venta nuevaVenta= new Venta();

        nuevaVenta.setCodigoproducto((int) jTableTablaProductos1.getValueAt(0, 0));
        nuevaVenta.setCodigoventa((int) jTableTablaProductos1.getValueAt(0, 1));
        nuevaVenta.setCantidadProducto((int) jTableTablaProductos1.getValueAt(0, 3));
        nuevaVenta.setFecha((String) jTableTablaProductos1.getValueAt(0, 4));
        nuevaVenta.setTotalventa((double) jTableTablaProductos1.getValueAt(0, 6));

        DAOVenta.conexion();
        DAOVenta.GuardarVenta(nuevaVenta);

        int filas=jTableTablaProductos1.getRowCount();
        int i;

        for (i =0 ; i<filas;i++){

            nuevaVenta.setCodigoproducto((int) jTableTablaProductos1.getValueAt(i, 0));
            nuevaVenta.setCodigoventa((int) jTableTablaProductos1.getValueAt(i, 1));
            nuevaVenta.setCantidadProducto((int) jTableTablaProductos1.getValueAt(i, 3));
            nuevaVenta.setFecha((String) jTableTablaProductos1.getValueAt(i, 4));
            nuevaVenta.setTotalventa((double) jTableTablaProductos1.getValueAt(i, 6));

            DAOVenta.conexion();
            DAOVenta.GuardarVentaProducto(nuevaVenta);
            DAOProducto.conexion();
            DAOProducto.ActualizarCantidad(nuevaVenta.getCodigoproducto(), nuevaVenta.getCantidadProducto(),0);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3VenderActionPerformed

    private void jButton2AñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AñadirProductoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel) jTable1ProductosVenta.getModel();
        Object [] fila=new Object[7];

        fila[0]=Integer.parseInt(jTextFieldCodigoProducto.getText());

        fila[1]=Integer.parseInt(jTextFieldCodigoVenta.getText());

        fila[2]=jTextFieldNombreProducto.getText();

        fila[3]=Integer.parseInt(jTextFieldCantidad.getText());

        fila[4]=jTextField5Fecha.getText();

        fila[5]=Double.parseDouble(jTextFieldPrecioVenta.getText());

        fila[6]=Double.parseDouble(jTextFieldCantidad.getText()) * Double.parseDouble(jTextFieldPrecioVenta.getText());

        modelo.addRow(fila);

        jTable1ProductosVenta.setModel(modelo);
    }//GEN-LAST:event_jButton2AñadirProductoActionPerformed

    private void jTextFieldCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoProductoActionPerformed

    private void jTextFieldPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioVentaActionPerformed

    private void jTextField5FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5FechaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2AñadirProducto;
    private javax.swing.JButton jButton3Vender;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1ProductosVenta;
    private javax.swing.JTextField jTextField5Fecha;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCodigoProducto;
    private javax.swing.JTextField jTextFieldCodigoVenta;
    private javax.swing.JTextField jTextFieldNombreProducto;
    private javax.swing.JTextField jTextFieldPrecioVenta;
    // End of variables declaration//GEN-END:variables
}