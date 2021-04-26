package com.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Client;
import com.dao.ClientRepository;

@RestController
public class Controller_client {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/create_client")
	public  ResponseEntity<Integer> create_client(@RequestBody Client client) {
		clientRepository.save(client);
		return new ResponseEntity<Integer>(202, HttpStatus.OK);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/liste")
	public ResponseEntity<List<Client>> liste_client () {
		
		return new ResponseEntity<List<Client>>(clientRepository.findAll(), HttpStatus.OK);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/delete")
	public ResponseEntity<Integer> delete_client (@RequestParam int id) {
		 clientRepository.deleteById(id);
		return new ResponseEntity<Integer>(202, HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/get_by_id")
	public ResponseEntity<Client> get_Client_by_id (@RequestBody int id) {
		Client client=new Client();
	Optional<Client> opt= clientRepository.findById(id);
	if(opt.isPresent()) {
		client=opt.get();
	}
		return new ResponseEntity<Client>(client, HttpStatus.OK);
	}

	@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
	@RequestMapping("/update_client")
	public ResponseEntity<Integer>  update_client (@RequestBody Client client) {
		  clientRepository.save(client);
		  return new ResponseEntity<Integer>(202, HttpStatus.OK);
	}
	
	
}
