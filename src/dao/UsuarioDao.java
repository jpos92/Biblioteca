/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author TI
 */
public class UsuarioDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Usuario> lista = new ArrayList<Usuario>();
    private ArrayList<String> nomes = new ArrayList<String>();
   
    
    public UsuarioDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO USUARIO (CODIGO, MATRICULA, NOME, EMAIL, ENDERECO, TELEFONE) VALUES (?, ?, ?, ?, ?, ?) ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, usuario.getCodigo());
            stmt.setString(2, (usuario.getMatricula()));
            stmt.setString(3, usuario.getNome());
            stmt.setString(4, usuario.getEmail());
            stmt.setString(5, usuario.getEndereco());
            stmt.setString(6, usuario.getTelefone());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public void alterar(Usuario usuario) {
        String sql = "UPDATE USUARIO SET MATRICULA = ?, NOME = ?, EMAIL = ?, ENDERECO = ?, TELEFONE = ? WHERE CODIGO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, usuario.getMatricula());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getEndereco());
            stmt.setString(5, usuario.getTelefone());
            stmt.setInt(6, usuario.getCodigo());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int codigo) {
        String sql = "DELETE FROM USUARIO WHERE CODIGO = " + codigo ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Usuario> Listartodos(){
        String sql = "SELECT * FROM USUARIO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setMatricula(rs.getString("matricula"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setTelefone(rs.getString("telefone"));
                lista.add(usuario);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <Usuario> ListartodosNome(String nome){
        String sql = "SELECT * FROM USUARIO WHERE NOME LIKE '%"+nome+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt("codigo"));
                usuario.setMatricula(rs.getString("matricula"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setTelefone(rs.getString("telefone"));
                lista.add(usuario);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    public ArrayList <String> retornaNome(){
        String sql = "SELECT NOME FROM USUARIO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                String nm = new String();
                nm = (rs.getString("nome"));
                nomes.add(nm);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return nomes;
    }
}
