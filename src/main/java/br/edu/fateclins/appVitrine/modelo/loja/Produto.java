package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "Tabela_Produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private double valor;
    @Column
    private int qtdeEstoque;
    @Column
    private int estoqueMinimo;
    @Column(name = "Caminho_Imagem")
    private String imagem;
    @Transient
    private Secao secao;
    @OneToMany
    @JoinColumn(name = "Tabela_ItensVitrine")
    private List<ItensVitrine> vitrines;
    @OneToMany
    @JoinColumn(name = "Tabela_ItensComprados")
    private List<ItensComprados> listaComprados;

    public Produto() {
    }

    public List<Produto> pesquisarProdutosBaixoEstoque(List<Produto> listaEstoque){
        List<Produto> listaBaixoEstoque = new ArrayList<>();
        for (Produto prod:listaEstoque) {
            if(prod.getEstoqueMinimo() > prod.getQtdeEstoque()){
                listaBaixoEstoque.add(prod);
            }
        }
        return listaBaixoEstoque;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }

    public List<ItensVitrine> getVitrines() {
        return vitrines;
    }

    public void setVitrines(List<ItensVitrine> vitrines) {
        this.vitrines = vitrines;
    }

    public List<ItensComprados> getListaComprados() {
        return listaComprados;
    }

    public void setListaComprados(List<ItensComprados> listaComprados) {
        this.listaComprados = listaComprados;
    }


}
