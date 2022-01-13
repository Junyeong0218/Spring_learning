package com.jun.web.domain.user;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {

	private int id;
	private String username;
	private String password;
	private String name;
	private String phone;
	private String gender;
	private Date birthday;
	private String email;
	private LocalDateTime signupDate;
	private LocalDateTime updateDate;
	private int permission;
	
}
