package br.edu.fateclins.appVitrine.repository;

import br.edu.fateclins.appVitrine.modelo.loja.Secao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface SecaoRepository extends JpaRepository<Secao, UUID> {
}
