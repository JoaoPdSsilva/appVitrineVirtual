package br.edu.fateclins.appVitrine.modelo.loja;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String senha;

    public Usuario() {
    }

    public boolean logar(){
        return true;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
