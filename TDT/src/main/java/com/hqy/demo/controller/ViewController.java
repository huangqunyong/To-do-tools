package com.hqy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Title: ViewController.java
 * @Package com.hqy.demo.controller
 * @Description:视图解析器
 * @author hqy
 * @date 2020-10-25
 * @version V1.0
 */
@Controller
public class ViewController {
	
	@RequestMapping("index")
	public String toIndexPage() {
		return "index";
	}

}
