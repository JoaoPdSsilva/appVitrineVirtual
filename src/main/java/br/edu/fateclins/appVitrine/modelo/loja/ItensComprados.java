package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;
@Entity
public class ItensComprados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private int quantidade;
    @Column
    private double valor;
    @OneToOne
    @JoinColumn(name = "Compra")
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "Produtos")
    private Produto produto;

    public ItensComprados() {
    }

    public ItensComprados(int quantidade, double valor, Compra compra, Produto produto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.compra = compra;
        this.produto = produto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
