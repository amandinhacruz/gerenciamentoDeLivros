package com.amand.projeto.repository;

import com.amand.projeto.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
