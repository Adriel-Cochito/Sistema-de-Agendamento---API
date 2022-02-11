package br.com.infnet.appmembros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.appmembros.model.negocio.Detalhe;
import br.com.infnet.appmembros.model.repository.IDetalheRepository;

@Service
public class DetalheService {

	@Autowired private IDetalheRepository repository;
	
	public void incluir(Detalhe detalhe) {
		repository.save(detalhe);
	}
	
	public List<Detalhe> obterLista() {
		return (List<Detalhe>)repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	public void excluir(Integer id) {
		repository.deleteById(id);		
	}

	public Detalhe obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
