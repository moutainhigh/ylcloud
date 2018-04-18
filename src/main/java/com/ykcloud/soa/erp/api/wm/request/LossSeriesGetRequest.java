package com.ykcloud.soa.erp.api.wm.request;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;

public class LossSeriesGetRequest extends AbstractRequest {

	private static final long serialVersionUID = -7777920135123732638L;

	 private  String batchSeries;
	    private  Long itemUumId;
	    private String reservedNo;
	  
	    public String getBatchSeries() {
			return batchSeries;
		}

		public void setBatchSeries(String batchSeries) {
			this.batchSeries = batchSeries;
		}

		public Long getItemUumId() {
	        return itemUumId;
	    }

	    public void setItemUumId(Long itemUumId) {
	        this.itemUumId = itemUumId;
	    }

		public String getReservedNo() {
			return reservedNo;
		}

		public void setReservedNo(String reservedNo) {
			this.reservedNo = reservedNo;
		}
	

}
