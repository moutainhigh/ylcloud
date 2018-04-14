package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.wm.model.ScmAccInvOwnStkTsc;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author Hewei
 * @Date 2018/3/28 11:54
 */
public class WmBillInAccountRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = 1L;
	@NotNull(message = "订单编号不能为空！")
	String reservedNo;

	@NotNull(message = "单据类型不能为空！")
	Long typeNum;

	public List<ScmAccInvOwnStkTsc> scmAccInvOwnStkTscs;

	public String getReservedNo() {
		return reservedNo;
	}

	public void setReservedNo(String reservedNo) {
		this.reservedNo = reservedNo;
	}

	public Long getTypeNum() {
		return typeNum;
	}

	public void setTypeNum(Long typeNum) {
		this.typeNum = typeNum;
	}

	public List<ScmAccInvOwnStkTsc> getScmAccInvOwnStkTscs() {
		return scmAccInvOwnStkTscs;
	}

	public void setScmAccInvOwnStkTscs(List<ScmAccInvOwnStkTsc> scmAccInvOwnStkTscs) {
		this.scmAccInvOwnStkTscs = scmAccInvOwnStkTscs;
	}
}
