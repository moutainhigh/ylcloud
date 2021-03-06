package com.ykcloud.soa.erp.api.so.model;

import java.io.Serializable;
import java.util.Date;

public class SoHdr implements Serializable {

	private static final long serialVersionUID = 987971073238076434L;

	private String series;

	private String soNumId;

	private String applyNumId;

	private Long tenantNumId;

	private Long subUnitNumId;

	private Date orderDate;

	private Long custUnitNumId;

	private Long custSubUnitNumId;

	private Long statusNumId;

	private Long settlementType;

	private String wlbcNumId;

	private Long divNumId;

	private Long classifyNumId;

	private String tmlNumId;

	private Long soFromType;

	private Long typeNumId;
	
	private Long storeType;

	private Long storageNumId;

	private Long physicalNumId;

	private Long recStorageNumId;

	private Long recPhysicalNumId;

	private Long recAdrNumId;

	private Date deliveryDate;

	private Double depositAmout;

	private String approvalNumId;

	private String remark;

	private Long createUserId;

	private Long lastUpdateUserID;

	private String cancelsign;

	private Long carrySign;

	private Long dataSign;

	private Date createDtme;

	private Date lastUpdtme;

	private Long confirmType;

	private Long sowNumId;
	
	private Long usageType;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getSoNumId() {
		return soNumId;
	}

	public void setSoNumId(String soNumId) {
		this.soNumId = soNumId;
	}

	public String getApplyNumId() {
		return applyNumId;
	}

	public void setApplyNumId(String applyNumId) {
		this.applyNumId = applyNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public Long getTenantNumId() {
		return tenantNumId;
	}

	public void setTenantNumId(Long tenantNumId) {
		this.tenantNumId = tenantNumId;
	}

	

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

	public Long getCustUnitNumId() {
		return custUnitNumId;
	}

	public void setCustUnitNumId(Long custUnitNumId) {
		this.custUnitNumId = custUnitNumId;
	}

	public Long getCustSubUnitNumId() {
		return custSubUnitNumId;
	}

	public void setCustSubUnitNumId(Long custSubUnitNumId) {
		this.custSubUnitNumId = custSubUnitNumId;
	}

	public Long getStatusNumId() {
		return statusNumId;
	}

	public void setStatusNumId(Long statusNumId) {
		this.statusNumId = statusNumId;
	}

	public Long getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(Long settlementType) {
		this.settlementType = settlementType;
	}

	public String getWlbcNumId() {
		return wlbcNumId;
	}

	public void setWlbcNumId(String wlbcNumId) {
		this.wlbcNumId = wlbcNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public Long getClassifyNumId() {
		return classifyNumId;
	}

	public void setClassifyNumId(Long classifyNumId) {
		this.classifyNumId = classifyNumId;
	}

	public String getTmlNumId() {
		return tmlNumId;
	}

	public void setTmlNumId(String tmlNumId) {
		this.tmlNumId = tmlNumId;
	}

	public Long getSoFromType() {
		return soFromType;
	}

	public void setSoFromType(Long soFromType) {
		this.soFromType = soFromType;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getStorageNumId() {
		return storageNumId;
	}

	public void setStorageNumId(Long storageNumId) {
		this.storageNumId = storageNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Long getRecStorageNumId() {
		return recStorageNumId;
	}

	public void setRecStorageNumId(Long recStorageNumId) {
		this.recStorageNumId = recStorageNumId;
	}

	public Long getRecPhysicalNumId() {
		return recPhysicalNumId;
	}

	public void setRecPhysicalNumId(Long recPhysicalNumId) {
		this.recPhysicalNumId = recPhysicalNumId;
	}

	public Long getRecAdrNumId() {
		return recAdrNumId;
	}

	public void setRecAdrNumId(Long recAdrNumId) {
		this.recAdrNumId = recAdrNumId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Double getDepositAmout() {
		return depositAmout;
	}

	public void setDepositAmout(Double depositAmout) {
		this.depositAmout = depositAmout;
	}

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Long getLastUpdateUserID() {
		return lastUpdateUserID;
	}

	public void setLastUpdateUserID(Long lastUpdateUserID) {
		this.lastUpdateUserID = lastUpdateUserID;
	}

	public String getCancelsign() {
		return cancelsign;
	}

	public void setCancelsign(String cancelsign) {
		this.cancelsign = cancelsign;
	}

	public Long getCarrySign() {
		return carrySign;
	}

	public void setCarrySign(Long carrySign) {
		this.carrySign = carrySign;
	}

	public Long getDataSign() {
		return dataSign;
	}

	public void setDataSign(Long dataSign) {
		this.dataSign = dataSign;
	}

	public Date getCreateDtme() {
		return createDtme;
	}

	public void setCreateDtme(Date createDtme) {
		this.createDtme = createDtme;
	}

	public Date getLastUpdtme() {
		return lastUpdtme;
	}

	public void setLastUpdtme(Date lastUpdtme) {
		this.lastUpdtme = lastUpdtme;
	}

	public Long getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(Long confirmType) {
		this.confirmType = confirmType;
	}

	public Long getSowNumId() {
		return sowNumId;
	}

	public void setSowNumId(Long sowNumId) {
		this.sowNumId = sowNumId;
	}

	public Long getStoreType() {
		return storeType;
	}

	public void setStoreType(Long storeType) {
		this.storeType = storeType;
	}

	public Long getUsageType() {
		return usageType;
	}

	public void setUsageType(Long usageType) {
		this.usageType = usageType;
	}
}
