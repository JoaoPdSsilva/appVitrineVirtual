package br.edu.fateclins.appVitrine.modelo.acesso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.List;


public class Perfil implements Serializable {

    private Integer id;
    private String descricao;
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