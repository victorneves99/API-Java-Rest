package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.dommain.model.Cliente;

@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List <Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Victor Francisco Neves ");
		cliente1.setEmail("victorneves99@gvmail.com");
		cliente1.setTelefone("31 3331-1327");
		
		var cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Virgilio Neves ");
		cliente2.setEmail("virgilioneves.com");
		cliente2.setTelefone("31 3331-1327");
		
       var cliente3 = new Cliente();
		
		cliente3.setId(3L);
		cliente3.setNome("Neves ");
		cliente3.setEmail("");
		cliente3.setTelefone("31 3331-1327");
		
		return Arrays.asList(cliente1, cliente2,cliente3);
	}

}
