package com.byxx.railway.institute.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.byxx.railway.institute.mapper.SysRoleMenuMapper;
import com.byxx.railway.institute.pojo.entity.SysRoleMenu;
import com.byxx.railway.institute.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService {

    /**
     * 获取角色拥有的菜单ID集合
     *
     * @param roleId
     * @return
     */
    @Override
    public List<Long> listMenuIdsByRoleId(Long roleId) {
        List<Long> menuIds = this.baseMapper.listMenuIdsByRoleId(roleId);
        return menuIds;
    }

}
