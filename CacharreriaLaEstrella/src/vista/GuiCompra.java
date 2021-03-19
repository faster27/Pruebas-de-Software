/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import Logica.Cpp;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import persistencia.DaoCompra;
import persistencia.DaoProducto;

/**.
 *
 * @author dcorr
 */
public class GuiCompra extends javax.swing.JFrame {

  /**.
  * Creates new form GUICompra
  */
  public GuiCompra() {
    initComponents();
    Calendar c1 = Calendar.getInstance();
    String dia = Integer.toString(c1.get(Calendar.DATE));
    String mes = Integer.toString(c1.get(Calendar.MONTH) + 1);
    String annio = Integer.toString(c1.get(Calendar.YEAR));
        
    String fecha = dia + "/" + mes + "/" + annio;
    jTextFieldFecha.setText(fecha);
        
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2TablaCompras = new javax.swing.JTable();
        jButtonRegresar = new javax.swing.JButton();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1CodigoCompra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2PrecioDeCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3Cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1codigoproducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4NombreProducto = new javax.swing.JTextField();
        jButtonAñadirCompraProducto = new javax.swing.JButton();
        jButtonFinalizarCompra = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1FechaVencimiento = new javax.swing.JTextField();
        jTextField2FechaAviso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2TablaCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2TablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Compra", "Nombre Producto", "Cantidad", "Precio Compra", "Fecha", "Precio neto", "codigoProducto", "Fecha Vencimiento", "Fecha Aviso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2TablaCompras);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 700, 109));

        jButtonRegresar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jTextFieldFecha.setEditable(false);
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTextField1CodigoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1CodigoCompraKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1CodigoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 100, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("codigo compra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Precio de compra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jTextField2PrecioDeCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2PrecioDeCompraKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2PrecioDeCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, -1));

        jTextField3Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3CantidadActionPerformed(evt);
            }
        });
        jTextField3Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3CantidadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("codigo producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jTextField1codigoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1codigoproductoActionPerformed(evt);
            }
        });
        jTextField1codigoproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1codigoproductoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1codigoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("nombre producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, -1));
        getContentPane().add(jTextField4NombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, -1));

        jButtonAñadirCompraProducto.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonAñadirCompraProducto.setText("Agregar compra");
        jButtonAñadirCompraProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirCompraProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadirCompraProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jButtonFinalizarCompra.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonFinalizarCompra.setText("Finalizar compra");
        jButtonFinalizarCompra.setEnabled(false);
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 170, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/640-6400983_0-carrito-de-compras-rosado_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 190, 180));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Fecha de vencimiento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, 20));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setText("Fecha de Aviso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 100, -1));

        jTextField1FechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1FechaVencimientoActionPerformed(evt);
            }
        });
        jTextField1FechaVencimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1FechaVencimientoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1FechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 110, -1));
        getContentPane().add(jTextField2FechaAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, -1));

        jLabel11.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Compra de productos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 480, 30));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("dia/mes/año");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 110, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("dia/mes/año");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 110, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/blue-wave-background-photoshop-backgrounds_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 460));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("dia/mes/año");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**.
     * jButtonAñadirCompraProductoActionPerformed no se puede modificar
     * @param evt .
     */
    private void jButtonAñadirCompraProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirCompraProductoActionPerformed
              // TODO add your handling code here:
        
              if ( jTextField1CodigoCompra.getText().isEmpty() ||
              jTextField4NombreProducto.getText().isEmpty() ||
              jTextField3Cantidad.getText().isEmpty() ||
              jTextField2PrecioDeCompra.getText().isEmpty() ||
              jTextFieldFecha.getText().isEmpty() ||
              jTextField1codigoproducto.getText().isEmpty() ||
              jTextField1FechaVencimiento.getText().isEmpty() ||
              jTextField2FechaAviso.getText().isEmpty()    
                               
    ) {
      JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
                
    } else {   
      DefaultTableModel modelo=(DefaultTableModel) jTable2TablaCompras.getModel(); 
      Object [] fila = new Object[9];
        
      fila[0] = Integer.parseInt(jTextField1CodigoCompra.getText()); 

      fila[1] = jTextField4NombreProducto.getText(); 

      fila[2] = Integer.parseInt(jTextField3Cantidad.getText()); 

      fila[3] = Double.parseDouble(jTextField2PrecioDeCompra.getText()); 
        
      fila[4] = jTextFieldFecha.getText(); 
        
      fila[5] = Double.parseDouble(jTextField2PrecioDeCompra.getText())
              * Integer.parseInt(jTextField3Cantidad.getText());
        
      fila[6] = jTextField1codigoproducto.getText();
        
      fila[7] = jTextField1FechaVencimiento.getText();
         
      fila[8] = jTextField2FechaAviso.getText();
       
      modelo.addRow(fila); 
        
      jTable2TablaCompras.setModel(modelo);
      jButtonFinalizarCompra.setEnabled(true);
        
    }
    }//GEN-LAST:event_jButtonAñadirCompraProductoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);  
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed
        // TODO add your handling code here:
         Compra nuevaCompra= new Compra();
         JTable jTableTablaCompras1 = jTable2TablaCompras;
            nuevaCompra.setcodigoCompra((int) jTableTablaCompras1.getValueAt(0, 0));
            nuevaCompra.setPrecioCompraProducto((double) jTableTablaCompras1.getValueAt(0, 3));
            nuevaCompra.setCantidad((int) jTableTablaCompras1.getValueAt(0, 2));
            nuevaCompra.setFecha((String) jTableTablaCompras1.getValueAt(0, 4));
            nuevaCompra.setCodigoProducto(Integer.parseInt((String) jTableTablaCompras1.getValueAt(0, 6)));
            
            DaoCompra.conexion();
            DaoCompra.guardarCompra(nuevaCompra);
        
        
    int filas = jTableTablaCompras1.getRowCount();
    int i;
        
    for (i = 0 ; i < filas;i++) {
                   
                                   
      nuevaCompra.setcodigoCompra((int) jTableTablaCompras1.getValueAt(i, 0));
      nuevaCompra.setCantidad((int) jTableTablaCompras1.getValueAt(i, 2));
      nuevaCompra.setPrecioCompraProducto((double) jTableTablaCompras1.getValueAt(i, 3));
      nuevaCompra.setFecha((String) jTableTablaCompras1.getValueAt(i, 4));
      nuevaCompra.setCodigoProducto(Integer.parseInt((String) jTableTablaCompras1.getValueAt(i,6)));
            
      String fechaVencimiento = (String) jTableTablaCompras1.getValueAt(i, 7);
      String fechaAviso = (String) jTableTablaCompras1.getValueAt(i, 8);
      double totalVenta = (double) jTableTablaCompras1.getValueAt(i, 5);
            
      DaoCompra.conexion();
           
      DaoCompra.guardarCompraProducto(nuevaCompra, fechaVencimiento, fechaAviso,totalVenta);
      DaoProducto.conexion();
      int cppActual = DaoProducto.consultarCpp(nuevaCompra.getCodigoProducto());
      int cantidadstockactual = DaoProducto.consultarCantidad(nuevaCompra.getCodigoProducto());
           
      DaoProducto.actualizarCantidad(nuevaCompra.getCodigoProducto(), nuevaCompra.getCantidad(),1);
               
      double cppNuevo;
      cppNuevo = Cpp.actualizarCpp(cantidadstockactual, cppActual, 
              nuevaCompra.getCantidad(),nuevaCompra.getPrecioCompraProducto());
      DaoProducto.conexion();
      DaoProducto.actualizarCpp(nuevaCompra.getCodigoProducto(), cppNuevo);      
    }
    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed

    private void jTextField1codigoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1codigoproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1codigoproductoActionPerformed

    private void jTextField1codigoproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1codigoproductoKeyTyped
        // TODO add your handling code here:
      char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) )
      {
         evt.consume();  // ignorar el evento de teclado
      }else{
        
      }
        
        
    }//GEN-LAST:event_jTextField1codigoproductoKeyTyped

    private void jTextField1CodigoCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1CodigoCompraKeyTyped
       // TODO add your handling code here:
        
         char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) )
      {
         evt.consume();  // ignorar el evento de teclado
      }else{
        
      }
    }//GEN-LAST:event_jTextField1CodigoCompraKeyTyped

    private void jTextField2PrecioDeCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2PrecioDeCompraKeyTyped
      // TODO add your handling code here:
        
      char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada  es un digito
      // Verificar si la tecla pulsada no es un digito
      if(Character.isDigit(caracter))
      {
          
      }else{
          getToolkit().beep();
          evt.consume();  // ignorar el evento de teclado
      }
      
      
    }//GEN-LAST:event_jTextField2PrecioDeCompraKeyTyped

    private void jTextField3CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3CantidadActionPerformed

    private void jTextField3CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3CantidadKeyTyped
      // TODO add your handling code here:
      char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada  es un digito
      // Verificar si la tecla pulsada no es un digito
      if(Character.isDigit(caracter))
      {
          
      }else{
        getToolkit().beep();
        evt.consume();  // ignorar el evento de teclado
      }
    }//GEN-LAST:event_jTextField3CantidadKeyTyped

    private void jTextField1FechaVencimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1FechaVencimientoKeyTyped
      // TODO add your handling code here:
        
      char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada  es un digito
      // Verificar si la tecla pulsada no es un digito
      if(Character.isDigit(caracter) || caracter=='/')
      {
          
      }else{
          getToolkit().beep();
          evt.consume();  // ignorar el evento de teclado
      }
    }//GEN-LAST:event_jTextField1FechaVencimientoKeyTyped

    private void jTextField1FechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1FechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FechaVencimientoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new GuiCompra().setVisible(true);
        }
        });
  }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadirCompraProducto;
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JButton jButtonRegresar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2TablaCompras;
    private javax.swing.JTextField jTextField1CodigoCompra;
    private javax.swing.JTextField jTextField1FechaVencimiento;
    private javax.swing.JTextField jTextField1codigoproducto;
    private javax.swing.JTextField jTextField2FechaAviso;
    private javax.swing.JTextField jTextField2PrecioDeCompra;
    private javax.swing.JTextField jTextField3Cantidad;
    private javax.swing.JTextField jTextField4NombreProducto;
    private javax.swing.JTextField jTextFieldFecha;
    // End of variables declaration//GEN-END:variables
}
