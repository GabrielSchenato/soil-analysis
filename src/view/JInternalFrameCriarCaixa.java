/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modulo.Amostras;

/**
 *
 * @author gabri
 */
public class JInternalFrameCriarCaixa extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameCriarCaixa
     */
    DefaultListModel disp;
    DefaultListModel caixa;
    private Connection conexao;
    private JDesktopPane JDesktop;

    public JInternalFrameCriarCaixa(JDesktopPane jp, Connection conn) {
        initComponents();
        this.JDesktop = jp;
        this.conexao = conn;
        disp = new DefaultListModel();
        caixa = new DefaultListModel();
        PreparedStatement pstmt = null;
        try {
            pstmt = conexao.prepareStatement("SELECT * FROM amostras INNER JOIN tipos_amostras ON amostras.idTipoAmostra = tipos_amostras.idTipoAmostra WHERE idCaixa IS NULL");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                disp.addElement(new Amostras(rs.getInt("idAmostra"), rs.getInt("idTipoAmostra"), rs.getString("nome"), rs.getString("descricao"),
                rs.getInt("idCliente"), rs.getInt("idSolicitante"), rs.getString("area"), rs.getString("complemento"), rs.getInt("idCaixa")));
            }
            pstmt.close();
            jListDisponiveis.setModel(disp);
        } catch (SQLException ex) {
            Logger.getLogger(JInternalFrameCriarCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pstmt = conexao.prepareStatement("SHOW TABLE STATUS LIKE 'caixas'");
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            int id = rs.getInt("Auto_increment");
            idCaixa.setText(Integer.toString(id));
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(JInternalFrameCriarCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        jListCaixa.setModel(caixa);

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDisponiveis = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCaixa = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        idCaixa = new javax.swing.JLabel();
        btnVolta = new javax.swing.JToggleButton();
        btnAdiciona = new javax.swing.JToggleButton();
        sair = new javax.swing.JButton();
        salvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Criar caixa de análise");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Amostras Disponiveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        jScrollPane1.setViewportView(jListDisponiveis);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caixa de Análise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        jScrollPane2.setViewportView(jListCaixa);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Caixa:");

        idCaixa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idCaixa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCaixa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/double-left-chevron.png"))); // NOI18N
        btnVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaActionPerformed(evt);
            }
        });

        btnAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/double-angle-pointing-to-right.png"))); // NOI18N
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(255, 0, 0));
        sair.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 0, 0));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        sair.setText("Sair");
        sair.setAlignmentX(0.5F);
        sair.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        sair.setIconTextGap(6);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        salvar.setBackground(new java.awt.Color(0, 153, 51));
        salvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        salvar.setForeground(new java.awt.Color(0, 153, 0));
        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/save.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        salvar.setIconTextGap(6);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdiciona, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btnVolta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(salvar)
                .addGap(131, 131, 131)
                .addComponent(sair)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sair)
                    .addComponent(salvar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
        JFramePrincipal.resetarInternalCriarCaixa();
        JDesktop.requestFocus();
    }//GEN-LAST:event_sairActionPerformed

    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        if (jListCaixa.getModel().getSize() == 12) {
            JOptionPane.showMessageDialog(null, "O tamanho da caixa não pode ser maior que 12 amostras!");
        } else {
            Amostras x = (Amostras) disp.getElementAt(jListDisponiveis.getSelectedIndex());
            caixa.addElement(x);
            disp.remove(jListDisponiveis.getSelectedIndex());
        }
    }//GEN-LAST:event_btnAdicionaActionPerformed

    private void btnVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaActionPerformed
        Amostras x = (Amostras) caixa.getElementAt(jListCaixa.getSelectedIndex());
        disp.addElement(x);
        caixa.remove(jListCaixa.getSelectedIndex());
    }//GEN-LAST:event_btnVoltaActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(caixa.size() == 0){
            JOptionPane.showMessageDialog(null, "Insira as amostras para cadastras na caixa! ");
        }else{
        PreparedStatement pstmt = null;
        try {
            pstmt = conexao.prepareStatement("INSERT INTO caixas (situacao) VALUES (0)");
            pstmt.execute();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(JInternalFrameCriarCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < caixa.size(); i++) {
            try {
                pstmt = conexao.prepareStatement("UPDATE amostras SET idCaixa = ? WHERE idAmostra = ?");
                Amostras x = (Amostras) caixa.getElementAt(i);
                String idAmostra = Integer.toString(x.getIdAmostra());
                pstmt.setString(1, idCaixa.getText());
                pstmt.setString(2, idAmostra);
                pstmt.execute();
                pstmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(JInternalFrameClienteCadastrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Amostras cadastras na caixa com sucesso! ");
        reset();
        try {
            pstmt = conexao.prepareStatement("SHOW TABLE STATUS LIKE 'caixas'");
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            int id = rs.getInt("Auto_increment");
            idCaixa.setText(Integer.toString(id));
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(JInternalFrameCriarCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        JFramePrincipal.resetarInternalCriarCaixa();
    }//GEN-LAST:event_formInternalFrameClosing
    public void reset(){
        caixa.removeAllElements();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdiciona;
    private javax.swing.JToggleButton btnVolta;
    private javax.swing.JLabel idCaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListCaixa;
    private javax.swing.JList<String> jListDisponiveis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
