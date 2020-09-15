package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Company: Ouyeel
 * @Author: wuzijun
 * @create: 2020-09-14 15:36
 */
@RestController
public class Demo1 {

	Log log = LogFactory.getLog(Demo1.class);

	@RequestMapping("/baobao")
	public String test(String s){
		log.info("我被调了！");
		return s;
	}
}
