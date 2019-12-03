/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Livro_emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author JP
 */
public class Livro_emprestimoDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Livro_emprestimo> lista = new ArrayList<Livro_emprestimo>();
    
    public Livro_emprestimoDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Livro_emprestimo livro_emprestimo) {
        String sql = "INSERT INTO LIVRO_EMPRESTIMO (TITULOLIVRO, NOMEUSUARIO, DATA_EMP, DATA_DEV) VALUES (?, ?, ?, ?) ";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livro_emprestimo.getTituloLivro());
            stmt.setString(2, livro_emprestimo.getNomeUsuario());
            stmt.setString(3, livro_emprestimo.getData_emprestimo());
            stmt.setString(4, livro_emprestimo.getData_devolucao());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public ArrayList <Livro_emprestimo> Listartodos(){
        String sql = "SELECT * FROM LIVRO_EMPRESTIMO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Livro_emprestimo livro_emprestimo = new Livro_emprestimo();
                livro_emprestimo.setTituloLivro(rs.getString("tituloLivro"));
                livro_emprestimo.setNomeUsuario(rs.getString("nomeUsuario"));
                livro_emprestimo.setData_emprestimo(rs.getString("data_emp"));
                livro_emprestimo.setData_devolucao(rs.getString("data_dev"));
                lista.add(livro_emprestimo);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <Livro_emprestimo> ListartodosCodigo(String usuario){
        String sql = "SELECT * FROM LIVRO_EMPRESTIMO WHERE COD_EMPRESTIMO LIKE '%"+usuario+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Livro_emprestimo livro_emprestimo = new Livro_emprestimo();
                livro_emprestimo.setTituloLivro(rs.getString("tituloLivro"));
                livro_emprestimo.setNomeUsuario(rs.getString("nomeUsuario"));
                livro_emprestimo.setData_emprestimo(rs.getString("data_emp"));
                livro_emprestimo.setData_devolucao(rs.getString("data_dev"));
                lista.add(livro_emprestimo);
            }
        }   
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
}
