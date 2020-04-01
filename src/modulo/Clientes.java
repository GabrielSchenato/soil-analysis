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
public class Clientes {

    private int idCliente;
    private String nome;
    private String telefone;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;

    public Clientes(int idCliente, String nome, String telefone, String rua, String bairro, String cep, String cidade, String uf){
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        String texto = idCliente + " - " + nome;
        return texto;
    }
    
}
