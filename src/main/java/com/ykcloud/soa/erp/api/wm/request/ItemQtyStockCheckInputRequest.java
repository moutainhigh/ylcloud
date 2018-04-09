package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import javax.validation.constraints.NotNull;

/**
 * @Description: 输入商品数量盘点的入参
 * @author: henry.wang
 * @date: 2018/4/7 15:44
 **/
public class ItemQtyStockCheckInputRequest extends StockCheckRequest {

    private static final long serialVersionUID = 1L;

    @ApiField(description = "商品数量")
    @NotNull(message = "商品数量不能为空！")
    private Double inQty;

    public Double getInQty() {
        return inQty;
    }

    public void setInQty(Double inQty) {
        this.inQty = inQty;
    }
}
