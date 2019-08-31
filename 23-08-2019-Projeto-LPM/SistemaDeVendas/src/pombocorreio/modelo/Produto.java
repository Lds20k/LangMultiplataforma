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
public class Produto {
    private int codigo;
    private String unidade;
    private String unidadeTipo;
    private String descricao;
    private float preco;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getUnidadeTipo() {
        return unidadeTipo;
    }

    public void setUnidadeTipo(String unidadeTipo) {
        this.unidadeTipo = unidadeTipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
