package com.hqy.demo.mapper;

import com.hqy.demo.bean.tdl;
import java.util.List;

public interface tdlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tdl record);

    tdl selectByPrimaryKey(Integer id);

    List<tdl> selectAll();

    int updateByPrimaryKey(tdl record);
}