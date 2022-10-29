package com.byxx.railway.institute.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byxx.railway.institute.pojo.entity.SysDictType;
import com.byxx.railway.institute.pojo.form.DictTypeForm;
import com.byxx.railway.institute.pojo.vo.dict.DictTypePageVO;
import org.mapstruct.Mapper;

/**
 * 字典类型对象转换器
 *
 * @author sangww
 * @date 2022/6/8
 */
@Mapper(componentModel = "spring")
public interface DictTypeConverter {

    Page<DictTypePageVO> entity2Page(Page<SysDictType> page);

    DictTypeForm entity2Form(SysDictType entity);

    SysDictType form2Entity(DictTypeForm entity);
}
