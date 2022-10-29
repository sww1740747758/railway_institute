package com.byxx.railway.institute.pojo.query;

import com.byxx.railway.institute.common.base.BasePageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 权限分页查询对象
 *
 * @author sangww
 */
@Data
@ApiModel
public class PermPageQuery extends BasePageQuery {

    @ApiModelProperty("权限名称")
    private String name;

    @ApiModelProperty("菜单ID")
    private Long menuId;

}
