package com.ykcloud.soa.erp.api.wm.response;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.gb.soa.omp.ccommon.api.request.AbstractRequest;
import com.gb.soa.omp.ccommon.api.response.MessagePack;

public class WmContainerHdrCreateResponse extends MessagePack {
	//托盘号
	private Long containerSerlno;
	
	//托盘标识
	private String contianerLabserlno;
	

	public Long getContainerSerlno() {
		return containerSerlno;
	}

	public void setContainerSerlno(Long containerSerlno) {
		this.containerSerlno = containerSerlno;
	}

	public String getContianerLabserlno() {
		return contianerLabserlno;
	}

	public void setContianerLabserlno(String contianerLabserlno) {
		this.contianerLabserlno = contianerLabserlno;
	}
	
	
	

}