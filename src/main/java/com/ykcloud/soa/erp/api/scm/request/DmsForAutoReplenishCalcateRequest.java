package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

//计算ndms和pdms日销售量的入参
public class DmsForAutoReplenishCalcateRequest extends AbstractRequest {
	@NotNull(message = "门店编号不能为空")
	private Long subUnitNumId; // 门店编号

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空")
	private Date orderDate; // 订单日期

	@NotNull(message = "商品编号不能为空")
	private Long itemNumId; // 商品编号

	private Double stockQty; // 库存数量

	private Double dmsMax; // DMS最大倍数

	private Double dmsStockBase; // DMS库存基数

	private Double nsf; // 日常平滑系数

	private Double psf; // 促销平滑系数
	
	private Double ndms; //正常日销量
	
	private Double pdms; //促销日销量

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Double getStockQty() {
		return stockQty;
	}

	public void setStockQty(Double stockQty) {
		this.stockQty = stockQty;
	}

	public Double getDmsMax() {
		return dmsMax;
	}

	public void setDmsMax(Double dmsMax) {
		this.dmsMax = dmsMax;
	}

	public Double getDmsStockBase() {
		return dmsStockBase;
	}

	public void setDmsStockBase(Double dmsStockBase) {
		this.dmsStockBase = dmsStockBase;
	}

	public Double getNsf() {
		return nsf;
	}

	public void setNsf(Double nsf) {
		this.nsf = nsf;
	}

	public Double getPsf() {
		return psf;
	}

	public void setPsf(Double psf) {
		this.psf = psf;
	}

	public Double getNdms() {
		return ndms;
	}

	public void setNdms(Double ndms) {
		this.ndms = ndms;
	}

	public Double getPdms() {
		return pdms;
	}

	public void setPdms(Double pdms) {
		this.pdms = pdms;
	}
    
}
