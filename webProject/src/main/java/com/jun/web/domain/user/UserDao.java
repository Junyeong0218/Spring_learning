package com.jun.web.domain.user;

public interface UserDao {

	public int selectUsernameByUsername(String username);
	public User selectUserByUsername(String username);
	public int signinByUser(User user);
	public int signup(User user);
}
