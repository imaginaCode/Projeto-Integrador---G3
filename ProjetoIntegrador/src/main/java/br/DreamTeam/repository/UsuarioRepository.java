package br.DreamTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.DreamTeam.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> 
{

	

	List<UsuarioModel> findByNomeContainingIgnoreCase(String nome);

	

	

}
