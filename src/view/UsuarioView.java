package view;

import dao.EmprestimoDao;
import dao.LivroDao;
import dao.UsuarioDao;
import java.io.File;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.Usuario;
import table.LivroTableModel;
import table.UsuarioTableModel;

public class UsuarioView extends javax.swing.JFrame {

    Usuario pro = new Usuario();
    UsuarioDao prd = new UsuarioDao();
    String codigo = null;
    EmprestimoDao emp = new EmprestimoDao();
    AddLivroView addLivro = new AddLivroView();
    public static int cod_usuario = 0;

    public UsuarioView() {
        initComponents();
        setLocationRelativeTo(null);
        tbusuario.setAutoCreateRowSorter(true);
        tbusuario.setModel(new UsuarioTableModel(new UsuarioDao().Listartodos()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMatricula = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        tfmatricula = new javax.swing.JTextField();
        tfnome = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        labelPesquisar = new javax.swing.JLabel();
        tfpesquisanome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuario = new javax.swing.JTable();
        labelEndereco = new javax.swing.JLabel();
        tfendereco = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        tftelefone = new javax.swing.JTextField();
        labelIcon = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEmprestimo = new javax.swing.JTable();
        jbtPegar = new javax.swing.JButton();
        jbtDevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));

        labelMatricula.setText("Matrícula");

        labelNome.setText("Nome");

        tfmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatriculaActionPerformed(evt);
            }
        });

        tfnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeActionPerformed(evt);
            }
        });

        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });

        labelEmail.setText("Email");

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

        tfpesquisanome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisanomeKeyPressed(evt);
            }
        });

        tbusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbusuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbusuario);

        labelEndereco.setText("Endereço");

        tfendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfenderecoActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone");

        tftelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftelefoneActionPerformed(evt);
            }
        });

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/semfoto.png"))); // NOI18N
        labelIcon.setPreferredSize(new java.awt.Dimension(550, 512));
        labelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIconMouseClicked(evt);
            }
        });

        tbEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbEmprestimo);

        jbtPegar.setText("Pegar livro");
        jbtPegar.setMaximumSize(new java.awt.Dimension(99, 23));
        jbtPegar.setMinimumSize(new java.awt.Dimension(99, 23));
        jbtPegar.setPreferredSize(new java.awt.Dimension(99, 23));
        jbtPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPegarActionPerformed(evt);
            }
        });

        jbtDevolver.setText("Devolver livro");
        jbtDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfpesquisanome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(tfendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNome)
                                            .addComponent(labelEmail)
                                            .addComponent(labelMatricula))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfnome, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfemail)
                                            .addComponent(tfmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jbtPegar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtDevolver)))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btlimpar)
                .addGap(18, 18, 18)
                .addComponent(btexcluir)
                .addGap(18, 18, 18)
                .addComponent(btsalvar)
                .addGap(0, 464, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMatricula)
                            .addComponent(tfmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEndereco))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefone)))
                    .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtPegar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtDevolver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir)
                    .addComponent(btsalvar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisar)
                    .addComponent(tfpesquisanome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfemailActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        if (codigo == null) {
            pro.setMatricula(tfmatricula.getText());
            pro.setNome(tfnome.getText());
            pro.setEmail(tfemail.getText());
            pro.setEndereco(tfendereco.getText());
            pro.setTelefone(tftelefone.getText());
            prd.inserir(pro);
        } else {
            pro.setMatricula(tfmatricula.getText());
            pro.setNome(tfnome.getText());
            pro.setEmail(tfemail.getText());
            pro.setEndereco(tfendereco.getText());
            pro.setTelefone(tftelefone.getText());
            pro.setCodigo(Integer.parseInt(codigo));
            prd.alterar(pro);
        }
        tbusuario.setModel(new UsuarioTableModel(new UsuarioDao().Listartodos()));
        codigo = null;
        tfmatricula.setText("");
        tfnome.setText("");
        tfemail.setText("");
        tfendereco.setText("");
        tftelefone.setText("");
        tfpesquisanome.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusuarioMouseClicked
        // TODO add your handling code here:
        codigo = (tbusuario.getValueAt(tbusuario.getSelectedRow(), UsuarioTableModel.COL_CODIGO).toString());
        tfmatricula.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), UsuarioTableModel.COL_MATRICULA).toString());
        tfnome.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), UsuarioTableModel.COL_NOME).toString());
        tfemail.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), UsuarioTableModel.COL_EMAIL).toString());
        tfendereco.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), UsuarioTableModel.COL_ENDERECO).toString());
        tftelefone.setText(tbusuario.getValueAt(tbusuario.getSelectedRow(), UsuarioTableModel.COL_TELEFONE).toString());
        
        cod_usuario = Integer.parseInt(codigo);
        tbEmprestimo.setModel(new LivroTableModel(new LivroDao().ListarPorUsuario(cod_usuario)));
        tbEmprestimo.getColumnModel().getColumn(2).setMinWidth(0);
        tbEmprestimo.getColumnModel().getColumn(2).setMaxWidth(0);
        tbEmprestimo.getColumnModel().getColumn(0).setMinWidth(0);
        tbEmprestimo.getColumnModel().getColumn(0).setMaxWidth(0);
    }//GEN-LAST:event_tbusuarioMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tbusuario.setModel(new UsuarioTableModel(new UsuarioDao().Listartodos()));
        codigo = null;
        tfmatricula.setText("");
        tfnome.setText("");
        tfemail.setText("");
        tfendereco.setText("");
        tftelefone.setText("");
        tfpesquisanome.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        prd.excluir(Integer.parseInt(codigo));
        tbusuario.setModel(new UsuarioTableModel(new UsuarioDao().Listartodos()));
        codigo = null;
        tfmatricula.setText("");
        tfnome.setText("");
        tfemail.setText("");
        tfendereco.setText("");
        tftelefone.setText("");
        tfpesquisanome.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisanomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisanomeKeyPressed
        String nome = tfpesquisanome.getText();
        tbusuario.setModel(new UsuarioTableModel(new UsuarioDao().ListartodosNome(nome)));

    }//GEN-LAST:event_tfpesquisanomeKeyPressed

    private void tfnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomeActionPerformed

    private void tfmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmatriculaActionPerformed

    private void tfenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfenderecoActionPerformed

    private void tftelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftelefoneActionPerformed

    private void labelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIconMouseClicked
        // TODO add your handling code here:
        JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Selecione uma foto:");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("path");
            file = arquivo.getSelectedFile(); //Recebe o caminho do arquivo
            String path = file.getAbsolutePath();
            
            ImageIcon foto = new ImageIcon(arquivo.getSelectedFile().getPath());
            labelIcon.setIcon(new ImageIcon(foto.getImage().getScaledInstance(labelIcon.getWidth(), labelIcon.getHeight(), Image.SCALE_DEFAULT)));
            
        }
    }//GEN-LAST:event_labelIconMouseClicked

    private void tbEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmprestimoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEmprestimoMouseClicked

    private void jbtPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPegarActionPerformed
        // TODO add your handling code here:
         if (codigo == null) {
            
        } else {
            addLivro.setVisible(true);
        }
    }//GEN-LAST:event_jbtPegarActionPerformed

    private void jbtDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDevolverActionPerformed
        // TODO add your handling code here:
        if (codigo == null) {
            
        } else {
            int cod_livro = Integer.parseInt(tbEmprestimo.getValueAt(tbEmprestimo.getSelectedRow(), LivroTableModel.COL_CODIGO).toString());
            emp.excluir(cod_usuario,cod_livro);
            tbEmprestimo.setModel(new LivroTableModel(new LivroDao().ListarPorUsuario(cod_usuario)));
            tbEmprestimo.getColumnModel().getColumn(2).setMinWidth(0);
            tbEmprestimo.getColumnModel().getColumn(2).setMaxWidth(0);
            tbEmprestimo.getColumnModel().getColumn(0).setMinWidth(0);
            tbEmprestimo.getColumnModel().getColumn(0).setMaxWidth(0);
        }
    }//GEN-LAST:event_jbtDevolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtDevolver;
    private javax.swing.JButton jbtPegar;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JTable tbEmprestimo;
    private javax.swing.JTable tbusuario;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfendereco;
    private javax.swing.JTextField tfmatricula;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfpesquisanome;
    private javax.swing.JTextField tftelefone;
    // End of variables declaration//GEN-END:variables
}
