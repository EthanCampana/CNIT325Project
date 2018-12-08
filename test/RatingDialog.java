
public class RatingDialog extends javax.swing.JDialog {

    private int rating = 0;
    int Finalrating = 0;
    
    RatingDialog() {
        super((java.awt.Frame) null, true);
        initComponents();
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setDefaultCloseOperation(0);
    }

    public void showDialog() {
        setVisible(true);
    }

    public int ReturnValue() {
        setVisible(true);
        return Finalrating;
    }

    private void checkrating() {
        if (rating == 0) {
            star2.setEnabled(false);
            star3.setEnabled(false);
            star4.setEnabled(false);
            star5.setEnabled(false);
            star1.setEnabled(false);
            lblScore.setText("0");
        }
        if (rating == 1) {
            star2.setEnabled(false);
            star3.setEnabled(false);
            star4.setEnabled(false);
            star5.setEnabled(false);
            star1.setEnabled(true);
            lblScore.setText("1");
        }
        if (rating == 2) {
            star2.setEnabled(true);
            star3.setEnabled(false);
            star4.setEnabled(false);
            star5.setEnabled(false);
            star1.setEnabled(true);
            lblScore.setText("2");
        }
        if (rating == 3) {
            star2.setEnabled(true);
            star3.setEnabled(true);
            star4.setEnabled(false);
            star5.setEnabled(false);
            star1.setEnabled(true);
            lblScore.setText("3");
        }
        if (rating == 4) {
            star2.setEnabled(true);
            star3.setEnabled(true);
            star4.setEnabled(true);
            star5.setEnabled(false);
            star1.setEnabled(true);
            lblScore.setText("4");
        }
        if (rating == 5) {
            star2.setEnabled(true);
            star3.setEnabled(true);
            star4.setEnabled(true);
            star5.setEnabled(true);
            star1.setEnabled(true);
            lblScore.setText("5");
        }

    }

    public RatingDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        star1 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star4 = new javax.swing.JLabel();
        star5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        lblScore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Star 2.png"))); // NOI18N
        star1.setEnabled(false);
        star1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                star1MouseExited(evt);
            }
        });

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Star 2.png"))); // NOI18N
        star2.setEnabled(false);
        star2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                star2MouseExited(evt);
            }
        });

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Star 2.png"))); // NOI18N
        star3.setEnabled(false);
        star3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                star3MouseExited(evt);
            }
        });

        star4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Star 2.png"))); // NOI18N
        star4.setEnabled(false);
        star4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                star4MouseExited(evt);
            }
        });

        star5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/Star 2.png"))); // NOI18N
        star5.setEnabled(false);
        star5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                star5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                star5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                star5MouseExited(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setText("Score:");

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblScore.setText("0");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Leave a Review:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblScore))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(star1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(star2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(star3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(star4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(star5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {star2, star3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(star1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(star2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(star3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(star4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(star5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {star1, star2, star3, star4, star5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void star1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star1MouseEntered
        star2.setEnabled(false);
        star3.setEnabled(false);
        star4.setEnabled(false);
        star5.setEnabled(false);
        star1.setEnabled(true);
        lblScore.setText("1");
    }//GEN-LAST:event_star1MouseEntered

    private void star2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star2MouseEntered
        star1.setEnabled(true);
        star3.setEnabled(false);
        star4.setEnabled(false);
        star5.setEnabled(false);
        star2.setEnabled(true);
        lblScore.setText("2");
    }//GEN-LAST:event_star2MouseEntered

    private void star3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star3MouseEntered
        star1.setEnabled(true);
        star3.setEnabled(true);
        star4.setEnabled(false);
        star5.setEnabled(false);
        star2.setEnabled(true);
        lblScore.setText("3");
    }//GEN-LAST:event_star3MouseEntered

    private void star4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star4MouseEntered
        star1.setEnabled(true);
        star3.setEnabled(true);
        star4.setEnabled(true);
        star5.setEnabled(false);
        star2.setEnabled(true);
        lblScore.setText("4");

    }//GEN-LAST:event_star4MouseEntered

    private void star5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star5MouseEntered
        star1.setEnabled(true);
        star3.setEnabled(true);
        star4.setEnabled(true);
        star5.setEnabled(true);
        star2.setEnabled(true);
        lblScore.setText("5");
    }//GEN-LAST:event_star5MouseEntered

    private void star1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star1MouseExited
        checkrating();
    }//GEN-LAST:event_star1MouseExited

    private void star2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star2MouseExited
        checkrating();
    }//GEN-LAST:event_star2MouseExited

    private void star3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star3MouseExited
        checkrating();
    }//GEN-LAST:event_star3MouseExited

    private void star4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star4MouseExited
        checkrating();
    }//GEN-LAST:event_star4MouseExited

    private void star5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star5MouseExited
        checkrating();
    }//GEN-LAST:event_star5MouseExited

    private void star1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star1MouseClicked
        rating = 1;
        star1.setEnabled(true);
        star2.setEnabled(false);
        star3.setEnabled(false);
        star4.setEnabled(false);
        star5.setEnabled(false);

    }//GEN-LAST:event_star1MouseClicked

    private void star2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star2MouseClicked
        rating = 2;
        star1.setEnabled(true);
        star2.setEnabled(true);
        star3.setEnabled(false);
        star4.setEnabled(false);
        star5.setEnabled(false);
    }//GEN-LAST:event_star2MouseClicked

    private void star3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star3MouseClicked
        rating = 3;
        star1.setEnabled(true);
        star2.setEnabled(true);
        star3.setEnabled(true);
        star4.setEnabled(false);
        star5.setEnabled(false);
    }//GEN-LAST:event_star3MouseClicked

    private void star4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star4MouseClicked
        rating = 4;
        star1.setEnabled(true);
        star2.setEnabled(true);
        star3.setEnabled(true);
        star4.setEnabled(true);
        star5.setEnabled(false);
    }//GEN-LAST:event_star4MouseClicked

    private void star5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_star5MouseClicked
        rating = 5;
        star1.setEnabled(true);
        star2.setEnabled(true);
        star3.setEnabled(true);
        star4.setEnabled(true);
        star5.setEnabled(true);
    }//GEN-LAST:event_star5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Finalrating = rating;
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RatingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RatingDialog dialog = new RatingDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel star4;
    private javax.swing.JLabel star5;
    // End of variables declaration//GEN-END:variables
}
