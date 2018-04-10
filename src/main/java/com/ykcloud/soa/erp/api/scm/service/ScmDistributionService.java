
package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.ApprovalDtlsForGenerateDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalHdrForGenerateDistributionSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalReturnStorageAndProductForGenerateReturnSoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.ApprovalStatusNumIdAndSoNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.scm.request.DistributionApprovalOrderByBuyerAuditRequest;
import com.ykcloud.soa.erp.api.scm.request.DistributionProductInfoGetRequest;
import com.ykcloud.soa.erp.api.scm.request.InventoryForDistributionApprovalLockRequest;
import com.ykcloud.soa.erp.api.scm.response.ApprovalDtlsForGenerateDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalHdrForGenerateDistributionSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalReturnStorageAndProductForGenerateReturnSoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.ApprovalStatusNumIdAndSoNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.scm.response.DistributionApprovalOrderByBuyerAuditResponse;
import com.ykcloud.soa.erp.api.scm.response.DistributionProductInfoGetResponse;
import com.ykcloud.soa.erp.api.scm.response.InventoryForDistributionApprovalLockResponse;

public interface ScmDistributionService {
	
	/**
	 * 根据锁库结果获取指定的退货审批单的仓库及商品
	 * @author tz.x
	 * @date 2018年4月10日上午9:27:06
	 * @param 
	 * @return
	 */
	public ApprovalReturnStorageAndProductForGenerateReturnSoGetResponse getApprovalReturnStorageAndProductForGenerateReturnSo(
			ApprovalReturnStorageAndProductForGenerateReturnSoGetRequest request);
	
	/**
	 * 配送生成so后更新配送审批单状态并回填审批单单身so_num_id
	 * @author tz.x
	 * @date 2018年4月8日上午11:05:40
	 * @param 
	 * @return
	 */
	public ApprovalStatusNumIdAndSoNumIdUpdateResponse updateApprovalStatusNumIdAndSoNumId(ApprovalStatusNumIdAndSoNumIdUpdateRequest request);
	
	//已审核配送审批单锁库
	public InventoryForDistributionApprovalLockResponse lockInventoryForDistributionApproval(
			InventoryForDistributionApprovalLockRequest request);

	//为产生配送分拨单，获取So单头纬度信息
	public ApprovalHdrForGenerateDistributionSoGetResponse getApprovalHdrForGenerateDistributionSo(
			ApprovalHdrForGenerateDistributionSoGetRequest request);
	
	//为产生配送分拨单，获取配送单身
	public ApprovalDtlsForGenerateDistributionSoGetResponse getApprovalDtlsForGenerateDistributionSo(
			ApprovalDtlsForGenerateDistributionSoGetRequest request);
    
	/** 
	* @Description: 配送单审核
	* @Author: fred.zhao
	* @Date: 2018/4/7 
	*/ 
    public DistributionApprovalOrderByBuyerAuditResponse auditDistributionApprovalOrderByBuyer(DistributionApprovalOrderByBuyerAuditRequest request);

    
	//获取配送商品属性
	public DistributionProductInfoGetResponse getDistributionProductInfo(DistributionProductInfoGetRequest request);

}




  




