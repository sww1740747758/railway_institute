package com.byxx.railway.institute.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.byxx.railway.institute.common.model.Option;
import com.byxx.railway.institute.pojo.entity.SysMenu;
import com.byxx.railway.institute.pojo.query.MenuQuery;
import com.byxx.railway.institute.pojo.vo.menu.MenuVO;
import com.byxx.railway.institute.pojo.vo.menu.ResourceVO;
import com.byxx.railway.institute.pojo.vo.menu.RouteVO;

import java.util.List;
import java.util.Set;

/**
 * 菜单业务接口
 * 
 * @author sangww
 */
public interface SysMenuService extends IService<SysMenu> {

    /**
     * 获取菜单表格列表
     *
     * @return
     */
    List<MenuVO> listMenus(MenuQuery queryParams);


    /**
     * 获取菜单下拉列表
     *
     * @return
     */
    List<Option> listMenuOptions();

    /**
     * 新增菜单
     *
     * @param menu
     * @return
     */
    boolean saveMenu(SysMenu menu);

    /**
     * 清理路由缓存
     */
    void cleanCache();

    /**
     * 获取路由列表
     *
     * @return
     */
    List<RouteVO> listRoutes();

    /**
     * 资源(菜单+权限)树形列表
     *
     * @return
     */
    List<ResourceVO> listResources();

    /**
     * 修改菜单显示状态
     * 
     * @param menuId 菜单ID
     * @param visible 是否显示(1->显示；2->隐藏)
     * @return
     */
    boolean updateMenuVisible(Long menuId, Integer visible);

    /**
     * 获取角色权限集合
     *
     * @param roles
     * @return
     */
    Set<String> listRolePerms(Set<String> roles);
}
