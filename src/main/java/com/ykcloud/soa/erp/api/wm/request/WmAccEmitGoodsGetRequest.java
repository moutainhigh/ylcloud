package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

public class WmAccEmitGoodsGetRequest extends AbstractUserSessionRequest {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "订单编号不能为空！")
    String reservedNo;
    @NotNull(message = "单据类型不能为空！")
    String typeNumId;
    @NotNull(message = "业务类型编号不能为空!")
    private String billTypeNumId;// 业务类型编号

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空!")
    private Long subUnitNumId;

    Long balanceFunctionId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getBillTypeNumId() {
        return billTypeNumId;
    }

    public void setBillTypeNumId(String billTypeNumId) {
        this.billTypeNumId = billTypeNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getBalanceFunctionId() {
        return balanceFunctionId;
    }

    public void setBalanceFunctionId(Long balanceFunctionId) {
        this.balanceFunctionId = balanceFunctionId;
    }
}
