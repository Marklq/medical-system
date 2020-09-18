package com.dzqc.cloud.service.impl;

import com.dzqc.cloud.dao.DepartmentinfoMapper;
import com.dzqc.cloud.entity.Departmentinfo;
import com.dzqc.cloud.service.DepartmentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentinfoServiceImpl implements DepartmentinfoService {

    private final DepartmentinfoMapper departmentinfoMapper;

    public DepartmentinfoServiceImpl(DepartmentinfoMapper departmentinfoMapper) {
        this.departmentinfoMapper = departmentinfoMapper;
    }


    @Override
    public List<Departmentinfo> selectAll() {
        return departmentinfoMapper.selectAll();
    }
}
