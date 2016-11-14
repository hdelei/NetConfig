/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudarede;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vanderlei
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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

        btMudar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblIP = new javax.swing.JLabel();
        lblMascara = new javax.swing.JLabel();
        lblGateway = new javax.swing.JLabel();
        lblDNS = new javax.swing.JLabel();
        lblDHCP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIPAtual = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btMudar.setText("Mudar");
        btMudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMudarActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estático 1", "Estático 2", "DHCP" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblIP.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIP.setText("jLabel1");

        lblMascara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMascara.setText("jLabel1");

        lblGateway.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGateway.setText("jLabel1");

        lblDNS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDNS.setText("jLabel1");

        lblDHCP.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDHCP.setText("DHCP: off");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIP)
                    .addComponent(lblMascara)
                    .addComponent(lblGateway)
                    .addComponent(lblDNS)
                    .addComponent(lblDHCP))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMascara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGateway)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDNS)
                .addGap(18, 18, 18)
                .addComponent(lblDHCP)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Escolha suas configurações de rede");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtIPAtual.setColumns(20);
        txtIPAtual.setRows(5);
        jScrollPane1.setViewportView(txtIPAtual);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btMudar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMudar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMudarActionPerformed
        // TODO add your handling code here:
        executaComando();
    }//GEN-LAST:event_btMudarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
        atualizaPainel();
    }//GEN-LAST:event_cbTipoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        atualizaPainel();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtIPAtual.setText("");
        IPAddress ip = new IPAddress();
        String address = "";
        String gateway = "";
        try {
            Process process = Runtime.getRuntime().exec("ipconfig");
            process.waitFor();

        BufferedReader reader = 
        new BufferedReader(new InputStreamReader(process.getInputStream()));
            
            String line = "";           
            while ((line = reader.readLine())!= null) {                
                address = ip.getAdressIP(line);
                gateway = ip.getGateway(line);
                System.out.println(line);
                
            }
            txtIPAtual.append("IP: " + address + "\r\n");
            txtIPAtual.append("Gateway: " + gateway + "\r\n");
            //txtIPAtual.append(gateway);
            //txtIPAtual.append(gateway);
            //System.out.println(address);
        } catch (Exception e) {
        }
        

//        try {
//            // TODO add your handling code here:
//            Network network = new Network();
//        } catch (SocketException ex) {
//            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMudar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDHCP;
    private javax.swing.JLabel lblDNS;
    private javax.swing.JLabel lblGateway;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblMascara;
    private javax.swing.JTextArea txtIPAtual;
    // End of variables declaration//GEN-END:variables

    private void atualizaPainel() {
        switch(cbTipo.getSelectedIndex()){
            case 0 :
                lblIP.setText("192.168.1.220");
                lblMascara.setText("255.255.255.0");
                lblGateway.setText("192.168.1.1");
                lblDNS.setText("192.168.1.1");
                lblDHCP.setText("DHCP: off");                
                break;
                case 1 :
                lblIP.setText("192.168.1.220");
                lblMascara.setText("255.255.255.0");
                lblGateway.setText("192.168.1.2");
                lblDNS.setText("192.168.1.2");
                lblDHCP.setText("DHCP: off");                
                break;
                case 2 :
                lblIP.setText("xxx.xxx.xxx.xxx");
                lblMascara.setText("xxx.xxx.xxx.xxx");
                lblGateway.setText("xxx.xxx.xxx.xxx");
                lblDNS.setText("xxx.xxx.xxx.xxx");
                lblDHCP.setText("DHCP: on");                
                break;
            
        }
    }
    private void executaComando(){
        String gateway1 = "netsh interface ip set address name = \"OffBoard\" static 192.168.1.220 255.255.255.0 192.168.1.1";
        String dns1 = "netsh interface ip set dnsservers name=\"OffBoard\" static 192.168.1.1 primary no";
        String gateway2 = "netsh interface ip set address name = \"OffBoard\" static 192.168.1.220 255.255.255.0 192.168.1.2";
        String dns2 = "netsh interface ip set dnsservers name=\"OffBoard\" static 192.168.1.2 primary no";
        String dhcp = "netsh interface ip set address name=\"OffBoard\" dhcp";
        String dhcpDNS = "netsh interface ip set dnsservers name=\"OffBoard\" dhcp";
                
        switch(cbTipo.getSelectedIndex()){
            case 0 :
                try {
                    Runtime.getRuntime().exec(gateway1);
                    Runtime.getRuntime().exec(dns1);
            
                } catch (Exception e) {            
                }
                break;
                case 1 :
                try {
                    Runtime.getRuntime().exec(gateway2);
                    Runtime.getRuntime().exec(dns2);
            
                } catch (Exception e) {            
                }
                break;
                case 2 :
                try {
                    Runtime.getRuntime().exec(dhcp);
                    Runtime.getRuntime().exec(dhcpDNS);
            
                } catch (Exception e) {            
                }                
                break;
            
        }
    }
}
