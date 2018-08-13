package org.huangqsh.springBoot.service;

import org.huangqsh.springBoot.Application;
import org.huangqsh.springBoot.dao.IUserDao;
import org.huangqsh.springBoot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestBoot {
	
	@Autowired
	private IUserDao userDao;
	
	@Test
	public void test1() {
		User user = userDao.findByUsername("悟空");
		System.out.println(user);
	}
	@Test
	public void test2() {
		System.out.println(userDao.getUsernameById2(1));
	}
}
