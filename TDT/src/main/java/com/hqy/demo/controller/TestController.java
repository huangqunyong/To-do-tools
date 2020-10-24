package com.hqy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "测试")
public class TestController {

	@RequestMapping("/test")
	@ApiOperation("测试接口")
	public String test() {
		return "test";
	}
	
}
