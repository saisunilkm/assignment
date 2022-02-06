package com.thoughtfocus.project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class RegisterDTO {
	private String name;
	private String email;
	private long contact;
	private String password;
	private String confirmPassword;

}
