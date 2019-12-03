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
public class Livro {
    
    private int codigo;
    private String titulo;
    private String autor;
    private int nPaginas;
    private int ano;
    private int edicao;
    private String descricao;
    
    public int getCodigo() {
        return codigo;    
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;    
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;    
    } 
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNpaginas() {
        return nPaginas;
    }

    public void setNpaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String sinopse) {
        this.descricao = sinopse;
    }
}
