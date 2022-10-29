package com.byxx.railway.institute.converter;

import com.byxx.railway.institute.pojo.entity.SysMenu;
import com.byxx.railway.institute.pojo.vo.menu.MenuVO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 菜单对象转换器
 *
 * @author sangww
 * @date 2022/7/29
 */
@Mapper(componentModel = "spring")
public interface MenuConverter {

    MenuVO entity2VO(SysMenu entity);


}