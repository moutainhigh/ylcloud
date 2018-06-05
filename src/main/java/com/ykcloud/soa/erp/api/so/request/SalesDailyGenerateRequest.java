package com.ykcloud.soa.erp.api.so.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author:shenq
 * @description:销售出库日报汇总Request
 * @date :2018/4/23 - 10:08
 * @version:v1.0
 */
public class SalesDailyGenerateRequest extends AbstractUserSessionRequest {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8011001474311318170L;

	/**
     * 销售门店编号
     */
    @NotNull(message = "门店编号不能为空")
    public Long subUnitNumId;

    /**
     * 销售日期
     */
    @NotNull(message = "销售日期不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date orderDate;


    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
