package com.byxx.railway.institute.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.byxx.railway.institute.common.base.BaseEntity;
import com.byxx.railway.institute.common.enums.MenuTypeEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 菜单表实体
 */
@TableName(value ="SYS_MENU")
@KeySequence(value = "SEQ_TEST", dbType = DbType.ORACLE)
@Data
public class SysMenu {
    /**
     * 
     */
    @TableId(type = IdType.INPUT)
    private Long id;

    /**
     * 父菜单ID
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单类型(1-菜单；2-目录；3-外链；4-按钮权限)
     */
    private MenuTypeEnum type;

    /**
     * 路由路径(浏览器地址栏路径)
     */
    private String path;

    /**
     * 组件路径(vue页面完整路径，省略.vue后缀)
     */
    private String component;

    /**
     * 权限标识
     */
    private String perm;

    /**
     * 显示状态(1:显示;0:隐藏)
     */
    private Integer visible;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 外链路径
     */
    private String redirectUrl;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

}