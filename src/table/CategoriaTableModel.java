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
import model.Categoria;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CategoriaTableModel extends AbstractTableModel{
    
    //public static final int COL_COD_LIVRO = 0;
    public static final int COL_COD_SESSAO = 1;
    public ArrayList <Categoria> lista;

    public CategoriaTableModel (ArrayList<Categoria> l){
        lista = new ArrayList<Categoria> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Categoria categoria = lista.get(linhas);
        //if (colunas == COL_COD_LIVRO) return categoria.getCod_livro();
        if (colunas == COL_COD_SESSAO) return categoria.getCod_sessao();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        //if (colunas == COL_COD_LIVRO) return "Livro";
        if (colunas == COL_COD_SESSAO) return "Categoria(s)";
        return "";
    } 
}