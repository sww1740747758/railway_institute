package com.byxx.railway.institute.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色表
 * @TableName sys_role
 */
@TableName(value ="SYS_ROLE")
@KeySequence(value = "SEQ_TEST", dbType = DbType.ORACLE)
@Data
public class SysRole implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.INPUT)
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 显示顺序
     */
    private Integer sort;

    /**
     * 角色状态(1-正常；0-停用)
     */
    private Integer status;

    /**
     * 逻辑删除标识(0-未删除；1-已删除)
     */
    private Integer deleted;

    /**
     * 更新时间
     */
    private Date createTime;

    /**
     * 创建时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}