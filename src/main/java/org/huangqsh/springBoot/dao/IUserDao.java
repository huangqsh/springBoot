package org.huangqsh.springBoot.dao;

import org.huangqsh.springBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IUserDao extends JpaRepository<User,Integer> {
	
	public User findByUsername(String username);
	
	@Query(value = "select username from User where id = ?1")
	public String getUsernameById(Integer id);
	
	@Query(value = "select username from User where id = :id")
	public String getUsernameById2(@Param("id")Integer id);
}
