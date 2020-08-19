package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品管理对象 t_product_management
 * 
 * @author ruoyi
 * @date 2020-08-19
 */
public class TProductManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品编码 */
    private String productId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 险种 */
    @Excel(name = "险种")
    private String insurance;

    /** 险别 */
    @Excel(name = "险别")
    private String type;

    /** 状态 */
    @Excel(name = "状态")
    private String state;

    /** 评级 */
    @Excel(name = "评级")
    private String grade;

    public void setProductId(String productId) 
    {
        this.productId = productId;
    }

    public String getProductId() 
    {
        return productId;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setInsurance(String insurance) 
    {
        this.insurance = insurance;
    }

    public String getInsurance() 
    {
        return insurance;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setGrade(String grade) 
    {
        this.grade = grade;
    }

    public String getGrade() 
    {
        return grade;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("productId", getProductId())
            .append("productName", getProductName())
            .append("insurance", getInsurance())
            .append("type", getType())
            .append("state", getState())
            .append("grade", getGrade())
            .toString();
    }
}
