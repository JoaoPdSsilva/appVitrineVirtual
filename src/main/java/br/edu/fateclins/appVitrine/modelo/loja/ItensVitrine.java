package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

@Entity
@Table (name = "Tabela_ItensVitrine")
public class ItensVitrine {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int qtdeDisponivel;
    @ManyToOne
    @JoinColumn(name = "Tabela_Produto")
    private Produto produto;
    @ManyToOne
    @JoinColumn(name = "Tabela_Vitrine")
    private Vitrine vitrine;

    public ItensVitrine() {
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vitrine getVitrine() {
        return vitrine;
    }

    public void setVitrine(Vitrine vitrine) {
        this.vitrine = vitrine;
    }
}
