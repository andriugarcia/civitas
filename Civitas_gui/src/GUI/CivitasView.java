/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import civitas.CivitasJuego;
import civitas.OperacionesJuego;
import civitas.Respuestas;
import javax.swing.JOptionPane;

/**
 *
 * @author chemooon
 */
public class CivitasView extends javax.swing.JFrame {

    /**
     * Creates new form CivitasView
     */
    private JugadorPanel jugadorPanel;
    private CasillaPanel casillaPanel;
    private GestionarDialog gestionarD;
    
    public CivitasView() {
        initComponents();
        jugadorPanel=new JugadorPanel();
        casillaPanel=new CasillaPanel();
        contenedorVistaCasilla.add(casillaPanel);
        contenedorVistaJugador.add(jugadorPanel);
        repaint();
        revalidate();
    }
    
    public int getGestion(){return gestionarD.getGestion();}
    public int getPropiedad(){return gestionarD.getPropiedad();}
    
    void actualizarVista(){
        mostrarEventos();
        jugadorPanel.setJugador(juego.getJugadorActual());
        casillaPanel.setCasilla(juego.getCasillaActual());
        label_ranking.setVisible(false);
        textarea_ranking.setVisible(false);
        if (juego.finalDelJuego()){
            label_ranking.setVisible(true);
            textarea_ranking.setVisible(true);
            //textarea_ranking.setText(juego.);
            //Crear en CivitasJuego un toString para esto
        }
        repaint();
        revalidate();       
    }
    
    private CivitasJuego juego;
    
    public void setCivitasJuego(CivitasJuego juego){
        this.juego=juego;
        setVisible(true);
    }
    
    public void mostrarSiguienteOperacion(OperacionesJuego operacion){
        text_siguienteoperacion.setText(operacion.toString());
        actualizarVista();
    }
    
    public void mostrarEventos(){
        DiarioDialog diarioD=new DiarioDialog(this, true);
    }
    
    public Respuestas comprar(){
        int opcion=JOptionPane.showConfirmDialog(null, "¿Quieres comprar la calle actual?", "Compra", JOptionPane.YES_NO_OPTION);
        return Respuestas.values()[opcion];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        contenedorVistaJugador = new javax.swing.JPanel();
        contenedorVistaCasilla = new javax.swing.JPanel();
        label_siguienteoperacion = new javax.swing.JLabel();
        text_siguienteoperacion = new javax.swing.JTextField();
        label_ranking = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_ranking = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setText("CIVITAS");
        Titulo.setEnabled(false);

        contenedorVistaJugador.setEnabled(false);

        contenedorVistaCasilla.setEnabled(false);

        label_siguienteoperacion.setText("Siguiente operación");
        label_siguienteoperacion.setEnabled(false);

        text_siguienteoperacion.setText("jTextField1");
        text_siguienteoperacion.setEnabled(false);
        text_siguienteoperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_siguienteoperacionActionPerformed(evt);
            }
        });

        label_ranking.setText("Ranking");
        label_ranking.setEnabled(false);

        jScrollPane1.setEnabled(false);

        textarea_ranking.setColumns(20);
        textarea_ranking.setRows(5);
        jScrollPane1.setViewportView(textarea_ranking);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorVistaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_siguienteoperacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_siguienteoperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addComponent(contenedorVistaCasilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ranking)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorVistaJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contenedorVistaCasilla, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_siguienteoperacion)
                                    .addComponent(text_siguienteoperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label_ranking)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_siguienteoperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_siguienteoperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_siguienteoperacionActionPerformed

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
            java.util.logging.Logger.getLogger(CivitasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CivitasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CivitasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CivitasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CivitasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel contenedorVistaCasilla;
    private javax.swing.JPanel contenedorVistaJugador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_ranking;
    private javax.swing.JLabel label_siguienteoperacion;
    private javax.swing.JTextField text_siguienteoperacion;
    private javax.swing.JTextArea textarea_ranking;
    // End of variables declaration//GEN-END:variables
}
