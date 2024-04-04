package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private boolean concluida;
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @Column
    private double valorFrete;
    @ManyToOne
    @JoinColumn(name ="Cliente")
    private Cliente cliente;
    @OneToMany
    @JoinColumn(name ="ItensComprados")
    private List<ItensComprados> itens;

    public Compra() {
    }

    public double calcularValorFinal(){
        double valorCompra = 0.0;
        for (ItensComprados item:itens ) {
            valorCompra += item.getQuantidade()* item.getValor();
        }
        return valorCompra;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensComprados> getItens() {
        return itens;
    }

    public void setItens(List<ItensComprados> itens) {
        this.itens = itens;
    }
}
