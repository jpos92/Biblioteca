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
public class Sessao {
    
    private int codigo;
    private String categoria;
    private String localizacao;

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacao() {
        return localizacao;
    } 
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    @Override
    
    public String toString(){
       return getCategoria();
       //return String.valueOf(getCodigo());
    } 
}
