package br.edu.fateclins.appVitrine.controller;

import br.edu.fateclins.appVitrine.dto.ProdutoDTO;
import br.edu.fateclins.appVitrine.dto.SecaoDTO;
import br.edu.fateclins.appVitrine.modelo.loja.Produto;
import br.edu.fateclins.appVitrine.modelo.loja.Secao;
import br.edu.fateclins.appVitrine.repository.ProdutoRepository;
import br.edu.fateclins.appVitrine.repository.SecaoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecaoController {
    @Autowired
    SecaoRepository repositorioSecao;

    @PostMapping("/secao")
    public ResponseEntity<Secao> salvarSecao(@RequestBody SecaoDTO secaoDTO){
        var secaoModelo = new Secao();
        BeanUtils.copyProperties(secaoDTO, secaoModelo);
        return ResponseEntity.status(HttpStatus.CREATED).body(repositorioSecao.save(secaoModelo));
    }
}

