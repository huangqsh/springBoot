package org.huangqsh.springBoot.service;

import javax.annotation.Resource;

import org.huangqsh.springBoot.Application;
import org.huangqsh.springBoot.dao.IUserDao;
import org.huangqsh.springBoot.entity.TestUser;
import org.huangqsh.springBoot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestBoot {
	@Resource
	private IUserDao userDao;
	@Autowired
	private TestUser tuser;
	@Autowired
	private UserService userService;

	@Test
	public void test1() {
		System.out.println(tuser.getUsername());
		User user = userService.findByUsername("admin");
		System.out.println(user);
	}

}
