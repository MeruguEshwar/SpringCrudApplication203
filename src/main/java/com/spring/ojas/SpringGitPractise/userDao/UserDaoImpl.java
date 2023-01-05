package com.spring.ojas.SpringGitPractise.userDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.spring.ojas.SpringGitPractise.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public int register(User user) {
		int i = (int) hibernateTemplate.save(user);
		return i;
	}

	@Override
	public List<User> login(String userName, String password) {
		
		String query = "select u.type from User u where u.userName=?0 and u.password=?1";
		System.out.println("userdaoimpl"+userName+""+password);
		Object[] queryparam = {userName,password};
		return (List<User>) hibernateTemplate.find(query,queryparam);
	}

}
