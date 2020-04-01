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
public class Caixas {

    private int idCaixa;
    private int situacao;
    
    public Caixas(int idCaixa, int situacao){
        this.idCaixa = idCaixa;
        this.situacao = situacao;
    }
    
    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }
    
    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        String texto = "Caixa: " + idCaixa;
        return texto;
    }
    
    
}
