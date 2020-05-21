package Bai1;

import javax.swing.DefaultComboBoxModel;
public class Frm_opertator extends javax.swing.JFrame {

    public Frm_opertator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmb_1 = new javax.swing.JComboBox();
        cmb_2 = new javax.swing.JComboBox();
        lb_1 = new javax.swing.JLabel();
        lb_2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operator");
        setName("Frm_ToanTu"); // NOI18N

        cmb_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Chon-----", "Số Học", "Quan Hệ", "Luận Ly" }));
        cmb_1.setToolTipText("");
        cmb_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_1ActionPerformed(evt);
            }
        });

        cmb_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_2ActionPerformed(evt);
            }
        });

        lb_1.setText("Nhóm Toán Tử");

        lb_2.setText("Toán Tử");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_1)
                    .addComponent(lb_2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_1, 0, 107, Short.MAX_VALUE))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_2))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-415)/2, (screenSize.height-335)/2, 415, 335);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_2ActionPerformed

    private void cmb_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_1ActionPerformed
        // TODO add your handling code here:
        int A= cmb_1.getSelectedIndex();
        String [] item=new String [4];
        if(A==1)
        {
            item[0]="Toán Tử: +";
            item[1]="Toán Tử: -";
            item[2]="Toán Tử: *";
            item[3]="Toán Tử: /";
            DefaultComboBoxModel temp=new DefaultComboBoxModel(item);
            cmb_2.setModel(temp);
            
        }
        if(A==2)
        {
            item[0]="Quan Hệ: >";
            item[1]="Quan Hệ: <";
            item[2]="Quan Hệ: =";
          ///  item[3]="Toán Tử: /";
            DefaultComboBoxModel temp=new DefaultComboBoxModel(item);
            cmb_2.setModel(temp);
        }
        if(A==3)    
        {
            item[0]="Luận Lý: Xor";
            item[1]="Luận Lý: And";
            item[2]="Luận Lý: Or";
            item[3]="Luận Lý: Nor";
          ///  item[3]="Toán Tử: /";
            DefaultComboBoxModel temp=new DefaultComboBoxModel(item);
            cmb_2.setModel(temp);
        }
    }//GEN-LAST:event_cmb_1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_opertator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_1;
    private javax.swing.JComboBox cmb_2;
    private javax.swing.JLabel lb_1;
    private javax.swing.JLabel lb_2;
    // End of variables declaration//GEN-END:variables
}
