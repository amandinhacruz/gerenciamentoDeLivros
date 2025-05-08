package com.amand.projeto.controller;

import com.amand.projeto.model.Livro;
import com.amand.projeto.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listarLivros(){
        return livroRepository.findAll();
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
        public void removerLivro(@PathVariable Long id){
            livroRepository.deleteById(id);
        }
    }

