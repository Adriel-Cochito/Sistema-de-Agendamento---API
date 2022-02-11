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

import br.com.infnet.appmembros.model.negocio.Detalhe;
import br.com.infnet.appmembros.model.service.DetalheService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/membro")
public class DetalheController {

	@Autowired private DetalheService detalheService;
	
	@ApiOperation(value = "Retornar uma lista de Detalhe")
	@GetMapping(value = "/detalhes")
	public List<Detalhe> obterLista() {
		return detalheService.obterLista(); 
	}
	
	@ApiOperation(value = "Retornar um detalhe")
	@GetMapping(value = "/detalhe/{id}")
	public Detalhe obterPorId(@PathVariable Integer id) {
		return detalheService.obterPorId(id);
	}

	@ApiOperation(value = "Cadastrar um novo detalhe")
	@PostMapping(value = "/detalhe/incluir")
	public void incluir(@RequestBody Detalhe detalhe) {
		detalheService.incluir(detalhe);
	}
	
	@ApiOperation(value = "Remover um detalhe existente")
	@DeleteMapping(value = "/detalhe/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		detalheService.excluir(id);
	}
}
