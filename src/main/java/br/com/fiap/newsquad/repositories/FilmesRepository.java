package br.com.fiap.newsquad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.newsquad.model.Filme;

@Repository
public interface FilmesRepository extends JpaRepository<Filme, Long> {

}
