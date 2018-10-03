package trabalho_pratico01;
import javax.swing.JOptionPane;

public class Princiapal extends javax.swing.JFrame {

    public Princiapal() {
        initComponents();
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo!");
        JOptionPane.showMessageDialog(null, "Digite os dados da Conta Comum.");
      
        contaComum.setNome(JOptionPane.showInputDialog("Digite o nome do titular: "));
        contaComum.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: ")));
        contaComum.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial: ")));
        
        JOptionPane.showMessageDialog(null, "Digite os dados da Conta Poupanca.");
        
        contaPoupanca.setNome(JOptionPane.showInputDialog("Digite o nome do titular: "));
        contaPoupanca.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: ")));
        contaPoupanca.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial: ")));
        contaPoupanca.setTaxa(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da taxa de reajuste: ")));
        
        JOptionPane.showMessageDialog(null, "Digite os dados da Conta Especial.");
        
        contaEspecial.setNome(JOptionPane.showInputDialog("Digite o nome do titular: "));
        contaEspecial.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: ")));
        contaEspecial.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial: ")));
        contaEspecial.setLimite(Integer.parseInt(JOptionPane.showInputDialog("Digite o limite do Cheque Especial: ")));
        contaEspecial.setMulta(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Multa do Cheque Espacial: ")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaque = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnTrasferencia = new javax.swing.JButton();
        btnReajustar = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSaque.setText("SAQUE");
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDeposito.setText("DEPÓSITO");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnTrasferencia.setText("TRANSFERÊNCIA");
        btnTrasferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasferenciaActionPerformed(evt);
            }
        });

        btnReajustar.setText("REAJUSTAR");
        btnReajustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReajustarActionPerformed(evt);
            }
        });

        btnSaldo.setText("SALDO");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\fjeff\\Downloads\\ufc_simbol.png")); // NOI18N
        jblLogo.setText("jLabel1");
        jblLogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrasferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair)
                    .addComponent(btnSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReajustar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrasferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReajustar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
            
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
            
            if(numConta == contaComum.getNumero()){
                JOptionPane.showMessageDialog(null,"Nome do titular: " + contaComum.getNome());
                double contaSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                JOptionPane.showMessageDialog(null,"Confirma o Saque?"); 
                contaComum.sacar(contaSaque);
            }else if(numConta == contaPoupanca.getNumero()){
                JOptionPane.showMessageDialog(null,"Nome do titular: " + contaPoupanca.getNome());
                double contaSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                contaPoupanca.sacar(contaSaque);
            }else if(numConta == contaEspecial.getNumero()){
                JOptionPane.showMessageDialog(null,"Nome do titular: " + contaEspecial.getNome());
                double contaSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
                contaEspecial.sacar(contaSaque);
            }else
                JOptionPane.showMessageDialog(null,"Conta não encontrada.");
            
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
       JOptionPane.showMessageDialog(null,"Saldo conta comum: " + contaComum.getSaldo() + "\n" + "Saldo Conta Poupanca: "
       + contaPoupanca.getSaldo() + "\n" + "Saldo Conta Especial: " + contaEspecial.getSaldo() + "\n" + "Limite de Cheque Especial da COnta Especial: " + contaEspecial.getLimite());
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnTrasferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasferenciaActionPerformed
        int numContaOrigem = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta de origem: "));
        int numContaDestino = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta de destino: "));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser trasferido: "));
        
    }//GEN-LAST:event_btnTrasferenciaActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
            
            if(numConta == contaComum.getNumero()){
                JOptionPane.showMessageDialog(null,"Nome do titular: " + contaComum.getNome());
                double contaSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
                JOptionPane.showMessageDialog(null,"Confirma o deposito?"); 
                contaComum.depositar(contaSaque);
            }else if(numConta == contaPoupanca.getNumero()){
                JOptionPane.showMessageDialog(null,"Nome do titular: " + contaPoupanca.getNome());
                double contaSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
                JOptionPane.showMessageDialog(null,"Confirma o deposito?");
                contaPoupanca.depositar(contaSaque);
            }else if(numConta == contaEspecial.getNumero()){
                JOptionPane.showMessageDialog(null,"Nome do titular: " + contaEspecial.getNome());
                double contaSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
                JOptionPane.showMessageDialog(null,"Confirma o deposito?");
                contaEspecial.depositar(contaSaque);
            }else
                JOptionPane.showMessageDialog(null,"Conta não encontrada.");
        
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnReajustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReajustarActionPerformed

        int numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
        if (numConta != contaPoupanca.getNumero()){
            JOptionPane.showMessageDialog(null,"Serviço nao permitido para este tipo de conta.");
        }else{
            int taxa = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da taxa: "));
            if(taxa == 0){
                contaPoupanca.reajustar();
                JOptionPane.showMessageDialog(null,"Operação realizada com sucesso.");
            }else{
                contaPoupanca.reajustar(taxa);
                JOptionPane.showMessageDialog(null,"Operação realizada com sucesso.");
            }
        }
    }//GEN-LAST:event_btnReajustarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Princiapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Princiapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Princiapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Princiapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Princiapal().setVisible(true);
            }
        }); 
    }

    Conta contaComum = new Conta();
    ContaPoupanca contaPoupanca = new ContaPoupanca();
    ContaEspecial contaEspecial = new ContaEspecial();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnReajustar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnTrasferencia;
    private javax.swing.JLabel jblLogo;
    // End of variables declaration//GEN-END:variables
}
