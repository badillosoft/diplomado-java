/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cic;

/**
 *
 * @author kmmx
 */
public class MiVentana extends javax.swing.JFrame {

    /**
     * Creates new form MiVentana
     */
    public MiVentana() {
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

        hello3 = new cic.Hello();
        txt_x1 = new javax.swing.JTextField();
        txt_x2 = new javax.swing.JTextField();
        txt_y1 = new javax.swing.JTextField();
        txt_y2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout hello3Layout = new javax.swing.GroupLayout(hello3);
        hello3.setLayout(hello3Layout);
        hello3Layout.setHorizontalGroup(
            hello3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hello3Layout.setVerticalGroup(
            hello3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        txt_x1.setText("0");
        txt_x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_x1KeyReleased(evt);
            }
        });

        txt_x2.setText("0");
        txt_x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_x2KeyReleased(evt);
            }
        });

        txt_y1.setText("0");
        txt_y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_y1KeyReleased(evt);
            }
        });

        txt_y2.setText("0");
        txt_y2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_y2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hello3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_x1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(txt_x2)
                    .addComponent(txt_y1)
                    .addComponent(txt_y2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hello3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_x1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_x1KeyReleased
        try {
            this.hello3.x1 = Integer.parseInt(this.txt_x1.getText());
            this.hello3.repaint();
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_txt_x1KeyReleased

    private void txt_x2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_x2KeyReleased
        try {
            this.hello3.x2 = Integer.parseInt(this.txt_x2.getText());
            this.hello3.repaint();
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_txt_x2KeyReleased

    private void txt_y1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_y1KeyReleased
        try {
            this.hello3.y1 = Integer.parseInt(this.txt_y1.getText());
            this.hello3.repaint();
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_txt_y1KeyReleased

    private void txt_y2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_y2KeyReleased
        try {
            this.hello3.y2 = Integer.parseInt(this.txt_y2.getText());
            this.hello3.repaint();
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_txt_y2KeyReleased

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
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private cic.Hello hello3;
    private javax.swing.JTextField txt_x1;
    private javax.swing.JTextField txt_x2;
    private javax.swing.JTextField txt_y1;
    private javax.swing.JTextField txt_y2;
    // End of variables declaration//GEN-END:variables
}
