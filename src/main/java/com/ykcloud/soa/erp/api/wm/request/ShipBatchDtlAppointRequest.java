package com.ykcloud.soa.erp.api.wm.request;

import java.util.List;

import com.gb.soa.omp.ccommon.api.request.AbstractSessionRequest;

public class ShipBatchDtlAppointRequest extends AbstractSessionRequest{

	private static final long serialVersionUID = -8356014312083384584L;
		private List<String> servies;

	    public List<String> getServies() {
	        return servies;
	    }

	    public void setServies(List<String> servies) {
	        this.servies = servies;
	    }
}
