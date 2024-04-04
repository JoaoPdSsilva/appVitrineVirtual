package br.edu.fateclins.appVitrine.modelo.acesso;

import br.edu.fateclins.appVitrine.modelo.loja.Usuario;
import jakarta.persistence.*;

@Entity
@Table (name = "Tabela_UsuarioADM")
public class UsuarioADM  extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @ManyToOne
    private Perfil perfil;

    public UsuarioADM() {
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
