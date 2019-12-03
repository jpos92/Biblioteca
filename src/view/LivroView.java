package view;

import dao.LivroDao;
import model.Livro;
import table.LivroTableModel;
import table.CategoriaTableModel;
import dao.CategoriaDao;
import dao.SessaoDao;
import table.SessaoTableModel;

public class LivroView extends javax.swing.JFrame {

    Livro pro = new Livro();
    LivroDao prd = new LivroDao();
    CategoriaDao cat = new CategoriaDao();
    SessaoView sessao = new SessaoView();
    AddCategoriaView addCategoria = new AddCategoriaView();
    public static int cod_livro = 0;

    public LivroView() {
        initComponents();
        setLocationRelativeTo(null);
        tblivro.setAutoCreateRowSorter(true);
        tbCategoria.setAutoCreateRowSorter(true);
        tblivro.setModel(new LivroTableModel(new LivroDao().Listartodos()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodigo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        tftitulo = new javax.swing.JTextField();
        tfautor = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        labelPesquisar = new javax.swing.JLabel();
        tfpesquisatitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblivro = new javax.swing.JTable();
        labelIcon = new javax.swing.JLabel();
        jLabelPaginas = new javax.swing.JLabel();
        jLabelAno = new javax.swing.JLabel();
        jLabelEdicao = new javax.swing.JLabel();
        tfPaginas = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        tfEdicao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        btAddCategoria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCategoria = new javax.swing.JTable();
        jbtNovaCategoria = new javax.swing.JButton();
        btSubCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelCodigo.setText("Código");

        labelTitulo.setText("Título");

        tfcodigo.setEditable(false);
        tfcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodigoActionPerformed(evt);
            }
        });

        tftitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftituloActionPerformed(evt);
            }
        });

        tfautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfautorActionPerformed(evt);
            }
        });

        labelAutor.setText("Autor");

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

        tblivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblivro);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/semfoto.png"))); // NOI18N
        labelIcon.setPreferredSize(new java.awt.Dimension(550, 512));

        jLabelPaginas.setText("Nº de pág.");

        jLabelAno.setText("Ano");

        jLabelEdicao.setText("Edição");

        tfPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaginasActionPerformed(evt);
            }
        });

        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });

        jLabelDescricao.setText("Descrição");

        tfDescricao.setToolTipText("");
        tfDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btAddCategoria.setText("+");
        btAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCategoriaActionPerformed(evt);
            }
        });

        tbCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCategoria);

        jbtNovaCategoria.setText("Nova Categoria");
        jbtNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovaCategoriaActionPerformed(evt);
            }
        });

        btSubCategoria.setText("-");
        btSubCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAutor)
                                    .addComponent(labelCodigo)
                                    .addComponent(labelTitulo))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tftitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfautor, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPaginas)
                                .addGap(18, 18, 18)
                                .addComponent(tfPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabelEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEdicao))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtNovaCategoria))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPesquisar)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfpesquisatitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btlimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btexcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btsalvar)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigo)
                            .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitulo)
                            .addComponent(tftitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPaginas)
                            .addComponent(tfPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAno)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdicao)
                            .addComponent(tfEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btAddCategoria)
                                            .addComponent(jbtNovaCategoria)
                                            .addComponent(btSubCategoria)))
                                    .addComponent(tfDescricao))
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 115, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir)
                    .addComponent(btsalvar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisar)
                    .addComponent(tfpesquisatitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfautorActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:       
        if (tfcodigo.getText().equals("")) {
            pro.setTitulo(tftitulo.getText());
            pro.setAutor(tfautor.getText());
            pro.setNpaginas(Integer.parseInt(tfPaginas.getText()));
            pro.setAno(Integer.parseInt(tfAno.getText()));
            pro.setEdicao(Integer.parseInt(tfEdicao.getText()));
            pro.setDescricao(tfDescricao.getText());
            prd.inserir(pro);
        } else {
            pro.setTitulo(tftitulo.getText());
            pro.setAutor(tfautor.getText());
            pro.setNpaginas(Integer.parseInt(tfPaginas.getText()));
            pro.setAno(Integer.parseInt(tfAno.getText()));
            pro.setEdicao(Integer.parseInt(tfEdicao.getText()));
            pro.setDescricao(tfDescricao.getText());
            pro.setCodigo((Integer.parseInt(tfcodigo.getText())));
            prd.alterar(pro);
        }
        tblivro.setModel(new LivroTableModel(new LivroDao().Listartodos()));
        tfcodigo.setText("");
        tftitulo.setText("");
        tfautor.setText("");
        tfPaginas.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfDescricao.setText("");
        tfpesquisatitulo.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tblivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblivroMouseClicked
        // TODO add your handling code here:
        tfcodigo.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_CODIGO).toString());
        tftitulo.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_TITULO).toString());
        tfautor.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_AUTOR).toString());
        tfPaginas.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_NPAGINAS).toString());
        tfAno.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_ANO).toString());
        tfEdicao.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_EDICAO).toString());
        tfDescricao.setText(tblivro.getValueAt(tblivro.getSelectedRow(), LivroTableModel.COL_DESCRICAO).toString());
        
        cod_livro = Integer.parseInt(tfcodigo.getText());
        tbCategoria.setModel(new SessaoTableModel(new SessaoDao().ListarPorLivro(cod_livro)));
        tbCategoria.getColumnModel().getColumn(2).setMinWidth(0);
        tbCategoria.getColumnModel().getColumn(2).setMaxWidth(0);
        tbCategoria.getColumnModel().getColumn(0).setMinWidth(0);
        tbCategoria.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_tblivroMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tblivro.setModel(new LivroTableModel(new LivroDao().Listartodos()));
        tfcodigo.setText("");
        tftitulo.setText("");
        tfautor.setText("");
        tfPaginas.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfDescricao.setText("");
        tfpesquisatitulo.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfcodigo.getText());
        prd.excluir(codigo);
        tblivro.setModel(new LivroTableModel(new LivroDao().Listartodos()));
        tfcodigo.setText("");
        tftitulo.setText("");
        tfautor.setText("");
        tfPaginas.setText("");
        tfAno.setText("");
        tfEdicao.setText("");
        tfDescricao.setText("");
        tfpesquisatitulo.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisatituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisatituloKeyPressed
        String titulo = tfpesquisatitulo.getText();
        tblivro.setModel(new LivroTableModel(new LivroDao().ListartodosNome(titulo)));

    }//GEN-LAST:event_tfpesquisatituloKeyPressed

    private void tftituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftituloActionPerformed

    private void tfcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodigoActionPerformed

    private void tfPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaginasActionPerformed

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void btAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCategoriaActionPerformed
        // TODO add your handling code here:
        if (tfcodigo.getText().equals("")) {
            
        } else {
            addCategoria.setVisible(true);
        }
        
    }//GEN-LAST:event_btAddCategoriaActionPerformed

    private void tbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCategoriaMouseClicked

    private void jbtNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovaCategoriaActionPerformed
        // TODO add your handling code here:
        sessao.setVisible(true);
    }//GEN-LAST:event_jbtNovaCategoriaActionPerformed

    private void btSubCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubCategoriaActionPerformed
        // TODO add your handling code here:
        if ((tfcodigo.getText().equals(""))) {
            
        } else {
            int cod_sessao = Integer.parseInt(tbCategoria.getValueAt(tbCategoria.getSelectedRow(), SessaoTableModel.COL_CODIGO).toString());
            cat.excluir(cod_livro,cod_sessao);
            tbCategoria.setModel(new SessaoTableModel(new SessaoDao().ListarPorLivro(cod_livro)));
            tbCategoria.getColumnModel().getColumn(2).setMinWidth(0);
            tbCategoria.getColumnModel().getColumn(2).setMaxWidth(0);
            tbCategoria.getColumnModel().getColumn(0).setMinWidth(0);
            tbCategoria.getColumnModel().getColumn(0).setMaxWidth(0);
        }
        
    }//GEN-LAST:event_btSubCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCategoria;
    private javax.swing.JButton btSubCategoria;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEdicao;
    private javax.swing.JLabel jLabelPaginas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtNovaCategoria;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tbCategoria;
    private javax.swing.JTable tblivro;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEdicao;
    private javax.swing.JTextField tfPaginas;
    private javax.swing.JTextField tfautor;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JTextField tfpesquisatitulo;
    private javax.swing.JTextField tftitulo;
    // End of variables declaration//GEN-END:variables
}
