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
import model.Livro_emprestimo;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class Livro_emprestimoTableModel extends AbstractTableModel{
    
    public static final int COL_TITULOLIVRO = 0;
    public static final int COL_NOMEUSUARIO = 1;
    public static final int COL_DATA_EMP = 2;
    public static final int COL_DATA_DEV = 3;
    public ArrayList <Livro_emprestimo> lista;

    public Livro_emprestimoTableModel (ArrayList<Livro_emprestimo> l){
        lista = new ArrayList<Livro_emprestimo> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Livro_emprestimo livro_emprestimo = lista.get(linhas);
        if (colunas == COL_TITULOLIVRO) return livro_emprestimo.getTituloLivro();
        if (colunas == COL_NOMEUSUARIO) return livro_emprestimo.getNomeUsuario();
        if (colunas == COL_DATA_EMP) return livro_emprestimo.getData_emprestimo();
        if (colunas == COL_DATA_DEV) return livro_emprestimo.getData_devolucao();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_TITULOLIVRO) return "Livro";
        if (colunas == COL_NOMEUSUARIO) return "Usuário";
        if (colunas == COL_DATA_EMP) return "Data de retirada";
        if (colunas == COL_DATA_DEV) return "Data de devolução";
        return "";
    } 
}
