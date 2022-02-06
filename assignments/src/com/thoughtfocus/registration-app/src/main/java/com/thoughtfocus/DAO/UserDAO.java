package com.thoughtfocus.DAO;

import com.thoughtfocus.DTO.UserDTO;

public interface UserDAO {
	public boolean saveUser (UserDTO user); 
	public boolean authenticate (String username,String password);

}
