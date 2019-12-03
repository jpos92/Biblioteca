package view;

import com.sun.glass.events.KeyEvent;
import dao.Livro_emprestimoDao;
import model.Livro_emprestimo;
import table.Livro_emprestimoTableModel;
import dao.UsuarioDao;
import model.Usuario;
import dao.LivroDao;
import model.Livro;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.SwingConstants;

public class Livro_emprestimoView extends javax.swing.JFrame {
    
    private ArrayList<String> usuTextfield = new UsuarioDao().retornaNome();
    private ArrayList<String> livTextfield = new LivroDao().retornaTitulo();
    Livro_emprestimo pro = new Livro_emprestimo();
    Livro_emprestimoDao prd = new Livro_emprestimoDao();
    
    private void autoCompleteUsu (String nome){
        String complete = "";
        int start = nome.length();
        int last = nome.length();
        int cont;
        
        for (cont = 0; cont < usuTextfield.size(); cont++) {
            
            if (usuTextfield.get(cont).toString().startsWith(nome)) {
                complete = usuTextfield.get(cont).toString();
                last = complete.length();
                break;
            }
        }
        if (last>start) {
            tfUsuario.setText(complete);
            tfUsuario.setCaretPosition(last);
            tfUsuario.moveCaretPosition(start);
        }
    }
    
    private void autoCompleteLiv (String nome){
        String complete = "";
        int start = nome.length();
        int last = nome.length();
        int cont;
        
        for (cont = 0; cont < livTextfield.size(); cont++) {
            
            if (livTextfield.get(cont).toString().startsWith(nome)) {
                complete = livTextfield.get(cont).toString();
                last = complete.length();
                break;
            }
        }
        if (last>start) {
            tfLivro.setText(complete);
            tfLivro.setCaretPosition(last);
            tfLivro.moveCaretPosition(start);
        }
    }

    public Livro_emprestimoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbEmprestimo.setAutoCreateRowSorter(true);
        tbEmprestimo.setModel(new Livro_emprestimoTableModel(new Livro_emprestimoDao().Listartodos()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsuario = new javax.swing.JLabel();
        labelLivro = new javax.swing.JLabel();
        tfLivro = new javax.swing.JTextField();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        labelPesquisar = new javax.swing.JLabel();
        tfpesquisaEmprestimo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmprestimo = new javax.swing.JTable();
        labelIcon = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelUsuario.setText("Usuário");

        labelLivro.setText("Livro");

        tfLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLivroActionPerformed(evt);
            }
        });
        tfLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLivroKeyPressed(evt);
            }
        });

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

        tfpesquisaEmprestimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisaEmprestimoKeyPressed(evt);
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
        jScrollPane1.setViewportView(tbEmprestimo);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emprestimo.png"))); // NOI18N
        labelIcon.setPreferredSize(new java.awt.Dimension(550, 512));

        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLivro)
                            .addComponent(labelUsuario))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfpesquisaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUsuario)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelLivro)
                            .addComponent(tfLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar)
                    .addComponent(btexcluir)
                    .addComponent(btsalvar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisar)
                    .addComponent(tfpesquisaEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        Date dateE = Calendar.getInstance().getTime();  
        DateFormat dateFormatE = new SimpleDateFormat("dd-M-yyyy");  
        String dataEmp = dateFormatE.format(dateE);
        
        Calendar cal  = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        Date dateD = cal.getTime();  
        DateFormat dateFormatD = new SimpleDateFormat("dd-M-yyyy");  
        String dataDev = dateFormatD.format(dateD);
        
        pro.setTituloLivro(tfLivro.getText());
        pro.setNomeUsuario(tfUsuario.getText());
        pro.setData_emprestimo(dataEmp);
        pro.setData_devolucao(dataDev);
        prd.inserir(pro);
        
        tbEmprestimo.setModel(new Livro_emprestimoTableModel(new Livro_emprestimoDao().Listartodos()));
        tfLivro.setText("");
        tfUsuario.setText("");
        tfpesquisaEmprestimo.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmprestimoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEmprestimoMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed

    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisaEmprestimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisaEmprestimoKeyPressed

    }//GEN-LAST:event_tfpesquisaEmprestimoKeyPressed

    private void tfLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLivroActionPerformed

    private void tfLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLivroKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()) {
            case KeyEvent.VK_BACKSPACE:
                break;
            case KeyEvent.VK_ENTER:
                tfLivro.setText(tfLivro.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    
                    public void run() {
                        String texto = tfLivro.getText();
                        autoCompleteLiv(texto);
                    }
                });
        }
        
    }//GEN-LAST:event_tfLivroKeyPressed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyPressed
        // TODO add your handling code here:
        switch(evt.getKeyCode()) {
            case KeyEvent.VK_BACKSPACE:
                break;
            case KeyEvent.VK_ENTER:
                tfUsuario.setText(tfUsuario.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    
                    public void run() {
                        String texto = tfUsuario.getText();
                        autoCompleteUsu(texto);
                    }
                });
        }
    }//GEN-LAST:event_tfUsuarioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelLivro;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTable tbEmprestimo;
    private javax.swing.JTextField tfLivro;
    private javax.swing.JTextField tfUsuario;
    private javax.swing.JTextField tfpesquisaEmprestimo;
    // End of variables declaration//GEN-END:variables
}
