package com.rays.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Handles application propagated exceptions
 * 
 * @author Anshul Prajapati
 *
 */
@ControllerAdvice
public class ApplicationExceptionHandlerCtl {
	
	@ExceptionHandler(value = RuntimeException.class)
	public ORSResponse handleRuntimeException(RuntimeException e){
		ORSResponse res = new ORSResponse(false);
		res.addMessage(e.getMessage()+"Anshul Prajapati");
		return res;
	}

}
