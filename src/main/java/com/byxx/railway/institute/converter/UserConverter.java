package com.byxx.railway.institute.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byxx.railway.institute.pojo.entity.SysUser;
import com.byxx.railway.institute.pojo.form.UserForm;
import com.byxx.railway.institute.pojo.po.UserFormPO;
import com.byxx.railway.institute.pojo.po.UserPO;
import com.byxx.railway.institute.pojo.vo.user.UserLoginVO;
import com.byxx.railway.institute.pojo.vo.user.UserVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 用户对象转换器
 *
 * @author sangww
 * @date 2022/6/8
 */
@Mapper(componentModel = "spring")
public interface UserConverter {

    @Mappings({
            @Mapping(target = "genderLabel", expression = "java(com.byxx.railway.institute.common.base.IBaseEnum.getLabelByValue(po.getGender(),com.byxx.railway.institute.common.enums.GenderEnum.class))")
    })
    UserVO po2Vo(UserPO po);

    Page<UserVO> po2Vo(Page<UserPO> po);

    UserForm po2Form(UserFormPO po);

    UserForm entity2Form(SysUser entity);

    @InheritInverseConfiguration(name = "entity2Form")
    SysUser form2Entity(UserForm entity);

    @Mappings({
            @Mapping(target = "userId", source = "id")
    })
    UserLoginVO entity2LoginUser(SysUser entity);


}
