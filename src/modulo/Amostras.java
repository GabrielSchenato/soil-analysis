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
public class Amostras {

    private int idAmostra;
    private int idTipoAmostra;
    private String nome;
    private String descricao;
    private int idCliente;
    private int idSolicitante;
    private String area;
    private String complemento;
    private int idCaixa;

    public Amostras(int idAmostra, int idTipoAmostra, String nome, String descricao, int idCliente, int idSolicitante, String area, String complemento, int idCaixa) {
        this.idAmostra = idAmostra;
        this.idTipoAmostra = idTipoAmostra;
        this.nome = nome;
        this.descricao = descricao;
        this.idSolicitante = idSolicitante;
        this.area = area;
        this.complemento = complemento;
        this.idCaixa = idCaixa;
    }

    public int getIdAmostra() {
        return idAmostra;
    }

    public void setIdAmostra(int idAmostra) {
        this.idAmostra = idAmostra;
    }

    public int getIdTipoAmostra() {
        return idTipoAmostra;
    }

    public void setIdTipoAmostra(int idTipoAmostra) {
        this.idTipoAmostra = idTipoAmostra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
    
    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdAnalise(int idAnalise) {
        this.idCaixa = idAnalise;
    }

    @Override
    public String toString() {
        String texto = idAmostra + " - " + nome + " - " + descricao;
        return texto;
    }

}
