package com.ykcloud.soa.erp.api.fi.request;


import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:供应商结算生成结算单数据
 * @author Song
 * @Date 2018年4月4日 下午1:47:35
 */
public class SupplyByBalanceDataGetRequest extends AbstractRequest {

	private static final long serialVersionUID = 4627685577873375711L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@NotNull(message = "开始日期不能为空！")
	private String startDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@NotNull(message = "截止日期不能为空！")
	private String endDate;
	
	@NotNull(message = "经营方式不能为空！")
	private Long settlementType;
		
	@NotNull(message = "操作人ID不能为空！")
	private Long userNumId;
	
	@NotNull(message = "操作日期不能为空！")
	private Date creatDate;

	@NotNull(message = "供应商不能为空！")
	private Long supplyUnitNumId;
	
	@NotNull(message = "单据编号不能为空！")
	private Long ReservedNo;

	@NotNull(message = "结算单号不能为空！")
	private Long balanceNo;
	
	@NotNull(message = "行号不能为空！")
	private Long series;

	public Date getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}

	public Long getSeries() {
		return series;
	}

	public void setSeries(Long series) {
		this.series = series;
	}

	public Long getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(Long balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getReservedNo() {
		return ReservedNo;
	}

	public void setReservedNo(Long reservedNo) {
		ReservedNo = reservedNo;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}
	
	public Long getUserNumId() {
		return userNumId;
	}

	public void setUserNumId(Long userNumId) {
		this.userNumId = userNumId;
	}

}
