package com.senai.Caua.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Caua.entities.Cliente;
import com.senai.Caua.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	public List<Cliente> getAllclientes(){
		return clienteRepository.findAll();
	}
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
}
