package com.ykcloud.soa.erp.api.scm.request;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gb.soa.omp.ccommon.api.request.AbstractUserSessionRequest;
import com.ykcloud.soa.erp.api.scm.model.ImportApprovalDtl;

/**
 * 订货审批单excel批量导入
 * 
 * @author tz.x
 * @date 2018年5月9日下午2:06:56
 */
public class ApprovalOrderDtlImportRequest extends AbstractUserSessionRequest {

	private static final long serialVersionUID = -5548705379200544570L;

	@NotNull(message = "订货门店编号不能为空！")
	private Long subUnitNumId;

	@NotNull(message = "订单日期不能为空！")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date orderDate;

	@NotNull(message = "审批单号不能为空！")
	private String approvalNumId;
	
	@NotEmpty(message = "导入明细不能为空！")
	private List<ImportApprovalDtl> importApprovalDtls;

	public Long getSubUnitNumId() {
		return subUnitNumId;
	}

	public void setSubUnitNumId(Long subUnitNumId) {
		this.subUnitNumId = subUnitNumId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getApprovalNumId() {
		return approvalNumId;
	}

	public void setApprovalNumId(String approvalNumId) {
		this.approvalNumId = approvalNumId;
	}

	public List<ImportApprovalDtl> getImportApprovalDtls() {
		return importApprovalDtls;
	}

	public void setImportApprovalDtls(List<ImportApprovalDtl> importApprovalDtls) {
		this.importApprovalDtls = importApprovalDtls;
	}

}
