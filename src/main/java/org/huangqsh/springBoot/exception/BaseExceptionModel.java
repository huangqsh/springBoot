package org.huangqsh.springBoot.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseExceptionModel extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String message;

	public BaseExceptionModel(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
	
	

}
