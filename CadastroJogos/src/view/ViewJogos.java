/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.JogosControl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Jogos;

/**
 *
 * @author aleba
 */
public class ViewJogos extends javax.swing.JFrame {
    private JogosControl lstJogos;
    /**
     * Creates new form ViewJogos
     */
    public ViewJogos() {
        initComponents();
        try{
        lstJogos = JogosControl.getInstance();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "erro no SQL");
        }
        
        atualizarTabela();
    }

    private void limparCampos() {
        txtNome.setText("");
        txtEstilo.setText("");
        txtPreco.setText("");
        txtEmpresa.setText("");
        txtNome.requestFocus();
        
        txtExcluiNome.setText("");
        txtBuscaNome.setText("");
        
    }
    
    private void atualizarTabela(ArrayList<Jogos> lista) {
        DefaultTableModel data = new DefaultTableModel();
        data.setNumRows(0);
        data.addColumn("Nome");
        data.addColumn("Empresa");
        data.addColumn("Preço");
        data.addColumn("Estilo");
        
        for(Jogos j: lista){
            data.addRow(new Object[]{j.getNome(), j.getEstilo(), j.getPreco(), j.getEmpresa()});
        }
        tblJogos.setModel(data);
    }
    
     private void atualizarTabela(){
        atualizarTabela(lstJogos.getList());
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblEstilo = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEstilo = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblJogos = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJogos = new javax.swing.JTable();
        txtExcluiNome = new javax.swing.JTextField();
        lblExcluir = new javax.swing.JLabel();
        lblNomeExcluir = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        btnBuscaNome = new javax.swing.JButton();
        lblNomeBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblNome.setText("Nome:");

        lblEstilo.setText("Estilo:");

        lblPreco.setText("Preço:");

        lblEmpresa.setText("Empresa:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(204, 255, 204));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblJogos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblJogos.setText("Cadastro de Jogos");

        btnExcluir.setBackground(new java.awt.Color(255, 204, 204));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Estilo", "Preço", "Empresa"
            }
        ));
        tblJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJogosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJogos);

        txtExcluiNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluiNomeActionPerformed(evt);
            }
        });

        lblExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblExcluir.setText("Exclusão de Jogos");

        lblNomeExcluir.setText("Nome:");

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBuscar.setText("Buscar de Jogos");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });

        btnBuscaNome.setBackground(new java.awt.Color(204, 255, 255));
        btnBuscaNome.setText("Buscar");
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        lblNomeBuscar.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBuscaNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNomeExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtExcluiNome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblNomeBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblJogos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEstilo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblEmpresa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblPreco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblJogos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstilo)
                            .addComponent(lblPreco)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmpresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(lblExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeExcluir)
                            .addComponent(txtExcluiNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscaNome)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = this.txtNome.getText();
        String estilo = this.txtEstilo.getText();
        float preco = Float.parseFloat(this.txtPreco.getText().replace(",", "."));
        String empresa = this.txtEmpresa.getText();
        try {
            lstJogos.cadastrarJogo(nome, estilo, preco, empresa);
            atualizarTabela();
            JOptionPane.showMessageDialog(null, "inserido com sucesso");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "não foi possível inserir jogo");
           System.out.println("Erro ao incluir" + ex.toString());
        }
        limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String nome = this.txtExcluiNome.getText();
        try{
            lstJogos.removerJogo(nome);
            JOptionPane.showMessageDialog(null, "O jogo foi excluido");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "não foi possível excluir jogo");
            System.out.println("Erro ao excluir" + ex.toString());
        }
        atualizarTabela();
        limparCampos();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtExcluiNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExcluiNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExcluiNomeActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        try{
            ArrayList<Jogos> list = lstJogos.arrayNew(txtBuscaNome.getText());
            atualizarTabela(list);
        } catch (IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void tblJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJogosMouseClicked
        if(tblJogos.getSelectedRow() == -1)
            return;
        String nome = tblJogos.getValueAt(tblJogos.getSelectedRow(), 0).toString();
        String empresa = tblJogos.getValueAt(tblJogos.getSelectedRow(), 1).toString();
        String preco = tblJogos.getValueAt(tblJogos.getSelectedRow(), 2).toString();
        String estilo = tblJogos.getValueAt(tblJogos.getSelectedRow(), 3).toString();
        txtExcluiNome.setText(nome);
        txtBuscaNome.setText(nome);
        
        if(evt.getClickCount() == 2){
            JOptionPane.showMessageDialog(null, "Nome: "+ nome + "\nEmpresa: "+ empresa + "\nPreço: R$"+ preco + "\nEstilo: "+ estilo);
        }
    }//GEN-LAST:event_tblJogosMouseClicked

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
            java.util.logging.Logger.getLogger(ViewJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblJogos;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeBuscar;
    private javax.swing.JLabel lblNomeExcluir;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tblJogos;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEstilo;
    private javax.swing.JTextField txtExcluiNome;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
