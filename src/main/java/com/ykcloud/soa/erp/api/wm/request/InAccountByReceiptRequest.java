package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * @Author Hewei
 * @Date 2018/4/18 9:51
 */
public class InAccountByReceiptRequest extends AbstractUserSessionRequest{
    private static final long serialVersionUID = 1L;

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "单据类型不能为空！")
    String typeNumId;
    @NotNull(message="门店编号不能为空")
    String subUnitNumId;

    Long balaFuncId;

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getTypeNumId() {
        return typeNumId;
    }

    public void setTypeNumId(String typeNumId) {
        this.typeNumId = typeNumId;
    }

    public Long getBalaFuncId() {
        return balaFuncId;
    }

    public void setBalaFuncId(Long balaFuncId) {
        this.balaFuncId = balaFuncId;
    }

    public String getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(String subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}