package com.byxx.railway.institute.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.byxx.railway.institute.pojo.entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 保存用户角色
     *
     * @param userId
     * @param roleIds
     * @return
     */
     boolean saveUserRoles(Long userId, List<Long> roleIds);
}
