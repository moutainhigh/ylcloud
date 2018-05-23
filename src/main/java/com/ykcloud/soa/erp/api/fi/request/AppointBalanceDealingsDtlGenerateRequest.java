package com.ykcloud.soa.erp.api.fi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.fi.model.AppointBalanceCut;
import com.ykcloud.soa.erp.api.fi.model.AppointBalanceDealings;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @Description:选择指定往来项明细项目生成结算明细
 * @author Song
 * @Date 2018年4月4日 下午5:21:30
 */
public class AppointBalanceDealingsDtlGenerateRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 8338043862824578275L;
	private List<AppointBalanceDealings> appointBalanceDealings;
	@NotNull(message = "门店不能为空！")
	private Long subUnitNumId;
	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;

	public List<AppointBalanceDealings> getAppointBalanceDealings() {
		return appointBalanceDealings;
	}

	public void setAppointBalanceDealings(List<AppointBalanceDealings> appointBalanceDealings) {
		this.appointBalanceDealings = appointBalanceDealings;
	}

	public String getBalanceNo() {
		return balanceNo;
	}
	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}
}
