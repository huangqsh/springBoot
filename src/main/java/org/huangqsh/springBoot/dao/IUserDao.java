package org.huangqsh.springBoot.dao;

import org.huangqsh.springBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserDao extends JpaRepository<User,Integer> {
	
	public User findByUsername(String username);
	
	public String getUsernameById(Integer id);
}
