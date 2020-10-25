package com.hqy.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hqy.demo.bean.tdl;

/**
 * 
 * @Title: TDLService.java
 * @Package com.hqy.demo.service
 * @Description:相关逻辑操作接口
 * @author hqy
 * @date 2020-10-24
 * @version V1.0
 */
@Service
public interface TDLService {
	
	/**
	 * 查找全部待办事项
	 * @return 待办事项集合
	 * @throws CustomerException
	 */
	List<tdl> findAllTDL();
	
	/**
	 * 待办事项的录入
	 * @param tdl
	 */
	void saveTDL(tdl tdl);
	
	/**
	 * 
	 * @param id
	 * @return 查询指定id数据
	 * @throws CustomerException
	 */
	tdl findTDLById(Integer id);
	
}
