/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.modelo;

/**
 *
 * @author aluno
 */
public class Cliente {
    private int ID;
    private String CPF;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String nome;
    private String email;
    //Endereço
    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    public Cliente() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone_Resi() {
        return telefoneResidencial;
    }

    public void setTelefone_Resi(String Telefone_Resi) {
        this.telefoneResidencial = Telefone_Resi;
    }

    public String getTelefone_Celu() {
        return telefoneCelular;
    }

    public void setTelefone_Celu(String Telefone_Celu) {
        this.telefoneCelular = Telefone_Celu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String Rua) {
        this.rua = Rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String Bairro) {
        this.bairro = Bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String Cidade) {
        this.cidade = Cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }
}
