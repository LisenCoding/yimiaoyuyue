package com.rabbiter.hospital.service;

import com.rabbiter.hospital.pojo.Admin;

public interface AdminService {
    /**
     * 登录数据校验
     * */
    Admin login(int aId, String aPassword);
}
