package br.com.infnet.appmembros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.appmembros.model.negocio.Membro;
import br.com.infnet.appmembros.model.service.MembroService;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/api/membro")
public class MembroController {

	@Autowired private MembroService membroService;
	
	@ApiOperation(value = "Retornar uma lista de membros")
	@GetMapping(value = "/membros")
	public List<Membro> obterLista() {
		return membroService.obterLista(); 
	}
	
	@ApiOperation(value = "Retornar um membro")
	@GetMapping(value = "/membro/{id}")
	public Membro obterPorId(@PathVariable Integer id) {
		return membroService.obterPorId(id);
	}

	@ApiOperation(value = "Cadastrar um novo membro")
	@PostMapping(value = "/membro/incluir")
	public void incluir(@RequestBody Membro membro) {
		membroService.incluir(membro);
	}
	
	@ApiOperation(value = "Remover um membro existente")
	@DeleteMapping(value = "/membro/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		membroService.excluir(id);
	}
}