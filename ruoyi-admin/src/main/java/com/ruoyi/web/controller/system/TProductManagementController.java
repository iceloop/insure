package com.ruoyi.web.controller.system;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TProductManagement;
import com.ruoyi.system.service.ITProductManagementService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 产品管理Controller
 *
 * @author ruoyi
 * @date 2020-08-19
 */
@Controller
@RequestMapping("/system/management")
public class TProductManagementController extends BaseController {
    private String prefix = "system/management";

    @Autowired
    private ITProductManagementService tProductManagementService;

    @RequiresPermissions("system:management:view")
    @GetMapping()
    public String management() {
        return prefix + "/management";
    }

    /**
     * 查询产品管理列表
     */
    @RequiresPermissions("system:management:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TProductManagement tProductManagement) {
        startPage();
        List<TProductManagement> list = tProductManagementService.selectTProductManagementList(tProductManagement);
        return getDataTable(list);
    }

    /**
     * 导出产品管理列表
     */
    @RequiresPermissions("system:management:export")
    @Log(title = "产品管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TProductManagement tProductManagement) {
        List<TProductManagement> list = tProductManagementService.selectTProductManagementList(tProductManagement);
        ExcelUtil<TProductManagement> util = new ExcelUtil<TProductManagement>(TProductManagement.class);
        return util.exportExcel(list, "management");
    }

    /**
     * 新增产品管理
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 产品上传
     */
    @RequiresPermissions("system:management:upload")
    @GetMapping("/upload")
    public String upload() {
        return prefix + "/Productupload";
    }

    /**
     * 新增保存产品管理
     */
    @RequiresPermissions("system:management:add")
    @Log(title = "产品管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TProductManagement tProductManagement) {
        return toAjax(tProductManagementService.insertTProductManagement(tProductManagement));
    }

    /**
     * 修改产品管理
     */
    @GetMapping("/edit/{productId}")
    public String edit(@PathVariable("productId") String productId, ModelMap mmap) {
        TProductManagement tProductManagement = tProductManagementService.selectTProductManagementById(productId);
        mmap.put("tProductManagement", tProductManagement);
        return prefix + "/edit";
    }

    /**
     * 修改保存产品管理
     */
    @RequiresPermissions("system:management:edit")
    @Log(title = "产品管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TProductManagement tProductManagement) {
        return toAjax(tProductManagementService.updateTProductManagement(tProductManagement));
    }

    /**
     * 删除产品管理
     */
    @RequiresPermissions("system:management:remove")
    @Log(title = "产品管理", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tProductManagementService.deleteTProductManagementByIds(ids));
    }
}
