package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Vitrine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Transient
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<ItensVitrine> getItensVitrine() {
        return itensVitrine;
    }

    public void setItensVitrine(List<ItensVitrine> itensVitrine) {
        this.itensVitrine = itensVitrine;
    }
}
