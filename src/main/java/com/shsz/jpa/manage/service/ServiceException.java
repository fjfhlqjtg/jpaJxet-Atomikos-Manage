package com.shsz.jpa.manage.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author changyy(502341194@163.com)
 * @function 自定义Service异常
 * @date Jul 10, 2012
 */
public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ServiceException() {

	}

	/**
	 * 
	 * @param msg
	 */
	public ServiceException(String msg) {
		super(msg);
	}

	/**
	 * 
	 * @param msg
	 * @param throwable
	 */
	public ServiceException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	/**
	 * 
	 * @param throwable
	 */
	public ServiceException(Throwable throwable) {
		super(throwable);
	}
	
    public String getMessage2()
    {
    	System.out.println("错误信息begin1");
    	String message=super.getMessage();
    	// TODO Auto-generated method stub
    	System.out.println("错误信息begin2"+this.getCause());
    	System.out.println("错误信息begin3"+this.getCause().getCause());
    	System.out.println("错误信息begin4"+message);
    	if(this.getCause() != null || this.getCause().getCause() != null){
    		message= this.getCause().getCause().getMessage();
  		}
    	Pattern pattern=Pattern.compile("ORA-20020:(.+)\nORA-06512: 在");
    	Matcher  matcher=pattern.matcher(message);
    	if (matcher.find())
    	{
    		message=matcher.group(1);
    	}
		System.out.println("错误信息"+message);
    	return message;
    }
}
