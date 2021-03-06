package com.ykcloud.soa.erp.api.wm.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * @Description: 扫码商品条码返回商品信息的入参
 * @author: henry.wang
 * @date: 2018/4/9 9:43
 **/
public class ItemBarcodeScanRequest extends AbstractRequest {

    private static final long serialVersionUID = 1L;

    @ApiField(description = "门店编号")
    @NotNull(message = "门店编号不能为空！")
    private Long subUnitNumId;

    @ApiField(description = "计划日期")
    @NotNull(message = "计划日期不能为空！")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date inventoryDate;

    @ApiField(description = "盘点计划单号")
    @NotNull(message = "盘点计划单号不能为空！")
    private String reservedNo;

    @ApiField(description = "货架号")
    @NotNull(message = "货架号不能为空！")
    private String trayLabserlno;

    @ApiField(description = "商品条码或编码")
    @NotNull(message = "商品条码或编码不能为空！")
    private String barcodeOrItemNumId;

    public Long getSubUnitNumId() {
        return subUnitNumId;
    }

    public void setSubUnitNumId(Long subUnitNumId) {
        this.subUnitNumId = subUnitNumId;
    }

    public Date getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getTrayLabserlno() {
        return trayLabserlno;
    }

    public void setTrayLabserlno(String trayLabserlno) {
        this.trayLabserlno = trayLabserlno;
    }

    public String getBarcodeOrItemNumId() {
        return barcodeOrItemNumId;
    }

    public void setBarcodeOrItemNumId(String barcodeOrItemNumId) {
        this.barcodeOrItemNumId = barcodeOrItemNumId;
    }
}
