package com.ykcloud.soa.erp.api.wm.response;

import java.util.List;

import com.gb.soa.omp.ccommon.api.response.MessagePack;
import com.ykcloud.soa.erp.api.wm.model.SupBalanceDtl;

public class LossHdrSeriesGetResponse extends MessagePack{

	private static final long serialVersionUID = -2184155684290233671L;

	private List<SupBalanceDtl> wmSellDaily;

	public List<SupBalanceDtl> getWmSellDaily() {
		return wmSellDaily;
	}

	public void setWmSellDaily(List<SupBalanceDtl> wmSellDaily) {
		this.wmSellDaily = wmSellDaily;
	}
}
