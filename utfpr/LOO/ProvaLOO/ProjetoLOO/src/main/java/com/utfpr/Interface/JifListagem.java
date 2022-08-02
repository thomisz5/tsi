
package com.utfpr.Interface;

public class JifListagem extends javax.swing.JInternalFrame {

    public JifListagem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCBTodos = new javax.swing.JCheckBox();
        jCBAtivos = new javax.swing.JCheckBox();
        jCBInativos = new javax.swing.JCheckBox();
        btLista = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listagem de Clientes");

        buttonGroup1.add(jCBTodos);
        jCBTodos.setText("Todos");
        jCBTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCBAtivos);
        jCBAtivos.setText("Ativos");

        buttonGroup1.add(jCBInativos);
        jCBInativos.setText("Inativos");

        btLista.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jCBTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jCBAtivos)
                .addGap(34, 34, 34)
                .addComponent(jCBInativos)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTodos)
                    .addComponent(jCBInativos)
                    .addComponent(jCBAtivos))
                .addGap(34, 34, 34)
                .addComponent(btLista, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(250, 10, 360, 185);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTodosActionPerformed
       //teste
    }//GEN-LAST:event_jCBTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCBAtivos;
    private javax.swing.JCheckBox jCBInativos;
    private javax.swing.JCheckBox jCBTodos;
    // End of variables declaration//GEN-END:variables
}
