/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Fiado;
import persistencia.DaoFiado;

/**.
 *
 * @author dcorr
 */
public class GuiFiado extends javax.swing.JFrame {

  /**.
  * Creates new form GUIFiado
  */
  public GuiFiado() {
    initComponents();
  }

  /**.
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2nombrecliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3totalfiado = new javax.swing.JTextField();
        jButton1ActualizarFiado = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3RegistrarFiado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Fiados = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4ConsultarFiado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel1.setText("Cedula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 64, -1));

        jTextField1cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1cedulaActionPerformed(evt);
            }
        });
        jTextField1cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 80, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Nombre cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        getContentPane().add(jTextField2nombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Total fiado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jTextField3totalfiado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField3totalfiado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3totalfiadoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3totalfiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 82, -1));

        jButton1ActualizarFiado.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton1ActualizarFiado.setText("Actualizar fiado existente");
        jButton1ActualizarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarFiadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1ActualizarFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 220, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setText("Abonar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 110, 160, -1));

        jButton3RegistrarFiado.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton3RegistrarFiado.setText("Registrar fiado");
        jButton3RegistrarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3RegistrarFiadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3RegistrarFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 160, -1));

        jTable1Fiados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Valor Fiado", "Abono", "Deuda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1Fiados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, 450, 140));

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton3.setText("regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jButton4ConsultarFiado.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton4ConsultarFiado.setText("Consultar fiado");
        jButton4ConsultarFiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ConsultarFiadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4ConsultarFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/blue-wave-background-photoshop-backgrounds_opt.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3RegistrarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3RegistrarFiadoActionPerformed
        // TODO add your handling code here:
        
        
      if (jTextField1cedula.getText().isEmpty() ||
        jTextField2nombrecliente.getText().isEmpty() ||
        jTextField3totalfiado.getText().isEmpty()
        ){
                
          JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos");
        
       }else {
        
        Fiado nuevoFiado= new Fiado();
            
        nuevoFiado.setCedula(Integer.parseInt(jTextField1cedula.getText()));
        nuevoFiado.setNombrecliente(jTextField2nombrecliente.getText());
        nuevoFiado.setCantidadfiada(Double.parseDouble(jTextField3totalfiado.getText()));
        nuevoFiado.setAbono(0.0);
           
            
        DaoFiado.conexion();
        DaoFiado.guardarFiado(nuevoFiado);
    }
        
    }//GEN-LAST:event_jButton3RegistrarFiadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String cedula=JOptionPane.showInputDialog("Ingrese la cedula del cliente al cual abonar");
        String abono=JOptionPane.showInputDialog("Ingrese el valor a abonar");
        
 
       
        try {
            
             int cedula1 = Integer.parseInt(cedula);
             double abono1=Double.parseDouble(abono);
             
             double abono2= DaoFiado.consultarAbono(cedula1);
             double Fiado=DaoFiado.consultarFiado(cedula1);
             
             double Deuda = Fiado-abono2;
             
             if (abono1 <= Deuda ){
                DaoFiado.conexion();
                DaoFiado.actualizarAbono(abono1, cedula1);
             
             }else {
                 JOptionPane.showMessageDialog(this, "el valor a abonar es  mayor que el valor deuda");
             }
             
              
        
        }
        catch (NumberFormatException e) {
          
            JOptionPane.showMessageDialog(this, "Los datos ingresados son erroneos o los campos estan vacios");
        }
        
        
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActualizarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarFiadoActionPerformed
        // TODO add your handling code here:
        
        String cedula=JOptionPane.showInputDialog("Ingrese la cedula del cliente al cual fiara");
        String Fiadonuevo=JOptionPane.showInputDialog("Ingrese el valor del nuevo fiado");
        
        try {
            
             int cedula1 = Integer.parseInt(cedula);
             double Fiadonuevo1=Double.parseDouble(Fiadonuevo);
              DaoFiado.conexion();
              DaoFiado.actualizarFiado(Fiadonuevo1, cedula1);
        
        }
        catch (NumberFormatException e) {
          
            JOptionPane.showMessageDialog(this, "Los datos ingresados son erroneos o los campos estan vacios");
        }
       
        
        
       
    }//GEN-LAST:event_jButton1ActualizarFiadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    this.setVisible(false);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1cedulaKeyTyped
        // TODO add your handling code here:
        
        char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) )
      {
         evt.consume();  // ignorar el evento de teclado
      }else{
        
      }
    }//GEN-LAST:event_jTextField1cedulaKeyTyped

    private void jTextField3totalfiadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3totalfiadoKeyTyped
        // TODO add your handling code here:
        
        char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') || (caracter > '9')) )
      {
         evt.consume();  // ignorar el evento de teclado
      }else{
        
      }
    }//GEN-LAST:event_jTextField3totalfiadoKeyTyped

    private void jTextField1cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1cedulaActionPerformed

    private void jButton4ConsultarFiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ConsultarFiadoActionPerformed
        // TODO add your handling code here:
        
        
        String cedula=JOptionPane.showInputDialog("Ingrese la cedula del cliente al cual consultara");
        
        
        Fiado cliente = new Fiado();
         
        try {
            
            int cedula1 = Integer.parseInt(cedula);
             
            DaoFiado.conexion();
            cliente = DaoFiado.consultarCliente(cedula1);
             
            DefaultTableModel modelo= (DefaultTableModel) jTable1Fiados.getModel();
            
            if (modelo.getRowCount() >0){
             modelo.removeRow(0);
            
            }
            
           
            modelo.addRow(new Object[]{"","","","",""});

            jTable1Fiados.setModel(modelo);   
             
            jTable1Fiados.setValueAt(cliente.getCedula(), 0 ,0);
            jTable1Fiados.setValueAt(cliente.getNombrecliente(), 0 ,1);
            jTable1Fiados.setValueAt(cliente.getCantidadfiada(), 0 ,2); 
            jTable1Fiados.setValueAt(cliente.getAbono(), 0 ,3);
            jTable1Fiados.setValueAt(cliente.getCantidadfiada()-cliente.getAbono(), 0 ,4);
            
        }
        catch (NumberFormatException e) {
          
            JOptionPane.showMessageDialog(this, "Los datos ingresados son erroneos o los campos estan vacios");
        } 
        
    }//GEN-LAST:event_jButton4ConsultarFiadoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFiado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiFiado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ActualizarFiado;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton3RegistrarFiado;
    private javax.swing.JButton jButton4ConsultarFiado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Fiados;
    private javax.swing.JTextField jTextField1cedula;
    private javax.swing.JTextField jTextField2nombrecliente;
    private javax.swing.JTextField jTextField3totalfiado;
    // End of variables declaration//GEN-END:variables
}
