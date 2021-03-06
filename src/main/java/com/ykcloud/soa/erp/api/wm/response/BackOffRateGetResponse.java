package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

/**
 * @Description: 折扣率
 * @Author: ALi
 * @Date: 2018/4/18 15:34
 */
public class BackOffRateGetResponse extends MessagePack {
    private static final long serialVersionUID = 1L;
    private Double price;//单价
    private Double amount;//金额
    private Double backoffRate;
    

   

	public Double getBackoffRate() {
		return backoffRate;
	}

	public void setBackoffRate(Double backoffRate) {
		this.backoffRate = backoffRate;
	}

	public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
