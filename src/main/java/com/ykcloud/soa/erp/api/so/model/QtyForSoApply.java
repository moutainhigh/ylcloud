package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;

public class QtyForSoApply implements Serializable{
	
	private Double qty;   //数量
	
	private Double packageQty;//件装数
	
	private Double stockQty;//库存数量

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Double packageQty) {
		this.packageQty = packageQty;
	}

	public Double getStockQty() {
		return stockQty;
	}

	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}

}
