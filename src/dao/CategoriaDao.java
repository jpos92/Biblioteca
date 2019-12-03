/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import model.Sessao;
/**
 *
 * @author TI
 */
public class CategoriaDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ArrayList <Sessao> lista = new ArrayList <Sessao>();
    
    public CategoriaDao(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Categoria categoria) {
        String sql = "INSERT INTO CATEGORIA (COD_LIVRO, COD_SESSAO) VALUES (?, ?) ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoria.getCod_livro());
            stmt.setInt(2, categoria.getCod_sessao());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public void excluir(int cod_livro, int cod_sessao) {
        String sql = "DELETE FROM CATEGORIA WHERE COD_LIVRO = " +cod_livro+ " AND COD_SESSAO = " +cod_sessao+ " " ;
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