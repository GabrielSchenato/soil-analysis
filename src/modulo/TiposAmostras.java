/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

/**
 *
 * @author gabri
 */
public class TiposAmostras {
    private int idTipoAmostra;
    private String nome;
    private String descricao;
    
    public TiposAmostras(int idTipoAmostra, String nome, String descricao){
        this.idTipoAmostra = idTipoAmostra;
        this.nome = nome;
        this.descricao = descricao;
    }
    public int getidTipoAmostra() {
        return idTipoAmostra;
    }

    public void setidTipoAmostra(int idTipoAmostra) {
        this.idTipoAmostra = idTipoAmostra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String texto = nome + " [ " + descricao + " ]";
        return texto;
    }

}
