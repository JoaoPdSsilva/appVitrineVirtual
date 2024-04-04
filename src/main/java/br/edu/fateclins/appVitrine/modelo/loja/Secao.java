package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table (name = "Tabela_Secao")
public class Secao {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @OneToMany
    @JoinColumn(name = "Tabela_Produto")
    private List<Produto> produtos;

    public Secao() {
    }

    public Secao(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
