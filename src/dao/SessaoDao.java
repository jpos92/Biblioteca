/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Sessao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author TI
 */
public class SessaoDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Sessao> lista = new ArrayList<Sessao>();
    
    public SessaoDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Sessao sessao) {
        String sql = "INSERT INTO SESSAO (CODIGO, CATEGORIA, LOCALIZACAO) VALUES (? , ?, ?) ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, sessao.getCodigo());
            stmt.setString(2, sessao.getCategoria());
            stmt.setString(3, sessao.getLocalizacao());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public void alterar(Sessao sessao) {
        String sql = "UPDATE SESSAO SET CATEGORIA = ?, LOCALIZACAO = ? WHERE CODIGO = ? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, sessao.getCategoria());
            stmt.setString(2, sessao.getLocalizacao());
            stmt.setInt(3, sessao.getCodigo());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir(int valor) {
        String sql = "DELETE FROM SESSAO WHERE CODIGO = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Sessao> Listartodos(){
        String sql = "SELECT * FROM SESSAO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Sessao sessao = new Sessao();
                sessao.setCodigo(rs.getInt("codigo"));
                sessao.setCategoria(rs.getString("categoria"));
                sessao.setLocalizacao(rs.getString("localizacao"));
                lista.add(sessao);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <Sessao> ListartodosNome(String categoria){
        String sql = "SELECT * FROM SESSAO WHERE CATEGORIA LIKE '%"+categoria+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Sessao sessao = new Sessao();
                sessao.setCodigo(rs.getInt("codigo"));
                sessao.setCategoria(rs.getString("categoria"));
                sessao.setLocalizacao(rs.getString("localizacao"));
                lista.add(sessao);
            }
        }     
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <Sessao> ListarPorLivro(int codigo){
        
        String sql = "SELECT * "
                   + "FROM sessao "
                   + "WHERE codigo IN "
                                     + "(SELECT cod_sessao "
                                     + "FROM categoria "
                                     + "WHERE cod_livro = '"+codigo+"')";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Sessao sessao = new Sessao();
                sessao.setCodigo(rs.getInt("codigo"));
                sessao.setCategoria(rs.getString("categoria"));
                sessao.setLocalizacao(rs.getString("localizacao"));
                lista.add(sessao);
            }
        }     
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
}