package com.byxx.railway.institute.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.byxx.railway.institute.pojo.entity.SysUser;
import com.byxx.railway.institute.pojo.po.UserAuthInfo;
import com.byxx.railway.institute.pojo.po.UserFormPO;
import com.byxx.railway.institute.pojo.po.UserPO;
import com.byxx.railway.institute.pojo.query.UserPageQuery;
import com.byxx.railway.institute.pojo.vo.user.UserExportVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户持久层
 *
 * @author sangww
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 获取用户分页列表
     *
     * @param page
     * @param queryParams 查询参数
     * @return
     */
    Page<UserPO> listUserPages(Page<UserPO> page, UserPageQuery queryParams);

    /**
     * 获取用户表单详情
     *
     * @param userId 用户ID
     * @return
     */
    UserFormPO getUserDetail(Long userId);

    /**
     * 根据用户名获取认证信息
     *
     * @param username
     * @return
     */
    UserAuthInfo getUserAuthInfo(String username);

    /**
     * 获取导出用户列表
     *
     * @param queryParams
     * @return
     */
    List<UserExportVO> listExportUsers(UserPageQuery queryParams);
}
