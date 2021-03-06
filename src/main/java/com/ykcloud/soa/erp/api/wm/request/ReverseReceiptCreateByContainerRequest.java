package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

public class ReverseReceiptCreateByContainerRequest extends AbstractUserSessionRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9040984868153799037L;

	@NotNull(message="门店编号不能为空！")
	private Long subUnitNumId;
	
	@NotNull(message="托盘实物标志不能为空！")
	private String containerLabserlno;
	
	private String containerSerlno;
	
	private Long containerFlag;
	
	@NotNull(message = "物理仓ID不能为空! ")
	private Long physicalNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public String getContainerLabserlno() {
		return containerLabserlno;
	}

	public void setContainerLabserlno(String containerLabserlno) {
		this.containerLabserlno = containerLabserlno;
	}

	public String getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(String containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public Long getContainerFlag() {
		return containerFlag;
	}

	public void setContainerFlag(Long containerFlag) {
		this.containerFlag = containerFlag;
	}

	public Long getPhysicalNumId() {
		return physicalNumId;
	}

	public void setPhysicalNumId(Long physicalNumId) {
		this.physicalNumId = physicalNumId;
	}
	
	
}
