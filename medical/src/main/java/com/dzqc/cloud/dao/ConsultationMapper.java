package com.dzqc.cloud.dao;

import com.dzqc.cloud.entity.Consultation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consultation record);

    int insertSelective(Consultation record);

    Consultation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consultation record);

    int updateByPrimaryKey(Consultation record);

    List<Consultation> selectByAll();
}