/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author TI
 */
public class LivroDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Livro> lista = new ArrayList<Livro>();
    private ArrayList<String> titulos = new ArrayList<String>(); 
    
    public LivroDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Livro livro) {
        String sql = "INSERT INTO LIVRO (CODIGO, TITULO, AUTOR, NPAGINAS, ANO, EDICAO, DESCRICAO) VALUES (?, ?, ?, ?, ?, ?, ?) ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, livro.getCodigo());
            stmt.setString(2, livro.getTitulo());
            stmt.setString(3, livro.getAutor());
            stmt.setInt(4, livro.getNpaginas());
            stmt.setInt(5, livro.getAno());
            stmt.setInt(6, livro.getEdicao());
            stmt.setString(7, livro.getDescricao());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public void alterar(Livro livro) {
        String sql = "UPDATE LIVRO SET TITULO = ?, AUTOR = ?, NPAGINAS = ?, ANO = ?, EDICAO = ?, DESCRICAO = ? WHERE CODIGO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getNpaginas());
            stmt.setInt(4, livro.getAno());
            stmt.setInt(5, livro.getEdicao());
            stmt.setString(6, livro.getDescricao());
            stmt.setInt(7, livro.getCodigo());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir(int valor) {
        String sql = "DELETE FROM LIVRO WHERE CODIGO = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Livro> Listartodos(){
        String sql = "SELECT * FROM LIVRO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Livro livro = new Livro();
                livro.setCodigo(rs.getInt("codigo"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setNpaginas(rs.getInt("npaginas"));
                livro.setAno(rs.getInt("ano"));
                livro.setEdicao(rs.getInt("edicao"));
                livro.setDescricao(rs.getString("descricao"));
                lista.add(livro);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <Livro> ListartodosNome(String titulo){
        String sql = "SELECT * FROM LIVRO WHERE NOME LIKE '%"+titulo+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Livro livro = new Livro();
                livro.setCodigo(rs.getInt("codigo"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setNpaginas(rs.getInt("npaginas"));
                livro.setAno(rs.getInt("ano"));
                livro.setEdicao(rs.getInt("edicao"));
                livro.setDescricao(rs.getString("descricao"));
                lista.add(livro);
            }
        }     
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <String> retornaTitulo(){
        String sql = "SELECT TITULO FROM LIVRO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                String tl = new String();
                tl = (rs.getString("titulo"));
                titulos.add(tl);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return titulos;
    }
    
    public ArrayList <Livro> ListarPorUsuario(int codigo){
        
        String sql = "SELECT * "
                   + "FROM livro "
                   + "WHERE codigo IN "
                                     + "(SELECT cod_livro "
                                     + "FROM emprestimo "
                                     + "WHERE cod_usuario = '"+codigo+"')";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Livro livro = new Livro();
                livro.setCodigo(rs.getInt("codigo"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setNpaginas(rs.getInt("npaginas"));
                livro.setAno(rs.getInt("ano"));
                livro.setEdicao(rs.getInt("edicao"));
                livro.setDescricao(rs.getString("descricao"));
                lista.add(livro);
            }
        }     
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
}

