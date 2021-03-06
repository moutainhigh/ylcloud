package com.ykcloud.soa.erp.api.wm.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:单据检查
 * @author Song
 * @Date 2018年4月4日 下午5:19:12
 */
public class BillsForDailyCarryCheckRequest extends AbstractRequest {

	private static final long serialVersionUID = 493084987885757157L;
	
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

}
