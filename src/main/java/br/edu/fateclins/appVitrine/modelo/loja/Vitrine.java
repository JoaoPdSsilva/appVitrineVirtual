package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table (name = "Tabela_Vitrine")
public class Vitrine {
   @Temporal(TemporalType.DATE)
    private Date dataInicio;
   @Temporal(TemporalType.DATE)
    private Date dataFim;
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
   @OneToMany
   @JoinColumn(name = "Tabela_ItensVitrine")
    private List<ItensVitrine> itensVitrine;

    public Vitrine() {
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ItensVitrine> getItensVitrine() {
        return itensVitrine;
    }

    public void setItensVitrine(List<ItensVitrine> itensVitrine) {
        this.itensVitrine = itensVitrine;
    }
}
