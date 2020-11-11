package br.DreamTeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.ComentarioModel;

public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long>{

}
