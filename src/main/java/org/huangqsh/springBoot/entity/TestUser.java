package org.huangqsh.springBoot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component//保证可以注册到容器
@ConfigurationProperties(prefix = "testuser")//说明这个类需要读取配置文件，读取的前缀是testuser
@Data
public class TestUser {

	private int id;
	
	private String username;
	
	private String password;
	
}
