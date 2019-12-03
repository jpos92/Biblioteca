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
import model.Usuario;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class UsuarioTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_MATRICULA = 1;
    public static final int COL_NOME = 2;
    public static final int COL_EMAIL = 3;
    public static final int COL_ENDERECO = 4;
    public static final int COL_TELEFONE = 5;
    public ArrayList <Usuario> lista;

    public UsuarioTableModel (ArrayList<Usuario> l){
        lista = new ArrayList<Usuario> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Usuario usuario = lista.get(linhas);
        if (colunas == COL_CODIGO) return usuario.getCodigo();
        if (colunas == COL_MATRICULA) return usuario.getMatricula();
        if (colunas == COL_NOME) return usuario.getNome();
        if (colunas == COL_EMAIL) return usuario.getEmail();
        if (colunas == COL_ENDERECO) return usuario.getEndereco();
        if (colunas == COL_TELEFONE) return usuario.getTelefone();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO) return "Código";
        if (colunas == COL_MATRICULA) return "Matrícula";
        if (colunas == COL_NOME) return "Nome";
        if (colunas == COL_EMAIL) return "Email";
        if (colunas == COL_ENDERECO) return "Endereço";
        if (colunas == COL_TELEFONE) return "Telefone";
        return "";
    } 
}