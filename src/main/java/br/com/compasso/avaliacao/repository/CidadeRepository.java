package br.com.compasso.avaliacao.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.avaliacao.model.Cidade;


@Repository
@Transactional
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	Cidade findByNome(String nome);
	
	List<Cidade> findByEstado(String estado);
	
	
}
