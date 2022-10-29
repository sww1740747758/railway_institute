package com.byxx.railway.institute.mapper;

/**
 * 菜单持久接口层
 *
 * @author sangww
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.byxx.railway.institute.pojo.entity.SysMenu;
import com.byxx.railway.institute.pojo.po.RoutePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    List<RoutePO> listRoutes();

    /**
     * 获取角色权限集合
     *
     * @param roles
     * @return
     */
    Set<String> listRolePerms(Set<String> roles);
}
