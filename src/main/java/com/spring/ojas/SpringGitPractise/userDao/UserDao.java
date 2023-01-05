package com.spring.ojas.SpringGitPractise.userDao;

import java.util.List;

import com.spring.ojas.SpringGitPractise.model.User;

public interface UserDao {
     int register(User user);
	
     List<User> login(String userName,String password);
}
