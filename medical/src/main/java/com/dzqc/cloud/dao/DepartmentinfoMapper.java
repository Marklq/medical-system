package com.dzqc.cloud.dao;

import com.dzqc.cloud.entity.Departmentinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface DepartmentinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Departmentinfo record);

    int insertSelective(Departmentinfo record);

    Departmentinfo selectByPrimaryKey(Integer id);

    List<Departmentinfo> selectAll();

    int updateByPrimaryKeySelective(Departmentinfo record);

    int updateByPrimaryKey(Departmentinfo record);

}