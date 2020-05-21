/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author hv
 */
public class FrmDoiTien extends javax.swing.JFrame {

    /**
     * Creates new form FrmDoiTien
     */
    public FrmDoiTien() {
        
        initComponents();
        txt_Are1.setEnabled(false);
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_F1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Are1 = new javax.swing.JTextArea();
        btn_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Frm_DoiTien"); // NOI18N

        jLabel1.setText("Số Tiền");

        txt_F1.setText(" ");
        txt_F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_F1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kết Quả");

        txt_Are1.setColumns(20);
        txt_Are1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_Are1.setRows(5);
        txt_Are1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_Are1.setDragEnabled(true);
        jScrollPane1.setViewportView(txt_Are1);

        btn_OK.setText("Đổi Tiền");
        btn_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(txt_F1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(btn_OK)
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_OK)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_F1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_F1ActionPerformed

    private void btn_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OKActionPerformed
            Pattern p=Pattern.compile("[0-9]+");
            Matcher m=p.matcher(txt_F1.getText());
            if(!m.matches())
            {
                JOptionPane.showMessageDialog(this, "Nhập Vào Số");
                return;
            }
        double sotien=Double.parseDouble(txt_F1.getText());
            int k100=0,k50=0,k20=0,k10=0,k5=0,k2=0,k1=0;
            int count=0;
            do
            {
                if(sotien>=100000)
                {
                    sotien-=100000;
                    k100++;
                    count++;
                }
                else if(sotien>=50000)
                {
                    sotien-=50000;
                    k50++;
                    count++;
                }
                else if(sotien>=20000)
                {
                    sotien-=20000;
                    k20+=1;
                    count++;
                }
                else if(sotien>=10000)
                {
                    sotien-=10000;
                    k10+=1;
                    count++;
                }
                else if(sotien>=5000)
                {
                    sotien-=5000;
                    k5++;
                    count++;
                }
                else if(sotien>=2000)
                {
                    sotien-=2000;
                    k2++;
                    count++;
                } 
                else if(sotien>=1000)
                {
                    sotien-=1000;
                    k1++;
                    count++;
                }
            }while(sotien>=1000);
            String []temp=new String[7];
            String []temp2=new String[7];
//            double soto;
//            int loaitien[]={100000,50000,20000,10000,5000,2000,1000};
//           // int i=0;
//            String chuoi=null;
//            for(int i=0;i<=loaitien.length;i++)
//            {
//                soto=sotien/loaitien[i];
//                if(soto>0)
//                {
//                    chuoi+=soto+"to"+loaitien[i];
//                    sotien=sotien%loaitien[i];
//                }
//            }
//            txt_Are1.setText(chuoi);
            String chuoi="";
            if(count>0)
            {
                 
                if(k100>0)
                {
                   chuoi+=k100+" tờ 100000\n";
                }
                if(k50>0)
                {
                    chuoi+=k50+" tờ 50000\n";
                }
                if(k20>0)
                {
                    chuoi+=k20+" tờ 20000\n";
                }
                if(k10>0)
                {
                    chuoi+=k10+" tờ 10000\n";
                }
                if(k5>0)
                {
                    chuoi+=k5+" tờ 5000\n";
                }
                if(k2>0)
                {
                    chuoi+=k2+" tờ 2000";
                }
                if(k1>0)
                {
                    chuoi+=k1+" tờ 1000\n";
                }
                txt_Are1.setText(chuoi);
            }
            else
            {
                txt_Are1.setText("không có tiền là không có tiền, không có tiền là ta bán bò !");
            }
    }//GEN-LAST:event_btn_OKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDoiTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_Are1;
    private javax.swing.JTextField txt_F1;
    // End of variables declaration//GEN-END:variables
}
