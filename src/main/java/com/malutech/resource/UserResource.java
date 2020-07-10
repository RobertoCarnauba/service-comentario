package com.malutech.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malutech.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<List<User>> findall(){
		User maria = new User("1", "Roberto Carnaúba", "betocarnauba@teste.com");
		List<User> list = new ArrayList<>();
		list.add(maria);
		return ResponseEntity.ok().body(list);
	}

}
