package br.com.infnet.appmembros.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.appmembros.model.negocio.Detalhe;

@Repository
public interface IDetalheRepository extends CrudRepository<Detalhe, Integer> {

	List<Detalhe> findAll(Sort by);
}
