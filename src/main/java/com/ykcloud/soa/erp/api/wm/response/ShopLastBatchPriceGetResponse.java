package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

//取门店最新批次库存价格，用于配送补货出参类
public class ShopLastBatchPriceGetResponse extends MessagePack {
	private static final long serialVersionUID = 1L;

	private Double price; // 最新库存价格
	
	private Double taxRate; //税率

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}
    
}
