package org.huangqsh.springBoot.model;

import lombok.Data;

@Data
public class ReturnModel {
	
	private String code;
	
	private String message;
	
	private Object data;

	public ReturnModel(String code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
}
