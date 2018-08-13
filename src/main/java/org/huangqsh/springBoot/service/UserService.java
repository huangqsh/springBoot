package org.huangqsh.springBoot.service;

import org.huangqsh.springBoot.dao.IUserDao;
import org.huangqsh.springBoot.entity.User;
import org.huangqsh.springBoot.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private IUserDao userDao;

	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	public void getServiceException() {
		throw new ServiceException();		
	}
	
}
