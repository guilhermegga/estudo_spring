package br.estudo.repository;


import org.springframework.data.repository.CrudRepository;

import br.estudo.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
	
//	public Cliente findByNome();

}
