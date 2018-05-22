package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
 * 库存金额调整接口
 * @author tz.x
 * @date 2018年5月22日下午5:27:40
 */
public class WmadjustCostRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1363377019937473048L;
	
	@NotNull(message = "库存金额调整业务类型不能为空！")
	private Long typeNumId;
	
	@NotNull(message = "库存金额调整单号不能为空！")
	private String reservedNo;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	
	public Long getTypeNumId() {
		return typeNumId;
	}

	public void setTypeNumId(Long typeNumId) {
		this.typeNumId = typeNumId;
	}

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}