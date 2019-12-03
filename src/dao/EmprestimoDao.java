/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author JP
 */
public class EmprestimoDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ArrayList<Emprestimo> lista = new ArrayList<Emprestimo>();
    
    public EmprestimoDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Emprestimo emprestimo) {
        String sql = "INSERT INTO EMPRESTIMO (COD_USUARIO, COD_LIVRO) VALUES (?, ?) ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, emprestimo.getCod_usuario());
            stmt.setInt(2, emprestimo.getCod_livro());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public void excluir(int cod_usuario, int cod_livro) {
        String sql = "DELETE FROM EMPRESTIMO WHERE COD_USUARIO = " +cod_usuario+ " AND COD_LIVRO = " +cod_livro+ " " ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
}
