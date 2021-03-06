package com.ykcloud.soa.erp.api.fi.model;

import java.io.Serializable;
import java.util.Date;


/**
 * @author tz.x
 * @date 2018年5月17日上午10:50:50
 */
public class FiBlDealingsHdr implements Serializable {
	private static final long serialVersionUID = -8435977914882719784L;
	/**
	 * 结算门店
	 */
	private Long balanceSubUnitNumId;
	
	/**
	 * 结算日期
	 */
	private Date balanceDate;
	
	/**
	 * 单据编号
	 */
	private String dealingsNumId;
	
	/**
	 * 供应商
	 */
	private Long unitNumId;
	
	/**
	 * 业务单据编号
	 */
	private String businessNumId;
	
	/**
	 * 业务单据类型
	 */
	private Long businessTypeNumId;
	
	/**
	 * 业务员
	 */
	private String salesman;
	
	/**
	 * 调整原因
	 */
	private String reason;
	
	/**
	 * 0:未审核 1：已审核
	 */
	private Long statusNumId;
	
	/**
	 * 0: 手工输入 1： 自动计算
	 */
	private Long soFromType;
	/**
	 * 业务类型
	 */
	private Long typeNumId;
	/**
	 * 首次供应商ID
	 */
	private Long firstSupplyUnitNumId;

	public Long getBalanceSubUnitNumId() {
		return balanceSubUnitNumId;
	}

	public void setBalanceSubUnitNumId(Long balanceSubUnitNumId) {
		this.balanceSubUnitNumId = balanceSubUnitNumId;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getDealingsNumId() {
		return dealingsNumId;
	}

	public void setDealingsNumId(String dealingsNumId) {
		this.dealingsNumId = dealingsNumId;
	}

	public Long getUnitNumId() {
		return unitNumId;
	}

	public void setUnitNumId(Long unitNumId) {
		this.unitNumId = unitNumId;
	}

	public String getBusinessNumId() {
		return businessNumId;
	}

	public void setBusinessNumId(String businessNumId) {
		this.businessNumId = businessNumId;
	}

	public Long getBusinessTypeNumId() {
		return businessTypeNumId;
	}

	public void setBusinessTypeNumId(Long businessTypeNumId) {
		this.businessTypeNumId = businessTypeNumId;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getSoFromType() {
		return soFromType;
	}

	public void setSoFromType(Long soFromType) {
		this.soFromType = soFromType;
	}

	/**
	 * 获取 typeNumId
	 *
	 * @author Sealin
	 */
	public Long getTypeNumId() {
		return typeNumId;
	}

	/**
	 * 设置 typeNumId
	 *
	 * @author Sealin
	 */
	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	/**
	 * 获取 firstSupplyUnitNumId
	 *
	 * @author Sealin
	 */
	public Long getFirstSupplyUnitNumId() {
		return firstSupplyUnitNumId;
	}

	/**
	 * 设置 firstSupplyUnitNumId
	 *
	 * @author Sealin
	 */
	public void setFirstSupplyUnitNumId(Long firstSupplyUnitNumId) {
		this.firstSupplyUnitNumId = firstSupplyUnitNumId;
	}
}
