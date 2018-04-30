package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.annotation.ApiField;
import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.ykcloud.soa.erp.api.scm.model.InTransitWriteoffBeforeDeposit;

public class InTransitDepositRequest extends AbstractRequest {
	private static final long serialVersionUID = 5118059696054727934L;

	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "订单日期不能为空！")
	private Date orderDate;

	@NotNull(message = "单据类型不能为空！")
	@ApiField(description = "1:补货申请单 2:订货审批单 3:配送审批单 4:采购单  5:验收单  6:执行订单so")
	private Long billType;

	// @NotNull(message = "单据类型不能为空！")
	// @ApiField(description = "100:补货申请单 200:采购单
	// 3XX:执行订单so(301：直通分拨到店（总仓），302：直通分拨到仓，303：配送到店，304：配送分拨到仓，305：配送分拨到店，309：直送退供应商，310：直通退供应商
	// 311：配送退总仓，315：直通分拨到店（分仓）")
	// private Long billType;

	@NotNull(message = "单据编号不能为空！")
	private String reservedNo;

	@NotNull(message = "在途类别不能为空！")
	@ApiField(description = "10:在途补货数 20:在途订货数 30:在途配送数 41:仓库配送数(直通)  42:仓库配送数(配送) 51: 分仓在途数（直通) 52: 分仓在途数(配送)")
	private Long typeNumId;

	@NotNull(message = "入账销账标识不能为空！")
	@ApiField(description = "1:入账 2:销账")
	@Range(min = 1L, max = 2L, message = "1:入账 2:销账")
	private Long depositSign;

	private List<InTransitWriteoffBeforeDeposit> writeoffList;

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

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getBillType() {
		return billType;
	}

	public void setBillType(Long billType) {
		this.billType = billType;
	}

	public Long getDepositSign() {
		return depositSign;
	}

	public void setDepositSign(Long depositSign) {
		this.depositSign = depositSign;
	}

	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	/*
	 * public Long getBillType() { return billType; }
	 * 
	 * public void setBillType(Long billType) { this.billType = billType; }
	 */

	public List<InTransitWriteoffBeforeDeposit> getWriteoffList() {
		return writeoffList;
	}

	public void setWriteoffList(List<InTransitWriteoffBeforeDeposit> writeoffList) {
		this.writeoffList = writeoffList;
	}

}
