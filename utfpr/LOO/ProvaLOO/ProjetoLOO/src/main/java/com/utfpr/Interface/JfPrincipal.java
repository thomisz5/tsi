package com.utfpr.Interface;

public class JfPrincipal extends javax.swing.JFrame {

    public static boolean cadastro;
    public static boolean consulta;
            
    public JfPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuConsulta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuListagem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto LOO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jfPrincipalLayout = new javax.swing.GroupLayout(jfPrincipal);
        jfPrincipal.setLayout(jfPrincipalLayout);
        jfPrincipalLayout.setHorizontalGroup(
            jfPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1124, Short.MAX_VALUE)
        );
        jfPrincipalLayout.setVerticalGroup(
            jfPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jMenuCadastro.setText("Cadastro Clientes");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMenuConsulta.setText("Consulta Clientes");
        jMenuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuConsulta);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Listagem");

        jMenuListagem.setText("Listagem de Clientes");
        jMenuListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListagemActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuListagem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jfPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
       //add tela de cadastro
        if(cadastro==false){//se a tela abrir, é true e nao abre outra mais
        JifCadastro objCadastro = new JifCadastro();//acionar o botao da tela principal, ele add a tela de cadastro de clientes
        jfPrincipal.add(objCadastro);
        objCadastro.setVisible(true);
        }
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);//tela cheia com monitor
        
        JfPrincipal.cadastro=false;
    }//GEN-LAST:event_formWindowOpened

    private void jMenuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaActionPerformed
        //add tela de consulta
        JifConsulta objConsulta = new JifConsulta();
        jfPrincipal.add(objConsulta);
        objConsulta.setVisible(true);
        
    }//GEN-LAST:event_jMenuConsultaActionPerformed

    private void jMenuListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListagemActionPerformed
        JifListagem objListagem = new JifListagem();
        jfPrincipal.add(objListagem);
        objListagem.setVisible(true);
    }//GEN-LAST:event_jMenuListagemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastro;
    private javax.swing.JMenuItem jMenuConsulta;
    private javax.swing.JMenuItem jMenuListagem;
    private javax.swing.JDesktopPane jfPrincipal;
    // End of variables declaration//GEN-END:variables
}
