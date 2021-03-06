package com.ykcloud.soa.erp.api.sync.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * @Author Hewei
 * @Date 2018/7/10 11:26
 */
public class SupplyContractSyncRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 4095831291030015200L;

    private Integer skipExistSign;

    private Integer checkSign;//为1或者赋值则要强制检查，否则为兼容

    public Integer getSkipExistSign() {
        return skipExistSign;
    }

    public void setSkipExistSign(Integer skipExistSign) {
        this.skipExistSign = skipExistSign;
    }

    public Integer getCheckSign() {
        return checkSign;
    }

    public void setCheckSign(Integer checkSign) {
        this.checkSign = checkSign;
    }
}
