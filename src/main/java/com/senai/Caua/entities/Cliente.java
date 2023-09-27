package com.senai.Caua.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente ;
		
	@Column(name = "Nome")
	private String nCliente;
	
	@Column(name = "Fone")
	private String fone;
	
	public Long getidcCliente() {
		return idcCliente;
	}
	
	public String getnCliente() {
		return nCliente;
	}

	public String getfone() {
		return fone;
	}
	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente; //Esta função insere um valor no metodo destacado//
	}
	
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
		}
	
	public void setfone(String fone) {
		this.fone = fone;
		}
	
}
