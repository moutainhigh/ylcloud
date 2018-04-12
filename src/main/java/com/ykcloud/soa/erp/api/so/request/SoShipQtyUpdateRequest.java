package com.ykcloud.soa.erp.api.so.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class SoShipQtyUpdateRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3234831422720382329L;
	
	private Long soLineId;
	
	private Double qty;
	
	private String subUnitNumId;

	public Long getSoLineId() {
		return soLineId;
	}

	public void setSoLineId(Long soLineId) {
		this.soLineId = soLineId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public String getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(String subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}


	
	

}
