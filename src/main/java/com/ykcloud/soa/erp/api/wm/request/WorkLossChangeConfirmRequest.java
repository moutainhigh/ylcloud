package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import javax.validation.constraints.NotNull;

/**
 * fakir
 * 2018/4/18
 */
public class WorkLossChangeConfirmRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "加工单号不能为空")
    private String workNumId;
    @NotNull(message = "门店编号不能为空")
    private Long subUnitNumId;
    public String getWorkNumId() {
        return workNumId;
    }

    public void setWorkNumId(String workNumId) {
        this.workNumId = workNumId;
    }

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }
}
