package org.ant.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FunctionDemo {
	private static Log log = LogFactory.getLog(FunctionDemo.class);
	public void saySomething(String words){
		log.info("command is coming " + System.currentTimeMillis());
		System.out.println(words);
	}
}
