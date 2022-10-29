package com.byxx.railway.institute.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.byxx.railway.institute.common.model.Option;
import com.byxx.railway.institute.pojo.entity.SysDept;
import com.byxx.railway.institute.pojo.form.DeptForm;
import com.byxx.railway.institute.pojo.query.DeptQuery;
import com.byxx.railway.institute.pojo.vo.dept.DeptVO;

import java.util.List;

/**
 * 部门业务接口
 *
 * @author sangww
 */
public interface SysDeptService extends IService<SysDept> {
    /**
     * 部门列表
     *
     * @return
     */
    List<DeptVO> listDepartments(DeptQuery queryParams);

    /**
     * 部门树形下拉选项
     *
     * @return
     */
    List<Option> listDeptOptions();

    /**
     * 新增部门
     *
     * @param formData
     * @return
     */
    Long saveDept(DeptForm formData);

    /**
     * 修改部门
     *
     * @param deptId
     * @param formData
     * @return
     */
    Long updateDept(Long deptId, DeptForm formData);

    /**
     * 删除部门
     *
     * @param ids 部门ID，多个以英文逗号,拼接字符串
     * @return
     */
    boolean deleteByIds(String ids);

    /**
     * 获取部门详情
     *
     * @param deptId
     * @return
     */
    DeptForm getDeptForm(Long deptId);
}
