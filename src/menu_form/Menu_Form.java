/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_form;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.VERTICAL;

/**
 *
 * @author alexf
 */
public class Menu_Form extends javax.swing.JFrame {

    Color c;
    
    
    public Menu_Form() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        mLeft = new javax.swing.JRadioButtonMenuItem();
        mCenter = new javax.swing.JRadioButtonMenuItem();
        mRight = new javax.swing.JRadioButtonMenuItem();
        jS1 = new javax.swing.JSlider();
        jB1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTF1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jExit = new javax.swing.JMenuItem();
        colorMenu = new javax.swing.JMenu();
        fGC = new javax.swing.JMenu();
        mRed = new javax.swing.JRadioButtonMenuItem();
        mBlue = new javax.swing.JRadioButtonMenuItem();
        mGreen = new javax.swing.JRadioButtonMenuItem();
        bGC = new javax.swing.JMenu();
        jChooseColor = new javax.swing.JMenuItem();
        sliderMenu = new javax.swing.JMenu();
        jHide = new javax.swing.JCheckBoxMenuItem();
        jVertical = new javax.swing.JCheckBoxMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        buttonGroup2.add(mLeft);
        mLeft.setText("jRadioButtonMenuItem1");
        mLeft.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mLeftItemStateChanged(evt);
            }
        });
        jPopupMenu1.add(mLeft);

        buttonGroup2.add(mCenter);
        mCenter.setText("jRadioButtonMenuItem2");
        mCenter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mCenterItemStateChanged(evt);
            }
        });
        jPopupMenu1.add(mCenter);

        buttonGroup2.add(mRight);
        mRight.setSelected(true);
        mRight.setText("jRadioButtonMenuItem3");
        mRight.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mRightItemStateChanged(evt);
            }
        });
        jPopupMenu1.add(mRight);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jS1.setMajorTickSpacing(10);
        jS1.setPaintLabels(true);
        jS1.setPaintTicks(true);
        jS1.setValue(10);

        jB1.setText("Check Value");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Result");

        jTF1.setEditable(false);

        fileMenu.setText("File");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        jExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        fileMenu.add(jExit);

        jMenuBar1.add(fileMenu);

        colorMenu.setText("Color");

        fGC.setText("ForeGround");

        mRed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        buttonGroup1.add(mRed);
        mRed.setSelected(true);
        mRed.setText("Red");
        mRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mRedItemStateChanged(evt);
            }
        });
        fGC.add(mRed);

        mBlue.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        buttonGroup1.add(mBlue);
        mBlue.setText("Blue");
        mBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mBlueItemStateChanged(evt);
            }
        });
        fGC.add(mBlue);

        mGreen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        buttonGroup1.add(mGreen);
        mGreen.setText("Green");
        mGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mGreenItemStateChanged(evt);
            }
        });
        mGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGreenActionPerformed(evt);
            }
        });
        fGC.add(mGreen);

        colorMenu.add(fGC);

        bGC.setText("BackGround");
        bGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGCActionPerformed(evt);
            }
        });

        jChooseColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jChooseColor.setText("ChooseColor");
        jChooseColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChooseColorActionPerformed(evt);
            }
        });
        bGC.add(jChooseColor);

        colorMenu.add(bGC);

        jMenuBar1.add(colorMenu);

        sliderMenu.setText("Slider");

        jHide.setSelected(true);
        jHide.setText("Hide");
        jHide.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jHideItemStateChanged(evt);
            }
        });
        sliderMenu.add(jHide);

        jVertical.setSelected(true);
        jVertical.setText("Vertical");
        jVertical.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jVerticalItemStateChanged(evt);
            }
        });
        jVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerticalActionPerformed(evt);
            }
        });
        sliderMenu.add(jVertical);

        jMenuBar1.add(sliderMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jB1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mGreenActionPerformed

    private void jVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerticalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVerticalActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        int x = jS1.getValue();
        
        if(x % 2==0)
        {
            jTF1.setText("This Is An Even Number");
        }
        else
        {
            jTF1.setText("This Is An Odd Number");
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void mRedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mRedItemStateChanged
        if(mRed.isSelected())
        {
            jB1.setBackground(Color.RED);
            jLabel1.setBackground(Color.RED);
            jTF1.setBackground(Color.RED); 
        }
    }//GEN-LAST:event_mRedItemStateChanged

    private void mBlueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mBlueItemStateChanged
        if(mBlue.isSelected())
        {
            jB1.setBackground(Color.BLUE);
            jLabel1.setBackground(Color.BLUE);
            jTF1.setBackground(Color.BLUE);
        }
    }//GEN-LAST:event_mBlueItemStateChanged

    private void mGreenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mGreenItemStateChanged
        if(mGreen.isSelected())
        {
            jB1.setBackground(Color.GREEN);
            jLabel1.setBackground(Color.GREEN);
            jTF1.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_mGreenItemStateChanged

    private void bGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGCActionPerformed
        c = JColorChooser.showDialog(null, "Choose the Color", c);
        jB1.setForeground(c);
        jLabel1.setForeground(c);
        jTF1.setForeground(c);
    }//GEN-LAST:event_bGCActionPerformed

    private void jChooseColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChooseColorActionPerformed
        c = JColorChooser.showDialog(null, "Choose the Color", c);
        jB1.setForeground(c);
        jLabel1.setForeground(c);
        jTF1.setForeground(c);
    }//GEN-LAST:event_jChooseColorActionPerformed

    private void mLeftItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mLeftItemStateChanged
        if(mLeft.isSelected())
            jTF1.setHorizontalAlignment(SwingConstants.LEFT);
    }//GEN-LAST:event_mLeftItemStateChanged

    private void mCenterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mCenterItemStateChanged
        if(mCenter.isSelected())
            jTF1.setHorizontalAlignment(SwingConstants.CENTER);
    }//GEN-LAST:event_mCenterItemStateChanged

    private void mRightItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mRightItemStateChanged
        if(mRight.isSelected())
            jTF1.setHorizontalAlignment(SwingConstants.RIGHT);
    }//GEN-LAST:event_mRightItemStateChanged

    private void jHideItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jHideItemStateChanged
            jS1.setVisible(false);
            /*if(jS1.isShowing()==false)
            {
                jS1.setVisible(true);
            }*/
    }//GEN-LAST:event_jHideItemStateChanged

    private void jVerticalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jVerticalItemStateChanged
        jS1.setOrientation(VERTICAL);
    }//GEN-LAST:event_jVerticalItemStateChanged

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
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bGC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenu colorMenu;
    private javax.swing.JMenu fGC;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jB1;
    private javax.swing.JMenuItem jChooseColor;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JCheckBoxMenuItem jHide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSlider jS1;
    private javax.swing.JTextField jTF1;
    private javax.swing.JCheckBoxMenuItem jVertical;
    private javax.swing.JRadioButtonMenuItem mBlue;
    private javax.swing.JRadioButtonMenuItem mCenter;
    private javax.swing.JRadioButtonMenuItem mGreen;
    private javax.swing.JRadioButtonMenuItem mLeft;
    private javax.swing.JRadioButtonMenuItem mRed;
    private javax.swing.JRadioButtonMenuItem mRight;
    private javax.swing.JMenu sliderMenu;
    // End of variables declaration//GEN-END:variables
}
