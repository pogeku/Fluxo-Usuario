package com.vstec.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vstec.usuario.response.UserRequest;
import com.vstec.usuario.response.UserResponse;
import com.vstec.usuario.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	@Autowired
	private final UserService service;

	@GetMapping("/get")
	public ResponseEntity<List<UserResponse>> findAll() {
		return ResponseEntity.ok(service.getAllUsers());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<UserResponse> findById(@PathVariable("id") Integer userId) {
		return ResponseEntity.ok(service.findById(userId));
	}

	@PostMapping("/create")
	public ResponseEntity<Integer> createUser(@RequestBody @Valid UserRequest request) {
		return ResponseEntity.ok(service.createUser(request));
	}
	
	// It should be DeleteMapping
	@PostMapping("/delete/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id") Integer userId) {
		service.deleteUser(userId);
		return ResponseEntity.accepted().build();
	}

}
