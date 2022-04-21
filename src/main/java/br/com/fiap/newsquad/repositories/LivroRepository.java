package br.com.fiap.newsquad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.fiap.newsquad.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
