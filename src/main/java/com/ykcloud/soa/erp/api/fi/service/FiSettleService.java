package com.ykcloud.soa.erp.api.fi.service;

import com.ykcloud.soa.erp.api.fi.request.AppointBalanceDealingsDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDealingsDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceCutDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointBalanceDtlGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDealingsDeductionFlushRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceJointSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BalancePurchaseSaleAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceSellOffAutomaticRequest;
import com.ykcloud.soa.erp.api.fi.request.BillAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceCutDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceCutGetRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceDealingsGetRequest;
import com.ykcloud.soa.erp.api.fi.request.PaymentAuditRequest;
import com.ykcloud.soa.erp.api.fi.request.AppointForSupBalanceDtlDeleteRequest;
import com.ykcloud.soa.erp.api.fi.request.NotBalanceGetRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceDataGenerateRequest;
import com.ykcloud.soa.erp.api.fi.request.BalanceCutDeductionFlushRequest;
import com.ykcloud.soa.erp.api.fi.request.PrePaymentAuditRequest;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceDealingsDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDealingsDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceCutDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointBalanceDtlGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDealingsDeductionFlushResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceJointSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BalancePurchaseSaleAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceSellOffAutomaticResponse;
import com.ykcloud.soa.erp.api.fi.response.BillAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceCutDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceCutGetResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceDealingsGetResponse;
import com.ykcloud.soa.erp.api.fi.response.PaymentAuditResponse;
import com.ykcloud.soa.erp.api.fi.response.AppointForSupBalanceDtlDeleteResponse;
import com.ykcloud.soa.erp.api.fi.response.NotBalanceGetResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceDataGenerateResponse;
import com.ykcloud.soa.erp.api.fi.response.BalanceCutDeductionFlushResponse;
import com.ykcloud.soa.erp.api.fi.response.PrePaymentAuditResponse;

/**
 * @Description:供应商结算相关服务
 * @author Song
 * @Date 2018年4月4日 上午11:31:46
 */
public interface FiSettleService {

	//取结算数据
	public BalanceDataGenerateResponse generateBalanceData(BalanceDataGenerateRequest request);
	
	//刷新扣款项
	public BalanceCutDeductionFlushResponse flushBalanceCutDeduction(BalanceCutDeductionFlushRequest request);
	
	//获取没有结算的数据
	public NotBalanceGetResponse getNotBalance(NotBalanceGetRequest request);
	
	//获取可结算扣款项明细
	public NotBalanceCutGetResponse getNotBalanceCut(NotBalanceCutGetRequest request);
	
	//选择指定明细项目生成结算明细
	public AppointBalanceDtlGenerateResponse generateAppointBalanceDtl(AppointBalanceDtlGenerateRequest request);
	
	//选择指定扣款项明细项目生成结算明细
	public AppointBalanceCutDtlGenerateResponse generateAppointBalanceCutDtl(AppointBalanceCutDtlGenerateRequest request);
	
	//删除结算单商品明细中的指定项目
	public AppointForSupBalanceDtlDeleteResponse deleteAppointForSupBalanceDtl(AppointForSupBalanceDtlDeleteRequest request);
	
	//删除结算单扣款明细中的指定项目
	public AppointForSupBalanceCutDtlDeleteResponse deleteAppointForSupBalanceCutDtl(AppointForSupBalanceCutDtlDeleteRequest request);
	
	//结算单审核
	public BalanceAuditResponse auditBalance(BalanceAuditRequest request);
	
	//到票发票审核
	public BillAuditResponse auditBill(BillAuditRequest request);

	//付款审核
	public PaymentAuditResponse auditPayment(PaymentAuditRequest request);

	//预付款审核
	public PrePaymentAuditResponse auditPrePayment(PrePaymentAuditRequest request);

	//购销
	public BalancePurchaseSaleAutomaticResponse automaticBalancePurchaseSale(BalancePurchaseSaleAutomaticRequest request);
	//代销
	public BalanceSellOffAutomaticResponse automaticBalanceSellOff(BalanceSellOffAutomaticRequest request);
	//联销
	public BalanceJointSaleAutomaticResponse automaticBalanceJointSale(BalanceJointSaleAutomaticRequest request) ;
	//刷新往来
	public BalanceDealingsDeductionFlushResponse flushBalanceDealingsDeduction(BalanceDealingsDeductionFlushRequest request);
	//获取可结算往来项明细
	public NotBalanceDealingsGetResponse getNotBalanceDealings(NotBalanceDealingsGetRequest request);
	//选择指定往来项明细项目生成结算明细
	public AppointBalanceDealingsDtlGenerateResponse generateAppointBalanceDealingsDtl(AppointBalanceDealingsDtlGenerateRequest request);
	//删除结算单往来明细中的指定项目
	public AppointForSupBalanceDealingsDtlDeleteResponse deleteAppointForSupBalanceDealingsDtl(AppointForSupBalanceDealingsDtlDeleteRequest request);


}
