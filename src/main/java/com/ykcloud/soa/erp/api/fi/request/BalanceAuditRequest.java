package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

/**
 * @Description:付款审核 结算单审核
 * @author Song
 * @Date 2018年4月4日 下午5:21:38
 */
public class BalanceAuditRequest extends AbstractRequest {

	private static final long serialVersionUID = -1766553622327456524L;

	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	
	@NotNull(message = "操作人ID不能为空！")
	private Long createUserId;

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}


	
	
}
