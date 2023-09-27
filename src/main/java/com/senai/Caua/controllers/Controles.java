package com.senai.Caua.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Caua.entities.Cliente;
import com.senai.Caua.services.ClienteService;

@RestController
@RequestMapping("/client")
public class Controles {

	private final ClienteService clienteService;

	@Autowired
	public  Controles(ClienteService clienteService){
		this.clienteService = clienteService;
	}
	@PostMapping
	public Cliente createdClient(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente> getAllProdutos(){
		return clienteService.getAllclientes();
	}
	
	@GetMapping("/{idcCliente}")
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}
	
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
}
