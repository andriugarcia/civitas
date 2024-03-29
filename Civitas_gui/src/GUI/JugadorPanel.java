/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import civitas.Jugador;
import civitas.TituloPropiedad;
import java.util.ArrayList;

/**
 *
 * @author chemooon
 */
public class JugadorPanel extends javax.swing.JPanel {

    /**
     * Creates new form JugadorPanel
     */
    public JugadorPanel() {
        initComponents();
    }
    
    private Jugador jugador;
    
    public void setJugador(Jugador jugador){
        this.jugador=jugador;
        text_nombre.setText(jugador.getNombre());
        text_saldo.setText(String.valueOf(jugador.getSaldo()));
        text_encarcelado.setText(String.valueOf(jugador.isEncarcelado()));
        text_especulador.setText(String.valueOf(jugador.isEspeculador()));
        rellenaPropiedades(jugador.getPropiedades());
    }
    
    private void rellenaPropiedades (ArrayList<TituloPropiedad> lista){
        propiedades.removeAll();
        for (TituloPropiedad t:lista){
            PropiedadPanel vistaPropiedad=new PropiedadPanel();
            vistaPropiedad.setPropiedad(t);
            
            propiedades.add(vistaPropiedad);
            vistaPropiedad.setVisible(true);
        }
        repaint();
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_nombre = new javax.swing.JLabel();
        label_saldo = new javax.swing.JLabel();
        label_encarcelado = new javax.swing.JLabel();
        label_especulador = new javax.swing.JLabel();
        text_nombre = new javax.swing.JTextField();
        text_saldo = new javax.swing.JTextField();
        text_encarcelado = new javax.swing.JTextField();
        text_especulador = new javax.swing.JTextField();
        propiedades = new javax.swing.JPanel();

        label_nombre.setText("Nombre");
        label_nombre.setEnabled(false);

        label_saldo.setText("Saldo");
        label_saldo.setEnabled(false);

        label_encarcelado.setText("Encarcelado");
        label_encarcelado.setEnabled(false);

        label_especulador.setText("Especulador");
        label_especulador.setEnabled(false);

        text_nombre.setText("nombre");
        text_nombre.setEnabled(false);
        text_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nombreActionPerformed(evt);
            }
        });

        text_saldo.setText("saldo");
        text_saldo.setEnabled(false);
        text_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_saldoActionPerformed(evt);
            }
        });

        text_encarcelado.setText("encarcelado");
        text_encarcelado.setEnabled(false);

        text_especulador.setText("especulador");
        text_especulador.setEnabled(false);
        text_especulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_especuladorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre)
                    .addComponent(label_encarcelado)
                    .addComponent(label_saldo)
                    .addComponent(label_especulador))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_encarcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_especulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_saldo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_encarcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_encarcelado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_especulador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_especulador))
                .addGap(18, 18, 18)
                .addComponent(propiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nombreActionPerformed

    private void text_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_saldoActionPerformed

    private void text_especuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_especuladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_especuladorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_encarcelado;
    private javax.swing.JLabel label_especulador;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_saldo;
    private javax.swing.JPanel propiedades;
    private javax.swing.JTextField text_encarcelado;
    private javax.swing.JTextField text_especulador;
    private javax.swing.JTextField text_nombre;
    private javax.swing.JTextField text_saldo;
    // End of variables declaration//GEN-END:variables
}
