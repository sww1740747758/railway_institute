package com.byxx.railway.institute.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byxx.railway.institute.common.model.Option;
import com.byxx.railway.institute.pojo.entity.SysRole;
import com.byxx.railway.institute.pojo.form.RoleForm;
import com.byxx.railway.institute.pojo.vo.role.RolePageVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * 角色对象转换器
 *
 * @author sangww
 * @date 2022/5/29
 */
@Mapper(componentModel = "spring")
public interface RoleConverter {

    Page<RolePageVO> entity2Page(Page<SysRole> page);

    @Mappings({
            @Mapping(target = "value", source = "id"),
            @Mapping(target = "label", source = "name")
    })
    Option role2Option(SysRole role);


    List<Option> roles2Options(List<SysRole> roles);

    SysRole form2Entity(RoleForm roleForm);
}