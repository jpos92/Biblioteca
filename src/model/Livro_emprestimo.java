/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JP
 */
public class Livro_emprestimo {
    
    private String tituloLivro;
    private String nomeUsuario;
    private String data_emp;
    private String data_dev;
    
    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getData_emprestimo() {
        return data_emp;    
    }
    
    public void setData_emprestimo(String data_empr) {
        this.data_emp = data_empr;
    }
    
    public String getData_devolucao() {
        return data_dev;    
    }
    
    public void setData_devolucao(String data_devo) {
        this.data_dev = data_devo;
    }
}
