package com.hqy.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqy.demo.bean.tdl;
import com.hqy.demo.service.TDLService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Title: TDLController.java
 * @Package com.hqy.demo.controller
 * @Description:用于映射thymeleaf页面的Controller类
 * @author hqy
 * @date 2020-10-24
 * @version V1.0
 */
@Controller
@Api(description = "待办事项接口")
public class TDLController {
	
	@Autowired
	private TDLService tdlService;

	@RequestMapping("addTDL")
	@ResponseBody
	@ApiOperation("待办事项的录入")
	public String addTDL(tdl tdl){
		tdlService.saveTDL(tdl);
		return "保存成功";
	}
	
	@RequestMapping("showTDL")
	@ApiOperation("待办事项的显示")
	public String toRole(HttpSession session){
		session.setAttribute("tdl", tdlService.findAllTDL());
		
		return "pages/showTDL";
	}
	
	@RequestMapping("findTDLById")
	@ResponseBody
	@ApiOperation("查找指定id数据")
	public tdl findTDLById(Integer id,HttpSession session){
		return tdlService.findTDLById(id);
	}
	
}
