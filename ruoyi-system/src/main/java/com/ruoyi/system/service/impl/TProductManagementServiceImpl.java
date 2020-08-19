package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TProductManagementMapper;
import com.ruoyi.system.domain.TProductManagement;
import com.ruoyi.system.service.ITProductManagementService;
import com.ruoyi.common.core.text.Convert;

/**
 * 产品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
@Service
public class TProductManagementServiceImpl implements ITProductManagementService 
{
    @Autowired
    private TProductManagementMapper tProductManagementMapper;

    /**
     * 查询产品管理
     * 
     * @param productId 产品管理ID
     * @return 产品管理
     */
    @Override
    public TProductManagement selectTProductManagementById(String productId)
    {
        return tProductManagementMapper.selectTProductManagementById(productId);
    }

    /**
     * 查询产品管理列表
     * 
     * @param tProductManagement 产品管理
     * @return 产品管理
     */
    @Override
    public List<TProductManagement> selectTProductManagementList(TProductManagement tProductManagement)
    {
        return tProductManagementMapper.selectTProductManagementList(tProductManagement);
    }

    /**
     * 新增产品管理
     * 
     * @param tProductManagement 产品管理
     * @return 结果
     */
    @Override
    public int insertTProductManagement(TProductManagement tProductManagement)
    {
        return tProductManagementMapper.insertTProductManagement(tProductManagement);
    }

    /**
     * 修改产品管理
     * 
     * @param tProductManagement 产品管理
     * @return 结果
     */
    @Override
    public int updateTProductManagement(TProductManagement tProductManagement)
    {
        return tProductManagementMapper.updateTProductManagement(tProductManagement);
    }

    /**
     * 删除产品管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTProductManagementByIds(String ids)
    {
        return tProductManagementMapper.deleteTProductManagementByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产品管理信息
     * 
     * @param productId 产品管理ID
     * @return 结果
     */
    @Override
    public int deleteTProductManagementById(String productId)
    {
        return tProductManagementMapper.deleteTProductManagementById(productId);
    }
}
