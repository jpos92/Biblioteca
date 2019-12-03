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
import model.Livro;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class LivroTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_TITULO = 1;
    public static final int COL_AUTOR = 2;
    public static final int COL_NPAGINAS = 3;
    public static final int COL_ANO = 4;
    public static final int COL_EDICAO = 5;
    public static final int COL_DESCRICAO = 6;
    public ArrayList <Livro> lista;

    public LivroTableModel (ArrayList<Livro> l){
        lista = new ArrayList<Livro> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Livro livro = lista.get(linhas);
        if (colunas == COL_CODIGO) return livro.getCodigo();
        if (colunas == COL_TITULO) return livro.getTitulo();
        if (colunas == COL_AUTOR) return livro.getAutor();
        if (colunas == COL_NPAGINAS) return livro.getNpaginas();
        if (colunas == COL_ANO) return livro.getAno();
        if (colunas == COL_EDICAO) return livro.getEdicao();
        if (colunas == COL_DESCRICAO) return livro.getDescricao();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO) return "Código";
        if (colunas == COL_TITULO) return "Título";
        if (colunas == COL_AUTOR) return "Autor";
        if (colunas == COL_NPAGINAS) return "Nº de páginas";
        if (colunas == COL_ANO) return "Ano";
        if (colunas == COL_EDICAO) return "Edicao";
        if (colunas == COL_DESCRICAO) return "Descrição";
        return "";
    } 
}