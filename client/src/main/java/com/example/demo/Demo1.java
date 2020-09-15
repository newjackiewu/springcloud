package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Company: Ouyeel
 * @Author: wuzijun
 * @create: 2020-09-14 15:36
 */
@RestController
public class Demo1  {

	@Autowired
	private Demo demo;

	@Autowired
	private RestTemplate restTemplate;

	Log log = LogFactory.getLog(Demo1.class);


	@HystrixCommand(fallbackMethod = "baobaoError")
	@RequestMapping("/baobao")
	public String test(String s){
		return demo.getStores(s);
		/*return restTemplate.getForObject("http://server/baobao?s="+s,String.class);*/
	}

	public String baobaoError(String s){
		log.info("error!");
		return "调用错误";
	}
}
