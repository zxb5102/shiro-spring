package com.github.zhangkaitao.shiro.chapter12.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import com.github.zhangkaitao.shiro.chapter12.entity.RespMessage;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-12
 * <p>Version: 1.0
 */
@ControllerAdvice
@ResponseBody
public class DefaultExceptionHandler {
    @ExceptionHandler
    public RespMessage processUnauthenticatedException(NativeWebRequest request, Exception e) {
    	return new RespMessage(e.getMessage(), "");
    }
}
