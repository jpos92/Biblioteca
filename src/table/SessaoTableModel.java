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
import model.Sessao;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class SessaoTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_CATEGORIA = 1;
    public static final int COL_LOCALIZACAO = 2;
    public ArrayList <Sessao> lista;

    public SessaoTableModel (ArrayList<Sessao> l){
        lista = new ArrayList<Sessao> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Sessao sessao = lista.get(linhas);
        if (colunas == COL_CODIGO) return sessao.getCodigo();
        if (colunas == COL_CATEGORIA) return sessao.getCategoria();
        if (colunas == COL_LOCALIZACAO) return sessao.getLocalizacao();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO) return "Código";
        if (colunas == COL_CATEGORIA) return "Categoria";
        if (colunas == COL_LOCALIZACAO) return "Localização";
        return "";
    } 
}
