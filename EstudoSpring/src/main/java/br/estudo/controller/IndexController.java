package br.estudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.estudo.model.Cliente;
import br.estudo.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
public class IndexController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	public ResponseEntity<?> todosClientes(){
		
		return new ResponseEntity<>(clienteRepository.findAll(),HttpStatus.OK);	
	}
	
	
	@PostMapping
	public ResponseEntity<?> salvarCliente(@RequestBody Cliente cliente){
		
		return new ResponseEntity<>(clienteRepository.save(cliente),HttpStatus.OK);	
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deletaCliente(@PathVariable("id") Long id){
		
		clienteRepository.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);	
	}
	
	
	@PutMapping
	public ResponseEntity<?> atualizarCliente(@RequestBody Cliente cliente){
		
		return new ResponseEntity<>(clienteRepository.save(cliente),HttpStatus.OK);	
	}
	
		
	
	
}
