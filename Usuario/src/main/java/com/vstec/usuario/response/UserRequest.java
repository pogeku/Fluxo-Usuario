package com.vstec.usuario.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(

		@NotBlank(message = "User name is required") 
		String name,

		@NotBlank(message = "Password is required") 
		@Size(min = 6, message = "Password must be at least 6 characters long") 
		String password,

		@NotBlank(message = "Email is required")
		@Email(message = "Email should be valid")
		String email) {

}
