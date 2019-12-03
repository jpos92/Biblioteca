/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

/**
 *
 * @author JP
 */
import model.Emprestimo;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class EmprestimoTableModel extends AbstractTableModel{
    
    public static final int COL_COD_USUARIO = 0;
    public static final int COL_COD_LIVRO = 1;
    public ArrayList <Emprestimo> lista;

    public EmprestimoTableModel (ArrayList<Emprestimo> l){
        lista = new ArrayList<Emprestimo> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Emprestimo emprestimo = lista.get(linhas);
        if (colunas == COL_COD_USUARIO) return emprestimo.getCod_usuario();
        if (colunas == COL_COD_LIVRO) return emprestimo.getCod_livro();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_COD_USUARIO) return "Código do usuário";
        if (colunas == COL_COD_LIVRO) return "Código do livro";
        return "";
    } 
}