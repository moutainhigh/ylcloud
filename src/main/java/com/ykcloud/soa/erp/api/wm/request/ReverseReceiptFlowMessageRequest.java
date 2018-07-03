package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ReverseReceiptFlowMessageRequest extends AbstractUserSessionRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2790050350370516774L;

	@NotNull(message="验收单号不能为空!")
	private String reservedNo;
	
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;

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
