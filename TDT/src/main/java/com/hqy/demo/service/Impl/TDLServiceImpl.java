package com.hqy.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqy.demo.bean.tdl;
import com.hqy.demo.mapper.tdlMapper;
import com.hqy.demo.service.TDLService;

/**
 * 
 * @Title: TDLServiceImpl.java
 * @Package com.hqy.demo.service.Impl
 * @Description:相关逻辑操作实现类
 * @author hqy
 * @date 2020-10-24
 * @version V1.0
 */
@Service
public class TDLServiceImpl implements TDLService {

	@Autowired
	private tdlMapper tdlMapper;
	
	@Override
	public List<tdl> findAllTDL(){
		return tdlMapper.selectAll();
	}
	
	@Override
	public void saveTDL(tdl tdl){
		tdlMapper.insert(tdl);
	}

	@Override
	public tdl findTDLById(Integer id){
		return tdlMapper.selectByPrimaryKey(id);
	}

}
