/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombocorreio.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Venda {
    private int codigo;
    private Cliente cliente;
    private Date data;
    private float preco;
    private ArrayList<Produto> produtos;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
