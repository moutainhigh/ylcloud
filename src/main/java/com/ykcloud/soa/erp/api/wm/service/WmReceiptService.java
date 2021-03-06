package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.*;


public interface WmReceiptService {
	
	/**
	 * 期初库存导入
	 * @author tz.x
	 * @date 2018年6月7日下午5:17:17
	 */
	public ReceiptForBeginningImportResponse importReceiptForBeginning(ReceiptForBeginningImportRequest request);
	
	/**
	 * 产生分拨单后回写验收单状态为2 供应商已确认
	 * @author tz.x
	 * @date 2018年5月16日上午10:14:01
	 */
	public ReceiptHdrAfterGenerateSoUpdateResponse updateReceiptHdrStatusAfterGenerateSo(ReceiptHdrAfterGenerateSoUpdateRequest request);
	
	/**
	 * 删除超时作废的验收单
	 * @author tz.x
	 * @date 2018年5月12日上午9:27:57
	 */
	public ReceiptForCancelExpirePoDeleteResponse deleteReceiptForCancelExpirePo(ReceiptForCancelExpirePoDeleteRequest request);

	/**
	 * 根据验收单号查询单据状态
	 * @author tz.x
	 * @date 2018年5月11日下午4:54:03
	 */
	public ReceiptHdrForCancelExpirePoGetResponse getReceiptHdrForCancelExpirePo(ReceiptHdrForCancelExpirePoGetRequest request);
	
	// 查询商品最后收货日期
	public ShopProductLastReceiveDateGetResponse getShopProductLastReceiveDate(
			ShopProductLastReceiveDateGetRequest request);

	// 为产生分拨单获取验收单信息
	public ReceiptForGenerateDirectWayDistributionSoGetResponse getReceiptForGenerateDirectWayDistributionSo(
			ReceiptForGenerateDirectWayDistributionSoGetRequest request);

	
	/**
	 * 取指定采购单的供应商确认日期及验收入库汇总单状态
	 * @author tz.x
	 * @date 2018年3月26日下午2:03:24
	 */
	public ReceiptSupConfirmDateAndStatusNumIdByPoNumIdResponse getReceiptSupConfirmDateAndStatusNumIdByPoNumId(
			ReceiptSupConfirmDateAndStatusNumIdByPoNumIdRequest request);

	
	/**
	 * 产生验收单
	 * @author tz.x
	 * @date 2018年3月27日上午11:47:52
	 */
	public ReceiptGenerateResponse generateReceipt(ReceiptGenerateRequest request);


    //查询门店最新批次库存价格，用于配送补货
	public ShopLastBatchPriceGetResponse getShopLastBatchPrice(ShopLastBatchPriceGetRequest request);
	/**
	 *@Description: 查询验收单 (6位模糊查询，直通到仓需判断订单状态是否为发货方已确认)
	 *@Auther hank
	 *@Date 2018-4-9
	 *@param request{subUnitNumId,reservedNo,userNumId}
	 *@return response{reservedNo,traySerlno,traySerlnoLable,trayConfirmQty,receiptQty,receiptConfirmQty}
	 */
	public ReceiptHdrFuzzyGetResponse getReceiptHdrFuzzy(ReceiptHdrFuzzyGetRequest request);


	//过期控制 证照控制
	public ReceiptProduceDateUpdateResponse updateReceiptProduceDate(ReceiptProduceDateUpdateRequest request);
	// 更新收货数量
	public ReceiptDtlUpdateResponse updateReceiptDtl(ReceiptDtlUpdateRequest request);
	
	public ReceiptDtlUpdateResponse updateReceiptDtlWithNoTransaction(ReceiptDtlUpdateRequest request);
	/**
	 * 一键收货
	 * @param request
	 * @return
	 */
	public DirectReceiptUpdateResponse updateDirectReceipt(DirectReceiptUpdateRequest request);
	/**
	 * 
	 * @description一键收货  不含TCC
	 * @author gaoyun.shen
	 * @date: 2018年4月27日 下午2:37:37
	 * @param 
	 * @return
	 */
	public DirectReceiptUpdateResponse updateDirectReceiptWithNoTransaction(DirectReceiptUpdateRequest request);
	//收货完成
	public ReceiptFinishRsponse finishReceipt(ReceiptFinishRequest request);

    //取门店有库存最高批次价格，用于直送、直通供应商退货
	public ShopHaveInventoryMaxBatchPriceGetResponse getShopHaveInventoryMaxBatchPrice(ShopHaveInventoryMaxBatchPriceGetRequest request);
	
	/**
	 * @Description:收货完成收尾:1.更新采购履行数量,更新采购单完成;2.产生内部差异单3.更新验收单完成
	 * @Auther hank
	 * @Date 2018-4-16
	 * @param request{subUnitNumId,reservedNo,userNumId,internalSign}
	 * @return response{code,message}
	 */	
	public UpdateReceiptAccountFinishResponse finishUpdateReceiptAccount(UpdateReceiptAccountFinishRequest request);
	/**
	 * 
	 * @description
	 * @author gaoyun.shen
	 * @date: 2018年7月11日 下午5:24:36
	 * @param 
	 * @return 顺序消息收货完成操作
	 */
	public UpdateReceiptAccountFinishResponse finishUpdateReceiptAccountWithOrderFlowMessage(UpdateReceiptAccountFinishRequest request);
	
	/**
	 *@Description: 6位模糊查询负出库单 
	 *@Auther hank
	 *@Date 2018-4-19
	 *@param request{subUnitNumId,reservedNo}
	 *@return response{code,message,reservedNo,traySerlno,traySerlnoLable}
	 */
	public ReverseShipHdrFuzzyGetResponse getReverseShipHdrFuzzy(ReverseShipHdrFuzzyGetRequest request);

	//保存验收单/负出库单到单号引用表中
	public ReturnCiteDtlSaveResponse saveReturnCiteDtl(ReturnCiteDtlSaveRequest request);

	//从单号引用表中删除验收单和负出库单
	public ReturnCiteDtlByCiteProductDeleteResponse deleteReturnCiteDtlByCiteProduct(ReturnCiteDtlByCiteProductDeleteRequest request);

	//退供应商引用负出库单和验收单核销
	public CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffResponse writeoffCiteQtyForAuditApprovalReturnOrderByBuyer(CiteQtyForAuditApprovalReturnOrderByBuyerWriteoffRequest request);
	
	//发送补货在途数量入账及短收重新产生直通分拨单消息
	public MessageForDepositInTransitAndRegenerateDirectWaySoSendRespnse sendMessageForDepositInTransitAndRegenerateDirectWaySo(
		MessageForDepositInTransitAndRegenerateDirectWaySoSendReuqest request);	

	//查询引用明细表体
	public CountDtlForReturnCiteDtlGetResponse getCountDtlForReturnCiteDtl(CountDtlForReturnCiteDtlGetRequest request);

	/**
	 * 
	 * @description 验收入库根据条码获取商品信息
	 * @author gaoyun.shen
	 * @date: 2018年5月11日 下午2:39:20
	 * @param 
	 * @return
	 */
	public ProductByBarcodeForReceiptGetResponse getProductByBarcode(ProductByBarcodeForReceiptGetRequest  productByBarcodeGetRequest);
	/**
	 *
	 * @description  使用顺序消息测试收货完成接口
	 * @author gaoyun.shen
	 * @date: 2018年5月14日 上午10:52:19
	 * @param
	 * @return
	 */
	public ReceiptFinishRsponse finishReceiptWithOrderFlowMessage(ReceiptFinishRequest request);

    //验收入库获取可结算数据
    public ReciptListForGenerateBalanceGetResponse getReciptListForGenerateBalance(ReciptListForGenerateBalanceGetRequest request);
    //修改验收入库批次表体状态
    public ReceiptBatchDtlStatusNumIdUpdateResponse updateReceiptBatchDtlStatusNumId(ReceiptBatchDtlStatusNumIdUpdateRequest request);
    //修改验收入库表头状态
	public ReceiptHdrAndBatchDtlStatusNumIdUpdateResponse updateReceiptHdrAndBatchDtlStatusNumId(ReceiptHdrAndBatchDtlStatusNumIdUpdateRequest request);
	//根据验收入库批次行号
    public SupBlanceDtlByReceiptBatchDtlSeriesGetResponse getSupBlanceDtlByReceiptBatchDtlSeries(SupBlanceDtlByReceiptBatchDtlSeriesGetRequest request);
    //查询行号等信息
    public ReceiptBatchDtlSeriesForRegenerateReceiptGetResponse getReceiptBatchDtlSeriesForRegenerateReceipt(ReceiptBatchDtlSeriesForRegenerateReceiptGetRequest request);
    //购销没有结算的供应商
    public SupplyUnitNumIdForPurchaseSaleGetResponse getSupplyUnitNumIdForPurchaseSale(SupplyUnitNumIdForPurchaseSaleGetRequest request);

	public ProductByBarcodeForShipGetResponse getProductByBarcodeForShip(ProductByBarcodeForShipGetRequest request);

    //回写验收单的凭证单号
    public VoucherNumIdByReservedNoUpdateResponse updateVoucherNumIdByReservedNo(VoucherNumIdByReservedNoUpdateRequest request);

	/**
	 * 统计验收成本
	 * @author henry.wang
	 *
	 * @param request
	 * @return
	 */
	BusinessAmountForGenKxCountResponse countReceiptCost(BusinessAmountForGenKxCountRequest request);

	 /**
	  * @author alfred.liu
	  * @date 2018/6/27 10:29
	  * @description 获取验收入库单汇总
	  */
	public CollectReceiptGainResponse gainCollectReceipt(CollectReceiptGainRequest request);

	 /**
	  * @author alfred.liu
	  * @date 2018/6/27 15:43
	  * @description 获取用户指定验收单据
	  */
	public ReciptListForAppointGenerateBalanceGetResponse getReciptListForAppointGenerateBalance(
			RecipteListForAppointGenerateBalanceGetRequest request);

	 /**
	  * @author alfred.liu
	  * @date 2018/6/28 10:29
	  * @description 获取指定未结算入库验收单汇总
	  */
	public CollectReceiptGainAppointResponse gainAppointCollectReceipt(CollectReceiptGainAppointRequest request);
	 /**
	  * @author alfred.liu
	  * @date 2018/7/3 19:13
	  * @description 获取可能需要结算的入库验收单的供应商
	  */
	public PossibleSupBalanceReceiptResponse gainPossibleSupBalanceReceipt(PossibleSupBalanceReceiptRequest request);
}
