package com.dzqc.cloud.service.impl;

import com.dzqc.cloud.dao.UserinfoMapper;
import com.dzqc.cloud.entity.Userinfo;
import com.dzqc.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserinfoMapper userinfoMapper;

    public UserServiceImpl(UserinfoMapper userinfoMapper) {
        this.userinfoMapper = userinfoMapper;
    }

    @Override
    public Userinfo selectByPhone(String phone) {
        return userinfoMapper.selectByPhone(phone);
    }
}
