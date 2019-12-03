package view;

import dao.SessaoDao;
import model.Sessao;
import table.SessaoTableModel;

public class SessaoView extends javax.swing.JFrame {

    Sessao pro = new Sessao();
    SessaoDao prd = new SessaoDao();

    public SessaoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbSessao.setAutoCreateRowSorter(true);
        tbSessao.setModel(new SessaoTableModel(new SessaoDao().Listartodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodigo = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfCategoria = new javax.swing.JTextField();
        tfLocalizacao = new javax.swing.JTextField();
        labelLocalizacao = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        labelPesquisar = new javax.swing.JLabel();
        tfpesquisatitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSessao = new javax.swing.JTable();
        labelIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelCodigo.setText("Código");

        labelCategoria.setText("Categoria");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCategoriaActionPerformed(evt);
            }
        });

        tfLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLocalizacaoActionPerformed(evt);
            }
        });

        labelLocalizacao.setText("Localização");

        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btexcluir.setText("Excluir");
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        labelPesquisar.setText("Pesquisar");

        tfpesquisatitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisatituloKeyPressed(evt);
            }
        });

        tbSessao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSessaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSessao);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sessao.png"))); // NOI18N
        labelIcon.setPreferredSize(new java.awt.Dimension(550, 512));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategoria)
                            .addComponent(labelLocalizacao)
                            .addComponent(labelCodigo))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfpesquisatitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btlimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btexcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btsalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigo)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCategoria)
                            .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLocalizacao)))
                    .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir)
                    .addComponent(btsalvar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisar)
                    .addComponent(tfpesquisatitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLocalizacaoActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        if (tfCodigo.getText().equals("")) {
            pro.setCategoria(tfCategoria.getText());
            pro.setLocalizacao(tfLocalizacao.getText());
            prd.inserir(pro);
        } else {
            pro.setCategoria(tfCategoria.getText());
            pro.setLocalizacao(tfLocalizacao.getText());
            pro.setCodigo((Integer.parseInt(tfCodigo.getText())));
            prd.alterar(pro);
        }
        tbSessao.setModel(new SessaoTableModel(new SessaoDao().Listartodos()));
        tfCodigo.setText("");
        tfCategoria.setText("");
        tfLocalizacao.setText("");
        tfpesquisatitulo.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSessaoMouseClicked
        // TODO add your handling code here:
        tfCodigo.setText(tbSessao.getValueAt(tbSessao.getSelectedRow(), SessaoTableModel.COL_CODIGO).toString());
        tfCategoria.setText(tbSessao.getValueAt(tbSessao.getSelectedRow(), SessaoTableModel.COL_CATEGORIA).toString());
        tfLocalizacao.setText(tbSessao.getValueAt(tbSessao.getSelectedRow(), SessaoTableModel.COL_LOCALIZACAO).toString());
    }//GEN-LAST:event_tbSessaoMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tbSessao.setModel(new SessaoTableModel(new SessaoDao().Listartodos()));
        tfCodigo.setText("");
        tfCategoria.setText("");
        tfLocalizacao.setText("");
        tfpesquisatitulo.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfCodigo.getText());
        prd.excluir(codigo);
        tbSessao.setModel(new SessaoTableModel(new SessaoDao().Listartodos()));
        tfCodigo.setText("");
        tfCategoria.setText("");
        tfLocalizacao.setText("");
        tfpesquisatitulo.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisatituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisatituloKeyPressed
        String titulo = tfpesquisatitulo.getText();
        tbSessao.setModel(new SessaoTableModel(new SessaoDao().ListartodosNome(titulo)));

    }//GEN-LAST:event_tfpesquisatituloKeyPressed

    private void tfCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCategoriaActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelLocalizacao;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JTable tbSessao;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfLocalizacao;
    private javax.swing.JTextField tfpesquisatitulo;
    // End of variables declaration//GEN-END:variables
}
