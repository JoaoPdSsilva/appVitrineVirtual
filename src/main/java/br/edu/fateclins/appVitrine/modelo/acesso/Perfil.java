package br.edu.fateclins.appVitrine.modelo.acesso;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Tabela_Perfil")
public class Perfil {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column
private Integer id;
@Column
    private String descricao;
    @OneToMany
    @JoinColumn(name = "Tabela_UsuarioADM")
    private List<UsuarioADM> usuariosPerfil;

    public Perfil() {
    }

    public Perfil(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<UsuarioADM> getUsuariosPerfil() {
        return usuariosPerfil;
    }

    public void setUsuariosPerfil(List<UsuarioADM> usuariosPerfil) {
        this.usuariosPerfil = usuariosPerfil;
    }
}