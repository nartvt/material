 
package Bai1;

import Bai2.FrmPhepTinh;
import Bai5_28_03.FrmListSort;
import Bai5_28_03.FrmSendGift;
import Bai5_28_03.frmDictionary;
import Bai5_28_03.frmPetManager;
import javax.swing.JOptionPane;
 
public class MJFrame extends javax.swing.JFrame {

     
    public MJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        FrmMain = new javax.swing.JMenuBar();
        mnu_1 = new javax.swing.JMenu();
        mnui_1 = new javax.swing.JMenuItem();
        mnu_i2 = new javax.swing.JMenuItem();
        mnu_3 = new javax.swing.JMenuItem();
        mnu_2 = new javax.swing.JMenu();
        mnu_i1 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bài Tập Kĩ Thuật Lập Trình Java");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setLabelFor(FrmMain);
        jLabel1.setText("Kỹ THUẬT LẬP TRÌNH JAVA");

        mnu_1.setText("Bài 1");
        mnu_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_1ActionPerformed(evt);
            }
        });

        mnui_1.setText("Hello");
        mnui_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnui_1ActionPerformed(evt);
            }
        });
        mnu_1.add(mnui_1);

        mnu_i2.setText("Toán Tử");
        mnu_i2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_i2ActionPerformed(evt);
            }
        });
        mnu_1.add(mnu_i2);

        mnu_3.setText("Đổi Tiền");
        mnu_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_3ActionPerformed(evt);
            }
        });
        mnu_1.add(mnu_3);

        FrmMain.add(mnu_1);

        mnu_2.setText("Bài 2");
        mnu_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_2ActionPerformed(evt);
            }
        });

        mnu_i1.setText("Phép Tính");
        mnu_i1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_i1ActionPerformed(evt);
            }
        });
        mnu_2.add(mnu_i1);

        jMenuItem1.setText("Quản Lý Nhân Viên");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnu_2.add(jMenuItem1);

        jMenuItem2.setText("Trận Đánh");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnu_2.add(jMenuItem2);

        FrmMain.add(mnu_2);

        jMenu1.setText("Bài 3");

        jMenuItem3.setText("Phương Tiện Giao Thông");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Shape");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        FrmMain.add(jMenu1);

        jMenu4.setText("Bài 4");

        jMenuItem5.setText("Check Time");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Collect Money");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Pattern Check");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Split Name");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Split String");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Find Air");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        FrmMain.add(jMenu4);

        jMenu7.setText("Bài 5");

        jMenuItem11.setText("Sort List");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem12.setText("Send Gift");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuItem13.setText("Dictionary");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setText("Pet Manager");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        FrmMain.add(jMenu7);

        setJMenuBar(FrmMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void mnui_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnui_1ActionPerformed
         
        JOptionPane.showMessageDialog(rootPane,"Hello World") ;
        //JOptionPane.
        
    }//GEN-LAST:event_mnui_1ActionPerformed

    private void mnu_i2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_i2ActionPerformed
        // TODO add your handling code here:
        Frm_opertator toantu=new Frm_opertator();
        toantu.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnu_i2ActionPerformed

    private void mnu_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnu_1ActionPerformed

    private void mnu_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_3ActionPerformed
        // TODO add your handling code here:
        FrmDoiTien doitien=new FrmDoiTien();
        doitien.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnu_3ActionPerformed

private void mnu_i1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_i1ActionPerformed
// TODO add your handling code here
    Bai2.FrmPhepTinh frm=new FrmPhepTinh();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_mnu_i1ActionPerformed

private void mnu_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_2ActionPerformed
// TODO add your handling code here:
    Bai2.FrmPhepTinh frm=new Bai2.FrmPhepTinh();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_mnu_2ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
    Bai2.FrmNhanVien frm=new Bai2.FrmNhanVien();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
    Bai2.frmTranDanh frm=new Bai2.frmTranDanh();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
// TODO add your handling code here:
    Bai3.FrmPhuongTienGiaoThong GT=new Bai3.FrmPhuongTienGiaoThong();
    GT.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
// TODO add your handling code here:
    Bai3.FrmShape frm=new Bai3.FrmShape();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
// TODO add your handling code here:
    Bai4.FrmCheckTime frm=new Bai4.FrmCheckTime();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
// TODO add your handling code here:
    Bai4.FrmCollectMoney frm=new Bai4.FrmCollectMoney();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
// TODO add your handling code here:
    Bai4.FrmPatternCheck frm=new Bai4.FrmPatternCheck();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
// TODO add your handling code here:
    Bai4.FrmSplitString frm=new Bai4.FrmSplitString();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
// TODO add your handling code here:
    Bai4.frmFindAir frm=new Bai4.frmFindAir();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
// TODO add your handling code here:
    Bai4.FrmSplitName frm=new Bai4.FrmSplitName();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
// TODO add your handling code here:
    Bai5_28_03.FrmListSort frm=new FrmListSort();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
// TODO add your handling code here:
     Bai5_28_03.FrmSendGift frm=new FrmSendGift();
     frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem12ActionPerformed

private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
// TODO add your handling code here:
    Bai5_28_03.frmDictionary frm=new frmDictionary();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem13ActionPerformed

private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
// TODO add your handling code here:
    Bai5_28_03.frmPetManager frm=new frmPetManager();
    frm.setVisible(rootPaneCheckingEnabled);
}//GEN-LAST:event_jMenuItem14ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar FrmMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu mnu_1;
    private javax.swing.JMenu mnu_2;
    private javax.swing.JMenuItem mnu_3;
    private javax.swing.JMenuItem mnu_i1;
    private javax.swing.JMenuItem mnu_i2;
    private javax.swing.JMenuItem mnui_1;
    // End of variables declaration//GEN-END:variables
}
