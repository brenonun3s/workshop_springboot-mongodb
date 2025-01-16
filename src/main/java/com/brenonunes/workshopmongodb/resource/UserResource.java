package com.brenonunes.workshopmongodb.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brenonunes.workshopmongodb.domain.User;
import com.brenonunes.workshopmongodb.services.UserService;

//Para definir que a classe será um recurso REST, usa o @RestController
//Para definir qual o caminho do EndPoint, usa o RequestMapping
@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
