package org.huangqsh.springBoot.exception;

import javax.servlet.http.HttpServletRequest;

import org.huangqsh.springBoot.model.ReturnModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice//controller 的增强版
@Slf4j
public class GlobalExceptionHander {

	@ExceptionHandler(value = ControllerException.class)//这里说明要处理ControllerException异常
	@ResponseBody
	public ReturnModel controllerExceptionHandler(HttpServletRequest request, ControllerException exception) throws Exception {
		log.error("拦截了controllerExceptionHandler异常");
		return new ReturnModel(exception.getCode(), exception.getMessage(), null) ;
    }
	
	@ExceptionHandler(value = ServiceException.class)
	@ResponseBody
	public ReturnModel serviceExceptionHandler(HttpServletRequest request, ServiceException exception) throws Exception {
		log.error("拦截了serviceExceptionHandler异常");
		return new ReturnModel(exception.getCode(), exception.getMessage(), null) ;
    }
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ReturnModel OtherExceptionHandler(HttpServletRequest request, Exception exception) throws Exception {
		log.error("拦截了OtherExceptionHandler异常");
		return new ReturnModel("error", exception.getMessage(), null) ;
    }
}
