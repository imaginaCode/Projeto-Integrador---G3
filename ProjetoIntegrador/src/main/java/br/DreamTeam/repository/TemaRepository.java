package br.DreamTeam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.TemaModel;

public interface TemaRepository extends JpaRepository<TemaModel, Long> {


	Optional<TemaModel> findByNomeContainingIgnoreCase(String nome);

}
