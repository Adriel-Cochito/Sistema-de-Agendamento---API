package br.com.infnet.appmembros.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.appmembros.model.negocio.Membro;
import br.com.infnet.appmembros.model.repository.IMembroRepository;

@Service
public class MembroService {

	@Autowired private IMembroRepository repository;
	
	public void incluir(Membro membro) {
		repository.save(membro);
	}
	
	public List<Membro> obterLista() {
		return (List<Membro>)repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		repository.deleteById(id);		
	}

	public Membro obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}