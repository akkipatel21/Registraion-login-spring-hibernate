package org.esense.dao;

import org.esense.model.User;

public interface UserDao {

	public int registerUser(User user);

	public String loginUser(User user);

}
