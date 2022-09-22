package br.com.agtec.ConfigurationBeanExample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agtec.ConfigurationBeanExample.anotations.Camaro;
import br.com.agtec.ConfigurationBeanExample.anotations.Gol;
import br.com.agtec.ConfigurationBeanExample.models.Carro;

@RestController
public class CarroController {

	//Indicam um bean que será injetado nessa variável.
	//Vai ser substituído pelo anotação personalizada criada.
//	@Autowired
//	@Qualifier("camaro")
	@Gol
	private Carro carro;
	
	@GetMapping(value = "/nomeCarro")
	public String getNomeCarro() {
		
		return this.carro.getNome();
	}
}
