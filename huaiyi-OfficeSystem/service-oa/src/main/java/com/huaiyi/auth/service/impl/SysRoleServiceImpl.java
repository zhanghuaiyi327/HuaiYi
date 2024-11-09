package com.huaiyi.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huaiyi.auth.mapper.SysRoleMapper;
import com.huaiyi.auth.service.SysRoleService;
import com.huaiyi.model.system.SysRole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
    /*@Resource
    public SysRoleMapper;*/
}