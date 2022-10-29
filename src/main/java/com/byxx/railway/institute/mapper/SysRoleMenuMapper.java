package com.byxx.railway.institute.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.byxx.railway.institute.pojo.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色菜单持久层
 *
 * @author sangww
 * @date 2022/6/4
 */
@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {

    /**
     * 获取角色拥有的菜单ID集合
     *
     * @param roleId
     * @return
     */
    List<Long> listMenuIdsByRoleId(Long roleId);
}
