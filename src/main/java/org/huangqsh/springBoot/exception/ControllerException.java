package org.huangqsh.springBoot.exception;

public class ControllerException extends BaseException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ControllerException() {
		super("error", "controller 异常");
	}
}
