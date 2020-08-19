package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TProductManagement;

/**
 * 产品管理Service接口
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
public interface ITProductManagementService 
{
    /**
     * 查询产品管理
     * 
     * @param productId 产品管理ID
     * @return 产品管理
     */
    public TProductManagement selectTProductManagementById(String productId);

    /**
     * 查询产品管理列表
     * 
     * @param tProductManagement 产品管理
     * @return 产品管理集合
     */
    public List<TProductManagement> selectTProductManagementList(TProductManagement tProductManagement);

    /**
     * 新增产品管理
     * 
     * @param tProductManagement 产品管理
     * @return 结果
     */
    public int insertTProductManagement(TProductManagement tProductManagement);

    /**
     * 修改产品管理
     * 
     * @param tProductManagement 产品管理
     * @return 结果
     */
    public int updateTProductManagement(TProductManagement tProductManagement);

    /**
     * 批量删除产品管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTProductManagementByIds(String ids);

    /**
     * 删除产品管理信息
     * 
     * @param productId 产品管理ID
     * @return 结果
     */
    public int deleteTProductManagementById(String productId);
}
