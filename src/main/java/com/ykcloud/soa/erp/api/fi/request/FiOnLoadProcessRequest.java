package com.ykcloud.soa.erp.api.fi.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/4/10 11:31
 */
public class FiOnLoadProcessRequest extends AbstractUserSessionRequest {
    private static final long serialVersionUID = 5687110045117649099L;

    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;
    @NotNull(message = "物理仓编号不能为空！")
    private Long physicalNumId;
    @NotNull(message = "商品编号编号不能为空！")
    private Long itemNumId;
    @NotNull(message = "验收单号不能为空！")
    private String reservedNo;
    private Long pty1NumId;
    private Long pty2NumId;
    private Long pty3NumId;
    private Long departNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }


    public Long getPty1NumId() {
        return pty1NumId;
    }

    public void setPty1NumId(Long pty1NumId) {
        this.pty1NumId = pty1NumId;
    }

    public Long getPty2NumId() {
        return pty2NumId;
    }

    public void setPty2NumId(Long pty2NumId) {
        this.pty2NumId = pty2NumId;
    }

    public Long getPty3NumId() {
        return pty3NumId;
    }

    public void setPty3NumId(Long pty3NumId) {
        this.pty3NumId = pty3NumId;
    }

    public Long getDepartNumId() {
        return departNumId;
    }

    public void setDepartNumId(Long departNumId) {
        this.departNumId = departNumId;
    }
}


