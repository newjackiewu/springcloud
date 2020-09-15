package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Company: Ouyeel
 * @Author: wuzijun
 * @create: 2020-09-14 17:34
 */
@FeignClient("server")
public interface Demo {

	@RequestMapping(method = RequestMethod.GET, value = "/baobao")
	String getStores(@RequestParam("s") String name);

}
