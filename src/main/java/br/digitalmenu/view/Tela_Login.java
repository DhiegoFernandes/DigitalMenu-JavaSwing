package br.digitalmenu.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.digitalmenu.dao.MesaDao;
import br.digitalmenu.dao.UsuarioDAO;
import br.digitalmenu.model.Mesa;
import br.digitalmenu.model.Usuario;
import javax.swing.JRootPane;

public class Tela_Login extends javax.swing.JFrame {

    public Tela_Login() throws SQLException {
        initComponents();
        listarMesa();
        this.getRootPane().setDefaultButton(btn_logar_usuario);
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }

    public void listarMesa() throws SQLException {
        MesaDao mesaDao = new MesaDao();
        for (Mesa mesa : mesaDao.listarTodasMesasPorStatus("ATIVADO")) {//lista todas as mesas ativas
            cbo_mesa.addItem(String.valueOf(mesa.getIdMesa()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbl_tela_login = new javax.swing.JPanel();
        lbl_LogarComoUsuario = new javax.swing.JLabel();
        lbl_Login = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        lbl_icone_disable = new javax.swing.JLabel();
        lbl_icone_show = new javax.swing.JLabel();
        btn_logar_usuario = new javax.swing.JButton();
        lbl_LogarComoMesa = new javax.swing.JLabel();
        lbl_NumeroMesa = new javax.swing.JLabel();
        cbo_mesa = new javax.swing.JComboBox();
        btn_logar_mesa = new javax.swing.JButton();
        btn_fechar = new javax.swing.JButton();
        lbl_wallpaper = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 102));
        setForeground(new java.awt.Color(204, 255, 51));

        pbl_tela_login.setLayout(null);

        lbl_LogarComoUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lbl_LogarComoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LogarComoUsuario.setText("Logar como usuário");
        pbl_tela_login.add(lbl_LogarComoUsuario);
        lbl_LogarComoUsuario.setBounds(90, 200, 190, 21);

        lbl_Login.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        lbl_Login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Login.setText("Login");
        pbl_tela_login.add(lbl_Login);
        lbl_Login.setBounds(40, 230, 40, 30);
        pbl_tela_login.add(txt_login);
        txt_login.setBounds(80, 230, 194, 30);

        lbl_Senha.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        lbl_Senha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Senha.setText("Senha");
        lbl_Senha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pbl_tela_login.add(lbl_Senha);
        lbl_Senha.setBounds(40, 270, 40, 30);
        pbl_tela_login.add(txt_senha);
        txt_senha.setBounds(80, 270, 194, 30);

        lbl_icone_disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icone_disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/digitalmenu/images/eyeclose.png")));
        lbl_icone_disable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_icone_disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icone_disableMouseClicked(evt);
            }
        });
        pbl_tela_login.add(lbl_icone_disable);
        lbl_icone_disable.setBounds(280, 270, 27, 30);

        lbl_icone_show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_icone_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/digitalmenu/images/eyeopen.png")));
        lbl_icone_show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_icone_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_icone_showMouseClicked(evt);
            }
        });
        pbl_tela_login.add(lbl_icone_show);
        lbl_icone_show.setBounds(280, 270, 27, 30);

        btn_logar_usuario.setBackground(new java.awt.Color(255, 227, 117));
        btn_logar_usuario.setText("Ok");
        btn_logar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logar_usuarioActionPerformed(evt);
            }
        });
        pbl_tela_login.add(btn_logar_usuario);
        btn_logar_usuario.setBounds(150, 310, 45, 30);

        lbl_LogarComoMesa.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lbl_LogarComoMesa.setForeground(new java.awt.Color(255, 255, 255));
        lbl_LogarComoMesa.setText("Logar como mesa");
        pbl_tela_login.add(lbl_LogarComoMesa);
        lbl_LogarComoMesa.setBounds(90, 350, 170, 21);

        lbl_NumeroMesa.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        lbl_NumeroMesa.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NumeroMesa.setText("N°Mesa");
        pbl_tela_login.add(lbl_NumeroMesa);
        lbl_NumeroMesa.setBounds(60, 390, 47, 15);

        cbo_mesa.setBackground(new java.awt.Color(255, 232, 142));
        cbo_mesa.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        cbo_mesa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar" }));
        cbo_mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_mesaActionPerformed(evt);
            }
        });
        pbl_tela_login.add(cbo_mesa);
        cbo_mesa.setBounds(110, 380, 120, 30);

        btn_logar_mesa.setBackground(new java.awt.Color(255, 243, 198));
        btn_logar_mesa.setText("Ok");
        btn_logar_mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logar_mesaActionPerformed(evt);
            }
        });
        pbl_tela_login.add(btn_logar_mesa);
        btn_logar_mesa.setBounds(150, 420, 45, 30);

        btn_fechar.setBackground(new java.awt.Color(255, 0, 51));
        btn_fechar.setText("X");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });
        pbl_tela_login.add(btn_fechar);
        btn_fechar.setBounds(750, 0, 35, 28);

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/digitalmenu/images/fundo.png")));
        pbl_tela_login.add(lbl_wallpaper);
        lbl_wallpaper.setBounds(0, 0, 790, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pbl_tela_login, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbl_tela_login, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(787, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_icone_disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icone_disableMouseClicked
        txt_senha.setEchoChar((char) 0);
        lbl_icone_disable.setVisible(false);
        lbl_icone_disable.setEnabled(false);
        lbl_icone_show.setEnabled(true);
        lbl_icone_show.setEnabled(true);
        lbl_icone_show.setEnabled(true);
        lbl_icone_disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/digitalmenu/images/eyeopen.png")));
    }//GEN-LAST:event_lbl_icone_disableMouseClicked

    private void lbl_icone_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_icone_showMouseClicked
        txt_senha.setEchoChar((char) 8226);
        lbl_icone_disable.setVisible(true);
        lbl_icone_disable.setEnabled(true);
        lbl_icone_show.setEnabled(false);
        lbl_icone_show.setEnabled(false);
        lbl_icone_disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/digitalmenu/images/eyeclose.png")));
    }//GEN-LAST:event_lbl_icone_showMouseClicked

    private void cbo_mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_mesaActionPerformed

    }//GEN-LAST:event_cbo_mesaActionPerformed

    private void btn_logar_mesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logar_mesaActionPerformed
        MesaDao mDao = new MesaDao();
        if (cbo_mesa.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Escolha uma mesa! ", "Mesa não definida!", JOptionPane.WARNING_MESSAGE);
        } else {

            int numeroMesa = Integer.parseInt(cbo_mesa.getSelectedItem().toString());
            try {
                if (mDao.checkMesa(numeroMesa)) {
                    TelaDeEspera telaDeEspera = new TelaDeEspera(numeroMesa);
                    telaDeEspera.setVisible(true);

                    this.dispose();

                    JOptionPane.showMessageDialog(null, String.format("Bem-Vindo!: [Mesa: %d]",
                            numeroMesa), "Bem-Vindo!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Mesa invalida! ", "Mesa não está em uso, ative o status da mesa!", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btn_logar_mesaActionPerformed

    private void btn_logar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logar_usuarioActionPerformed
        String nomeUsuario = txt_login.getText();
        String senha = txt_senha.getText();
        if (nomeUsuario.length() < 1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Login!", "Campos vazios!", JOptionPane.INFORMATION_MESSAGE);
        } else if (senha.length() < 1) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha!", "Campos vazios!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                UsuarioDAO usuarioDao = new UsuarioDAO();
                Usuario usuario = new Usuario();
                usuario = usuarioDao.buscaPorUsuario(nomeUsuario, senha);
                if (usuario == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Usuário ou senha inválidos!",
                            "Verifique os dados inseridos!",
                            JOptionPane.WARNING_MESSAGE);
                } else if (usuario.getTipoacesso().equalsIgnoreCase("administrador")) {
                    System.out.println(usuario.getStatus());
                    JOptionPane.showMessageDialog(null, "Bem-vindo administrador.", "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Tela_Admin(usuario.getUsuario(), usuario.getTipoacesso()).setVisible(true);

                } else if (usuario.getTipoacesso().equalsIgnoreCase("atendente")) {
                    System.out.println(usuario.getStatus());
                    JOptionPane.showMessageDialog(null, "Bem-vindo atendente.", "Bem-vindo!", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new Tela_Atendente(usuario.getUsuario(), usuario.getTipoacesso()).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btn_logar_usuarioActionPerformed

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btn_fecharActionPerformed
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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tela_Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JButton btn_logar_mesa;
    private javax.swing.JButton btn_logar_usuario;
    public javax.swing.JComboBox cbo_mesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_LogarComoMesa;
    private javax.swing.JLabel lbl_LogarComoUsuario;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_NumeroMesa;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_icone_disable;
    private javax.swing.JLabel lbl_icone_show;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JPanel pbl_tela_login;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
