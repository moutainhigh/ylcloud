package com.ykcloud.soa.erp.api.fi.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;

import java.util.Date;

/**
 * @Description:删除结算单商品明细中的指定项目
 * @author Song
 * @Date 2018年4月4日 下午5:18:14
 */
public class AppointForSupBalanceDtlDeleteRequest extends AbstractUserSessionRequest {
	private static final long serialVersionUID = 5418678300240637435L;
	@NotNull(message = "行号不能为空！")
	private String series;
	@NotNull(message = "门店编号不能为空！")
	private Long subUnitNumId;
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	@NotNull(message = "结算日期不能为空！")
	private Date balanceDate;
	@NotNull(message = "结算单号不能为空！")
	private String balanceNo;
	private Long reservedTypeNumId;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getBalanceNo() {
		return balanceNo;
	}

	public void setBalanceNo(String balanceNo) {
		this.balanceNo = balanceNo;
	}

	public Long getReservedTypeNumId() {
		return reservedTypeNumId;
	}

	public void setReservedTypeNumId(Long reservedTypeNumId) {
		this.reservedTypeNumId = reservedTypeNumId;
	}
}
