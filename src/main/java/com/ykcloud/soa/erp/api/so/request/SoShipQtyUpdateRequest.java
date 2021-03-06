package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoShipQtyUpdateRequest extends AbstractRequest {

	private static final long serialVersionUID = -3234831422720382329L;

	private String soLineId;

	private Double qty;

	private Long subUnitNumId;

	public String getSoLineId() {
		return soLineId;
	}

	public void setSoLineId(String soLineId) {
		this.soLineId = soLineId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
