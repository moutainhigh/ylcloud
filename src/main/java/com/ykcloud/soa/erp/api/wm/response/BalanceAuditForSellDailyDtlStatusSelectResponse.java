package com.ykcloud.soa.erp.api.wm.response;

import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class BalanceAuditForSellDailyDtlStatusSelectResponse extends MessagePack {

	private static final long serialVersionUID = 787405151319294144L;

	private  Integer  sum;//修改行数

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
