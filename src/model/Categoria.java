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
public class Categoria {
    
    private int cod_livro;
    private int cod_sessao;

    /**
     * @return the cod_livro
     */
    public int getCod_livro() {
        return cod_livro;
    }

    /**
     * @param cod_livro the cod_livro to set
     */
    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    /**
     * @return the cod_sessao
     */
    public int getCod_sessao() {
        return cod_sessao;
    }

    /**
     * @param cod_sessao the cod_sessao to set
     */
    public void setCod_sessao(int cod_sessao) {
        this.cod_sessao = cod_sessao;
    }
    
}
