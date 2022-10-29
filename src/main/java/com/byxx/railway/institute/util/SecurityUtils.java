package com.byxx.railway.institute.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.byxx.railway.institute.common.constant.SystemConstants;
import com.byxx.railway.institute.security.userdetails.SysUserDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.PatternMatchUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class SecurityUtils {

    /**
     * 获取当前登录人信息
     *
     * @return
     */
    public static SysUserDetails getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof SysUserDetails) {
                return (SysUserDetails) authentication.getPrincipal();
            }
        }
        return null;
    }

    /**
     * 获取用户角色集合
     *
     * @return
     */
    public static Set<String> getRoles() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Set<String> roles = null;
        if (CollectionUtil.isNotEmpty(authorities)) {
            roles = authorities.stream().filter(item -> item.getAuthority().startsWith("ROLE_"))
                    .map(item -> StrUtil.removePrefix(item.getAuthority(), "ROLE_"))
                    .collect(Collectors.toSet());
        } else {
            roles = Collections.EMPTY_SET;
        }
        return roles;
    }

    /**
     * 获取用户权限集合
     *
     * @return
     */
    public static Set<String> getPerms() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        Set<String> perms = null;
        if (CollectionUtil.isNotEmpty(authorities)) {
            perms = authorities.stream().filter(item -> !item.getAuthority().startsWith("ROLE_"))
                    .map(item -> item.getAuthority())
                    .collect(Collectors.toSet());
        } else {
            perms = Collections.EMPTY_SET;
        }
        return perms;
    }

    /**
     * 是否超级管理员
     * <p>
     * 超级管理员忽视任何权限判断
     *
     * @return
     */
    public static boolean isRoot() {
        Set<String> roles = getRoles();

        if (roles.contains(SystemConstants.ROOT_ROLE_CODE)) {
            return true;
        }
        return false;
    }


    /**
     * 是否拥有权限判断
     * <p>
     * 适用业务判断(接口权限判断适用Spring Security 自带注解 PreAuthorize 判断即可 )
     *
     * @return
     */
    public static boolean hasPerm(String perm) {

        if (isRoot()) {
            return true;
        }

        Set<String> perms = getPerms();

        boolean hasPerm = perms.stream().anyMatch(item -> PatternMatchUtils.simpleMatch(perm, item));
        return hasPerm;
    }

}
