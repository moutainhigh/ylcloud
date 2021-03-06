package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

import javax.validation.constraints.NotNull;

public class ConsignmentCollectBalanceGainAppointRequest extends AbstractRequest {
    private static final long serialVersionUID = -3101956261800131597L;

    @NotNull(message = "发生门店不能为空！")
    private Long balanceSubUnitNumId;
    @NotNull(message = "税率不能为空！")
    private Double taxRate;
    @NotNull(message = "供应商不能为空！")
    private Long supplyUnitNumId;
    @NotNull(message = "结算方式不能为空！")
    private Long settlementType;
    @NotNull(message = "单据编号不能为空！")
    private String reservedNo;

    private String statusNumName;

    private Long reservedTypeNumId;

    private String balanceFlag;

    public String getStatusNumName() {
        return statusNumName;
    }

    public void setStatusNumName(String statusNumName) {
        this.statusNumName = statusNumName;
    }

    public Long getBalanceSubUnitNumId() {
        return balanceSubUnitNumId;
    }

    public void setBalanceSubUnitNumId(Long balanceSubUnitNumId) {
        this.balanceSubUnitNumId = balanceSubUnitNumId;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Long getSupplyUnitNumId() {
        return supplyUnitNumId;
    }

    public void setSupplyUnitNumId(Long supplyUnitNumId) {
        this.supplyUnitNumId = supplyUnitNumId;
    }

    public Long getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(Long settlementType) {
        this.settlementType = settlementType;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public Long getReservedTypeNumId() {
        return reservedTypeNumId;
    }

    public void setReservedTypeNumId(Long reservedTypeNumId) {
        this.reservedTypeNumId = reservedTypeNumId;
    }

    public String getBalanceFlag() {
        return balanceFlag;
    }

    public void setBalanceFlag(String balanceFlag) {
        this.balanceFlag = balanceFlag;
    }
}
