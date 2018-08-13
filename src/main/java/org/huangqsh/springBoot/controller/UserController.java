package org.huangqsh.springBoot.controller;

import org.huangqsh.springBoot.dao.IUserDao;
import org.huangqsh.springBoot.entity.TestUser;
import org.huangqsh.springBoot.entity.User;
import org.huangqsh.springBoot.exception.ControllerException;
import org.huangqsh.springBoot.model.ReturnModel;
import org.huangqsh.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private IUserDao userDao;
	@Autowired
	private UserService userService;
	
	@Autowired
	private TestUser tuser;
	@Value("${param}")
	private String param;
	
	@RequestMapping("/getParam")
	public ReturnModel getParam() {
		return new ReturnModel("1", param, tuser);
	}
	
	@RequestMapping("/findUserByName")
	public ReturnModel findUserByName() {
		User user = userService.findByUsername("admin");
		return new ReturnModel("1", "success", user);
	}
	
	@RequestMapping("/getUsernameById")
	public ReturnModel getUsernameById() {
		//会抛出异常，做异常测试
		String restult = userDao.getUsernameById(1);
		return new ReturnModel("1", "success", restult);
	}
	
	@RequestMapping("/exception1")
	public void exception1() {
		//测试业务异常
		userService.getServiceException();
	}
	
	@RequestMapping("/exception2")
	public String exception2() {
		throw new ControllerException();
	}
}
