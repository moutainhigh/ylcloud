package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

/**
*查询验收单请求类
@author hank.zhu
@date 2018年3月12日 下午8:19:28 新建
**/
public class ReceiptHdrFuzzyGetRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message="门店编号不能为空!")
	private Long subUnitNumId;//门店编号
	
	@NotEmpty(message="验收单号不能为空!")
	private String reservedNo;//验收单号后6位
	
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