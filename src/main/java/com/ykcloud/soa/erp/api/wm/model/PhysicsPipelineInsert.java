package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yiako on 2018/4/7
 */
public class PhysicsPipelineInsert implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long tenantNumId;

	private Long subUnitNumId;// 门店

	private Long itemNumId;// 商品编号

	private Long divNumId;// 商品中心（部门）

	private String barcode;// 商品条码

	private String itemName;// 商品品名

	private Long productOriginNumId;// 产地

	private Double conversionQty;// 件装数

	private Long conversionUnitNumId;// 件装单位

	private Long conversionStyleDesc;// 件装规格

	private Long pmtMaterial;// 赠品辅料

	private Long supplyUnitNumId;// 供应商

	private Long physicalNumId;// 收货物理仓库

	private Long classifyNumId;// 商品归集码

	private Date orderDate;// 单据日期,定货日期

	private Long typeNumId;// 业务类型

	private Long billTypeNumId;// 单据类型

	private String triggerBillid;// 单据编号

	private String triggerBillLine;// 单据行号

	private String assistLine;// 辅助行号

	private Long locNumId;// 库位

	private Double packageQty;// 件数

	private Long balanceFunction;// 业务类型

	private Double reservedQty;// 入账数量

	private Date recDate;// 入库日期

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

	public Long getItemNumId() {
		return itemNumId;
	}

	public void setItemNumId(Long itemNumId) {
		this.itemNumId = itemNumId;
	}

	public Long getDivNumId() {
		return divNumId;
	}

	public void setDivNumId(Long divNumId) {
		this.divNumId = divNumId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getProductOriginNumId() {
		return productOriginNumId;
	}

	public void setProductOriginNumId(Long productOriginNumId) {
		this.productOriginNumId = productOriginNumId;
	}

	public Double getConversionQty() {
		return conversionQty;
	}

	public void setConversionQty(Double conversionQty) {
		this.conversionQty = conversionQty;
	}

	public Long getConversionUnitNumId() {
		return conversionUnitNumId;
	}

	public void setConversionUnitNumId(Long conversionUnitNumId) {
		this.conversionUnitNumId = conversionUnitNumId;
	}

	public Long getConversionStyleDesc() {
		return conversionStyleDesc;
	}

	public void setConversionStyleDesc(Long conversionStyleDesc) {
		this.conversionStyleDesc = conversionStyleDesc;
	}

	public Long getPmtMaterial() {
		return pmtMaterial;
	}

	public void setPmtMaterial(Long pmtMaterial) {
		this.pmtMaterial = pmtMaterial;
	}

	public Long getSupplyUnitNumId() {
		return supplyUnitNumId;
	}

	public void setSupplyUnitNumId(Long supplyUnitNumId) {
		this.supplyUnitNumId = supplyUnitNumId;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}

	public Long getClassifyNumId() {
		return classifyNumId;
	}

	public void setClassifyNumId(Long classifyNumId) {
		this.classifyNumId = classifyNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public Long getBillTypeNumId() {
		return billTypeNumId;
	}

	public void setBillTypeNumId(Long billTypeNumId) {
		this.billTypeNumId = billTypeNumId;
	}

	public String getTriggerBillid() {
		return triggerBillid;
	}

	public void setTriggerBillid(String triggerBillid) {
		this.triggerBillid = triggerBillid;
	}

	public String getTriggerBillLine() {
		return triggerBillLine;
	}

	public void setTriggerBillLine(String triggerBillLine) {
		this.triggerBillLine = triggerBillLine;
	}

	public String getAssistLine() {
		return assistLine;
	}

	public void setAssistLine(String assistLine) {
		this.assistLine = assistLine;
	}

	public Long getLocNumId() {
		return locNumId;
	}

	public void setLocNumId(Long locNumId) {
		this.locNumId = locNumId;
	}

	public Double getPackageQty() {
		return packageQty;
	}

	public void setPackageQty(Double packageQty) {
		this.packageQty = packageQty;
	}

	public Long getBalanceFunction() {
		return balanceFunction;
	}

	public void setBalanceFunction(Long balanceFunction) {
		this.balanceFunction = balanceFunction;
	}

	public Double getReservedQty() {
		return reservedQty;
	}

	public void setReservedQty(Double reservedQty) {
		this.reservedQty = reservedQty;
	}

	public Date getRecDate() {
		return recDate;
	}

	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}

}
