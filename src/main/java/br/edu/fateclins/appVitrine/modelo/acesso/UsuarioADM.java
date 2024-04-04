package br.edu.fateclins.appVitrine.modelo.acesso;

import br.edu.fateclins.appVitrine.modelo.loja.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.io.Serializable;
@Entity
@PrimaryKeyJoinColumn(name = "ID_USUARIO")
public class UsuarioADM  extends Usuario implements Serializable {

    private Perfil perfil;

    public UsuarioADM() {
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
