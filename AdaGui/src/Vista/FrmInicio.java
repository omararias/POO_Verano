/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author juan.ucan
 */
public class FrmInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrmInicio
     */
    public FrmInicio() {
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

        lbTitulo = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        menuBarInicio = new javax.swing.JMenuBar();
        menuEmpleados = new javax.swing.JMenu();
        menuItemAsalariado = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuNomina = new javax.swing.JMenu();
        menuItemGeneraNomina = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SRH");
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lbTitulo.setText("Sistema de Recursos Humanos");

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/rh.jpeg"))); // NOI18N

        menuEmpleados.setText("Empleados");

        menuItemAsalariado.setText("Asalariado");
        menuItemAsalariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAsalariadoActionPerformed(evt);
            }
        });
        menuEmpleados.add(menuItemAsalariado);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuEmpleados.add(menuItemSalir);

        menuBarInicio.add(menuEmpleados);

        menuNomina.setText("Nómina");

        menuItemGeneraNomina.setText("Genera nómina");
        menuItemGeneraNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGeneraNominaActionPerformed(evt);
            }
        });
        menuNomina.add(menuItemGeneraNomina);

        menuBarInicio.add(menuNomina);

        setJMenuBar(menuBarInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbTitulo)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbTitulo)
                .addGap(36, 36, 36)
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAsalariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAsalariadoActionPerformed
        // TODO add your handling code here:
        new FrmEmpleadoAsalariado().setVisible(true);
    }//GEN-LAST:event_menuItemAsalariadoActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemGeneraNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGeneraNominaActionPerformed
        // TODO add your handling code here:
        new FrmNomina().setVisible(true);
    }//GEN-LAST:event_menuItemGeneraNominaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar menuBarInicio;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenuItem menuItemAsalariado;
    private javax.swing.JMenuItem menuItemGeneraNomina;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuNomina;
    // End of variables declaration//GEN-END:variables
}
