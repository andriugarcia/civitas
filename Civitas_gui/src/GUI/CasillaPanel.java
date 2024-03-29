/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.Casilla;

/**
 *
 * @author chemooon
 */
public class CasillaPanel extends javax.swing.JPanel {

    /**
     * Creates new form CasillaPanel
     */
    public CasillaPanel() {
        initComponents();
    }
    
    private Casilla casilla;
    
    public void setCasilla(Casilla casilla){
        this.casilla=casilla;
        text_nombre.setText(casilla.getNombre());
        text_importe.setText(String.valueOf(casilla.getImporte()));
        text_tipo.setText(casilla.getTipo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        label_tipo = new javax.swing.JLabel();
        text_tipo = new javax.swing.JTextField();
        label_importe = new javax.swing.JLabel();
        text_importe = new javax.swing.JTextField();

        titulo.setText("CASILLA ACTUAL");
        titulo.setEnabled(false);

        text_nombre.setText("Nombre");
        text_nombre.setEnabled(false);
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });

        label_tipo.setText("Tipo");
        label_tipo.setEnabled(false);

        text_tipo.setText("jTextField1");
        text_tipo.setEnabled(false);
        text_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tipoActionPerformed(evt);
            }
        });

        label_importe.setText("Importe");
        label_importe.setEnabled(false);

        text_importe.setText("jTextField2");
        text_importe.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_importe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_tipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tipo)
                    .addComponent(text_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_importe)
                    .addComponent(text_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void text_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_importe;
    private javax.swing.JLabel label_tipo;
    private javax.swing.JTextField text_importe;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_tipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
