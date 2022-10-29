package com.byxx.railway.institute.converter;

import com.byxx.railway.institute.pojo.entity.SysDept;
import com.byxx.railway.institute.pojo.form.DeptForm;
import com.byxx.railway.institute.pojo.vo.dept.DeptVO;
import org.mapstruct.Mapper;

/**
 * 部门对象转换器
 *
 * @author sangww
 * @date 2022/7/29
 */
@Mapper(componentModel = "spring")
public interface DeptConverter {

    DeptForm entity2Form(SysDept entity);
    DeptVO entity2Vo(SysDept entity);

    SysDept form2Entity(DeptForm deptForm);

}