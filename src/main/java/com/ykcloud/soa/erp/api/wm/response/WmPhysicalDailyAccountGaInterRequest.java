package com.ykcloud.soa.erp.api.wm.response;

import javax.validation.constraints.NotNull;

public class WmPhysicalDailyAccountGaInterRequest {

    @NotNull(message = "订单编号不能为空！")
    Long reservedNo;
    @NotNull(message = "业务类型编号不能为空！")
    String billTypeNum;
    @NotNull(message = "单据类型不能为空！")
    Long typeNum;
    @NotNull(message = "入账类型不能为空！")
    String accountName;

    public Long getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(Long reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getBillTypeNum() {
        return billTypeNum;
    }

    public void setBillTypeNum(String billTypeNum) {
        this.billTypeNum = billTypeNum;
    }

    public Long getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(Long typeNum) {
        this.typeNum = typeNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
