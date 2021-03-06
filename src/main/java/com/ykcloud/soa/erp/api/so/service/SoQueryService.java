package com.ykcloud.soa.erp.api.so.service;

import java.util.List;

import com.ykcloud.soa.erp.api.so.model.SdBlSoDtl;
import com.ykcloud.soa.erp.api.so.model.SoBlSoHdr;
import com.ykcloud.soa.erp.api.so.request.CountSoTmlGetRequest;
import com.ykcloud.soa.erp.api.so.request.DemandSaleStatisticGetRequest;
import com.ykcloud.soa.erp.api.so.request.GroupSdApplyDtlGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSaleInfoByItemNumIdAndOrderDateGetRequest;
import com.ykcloud.soa.erp.api.so.request.OrdSubUnitNumIdsBySoNumIdForInTransitDepositGetRequest;
import com.ykcloud.soa.erp.api.so.request.ProductFullDetailAndSaleStatisticGetRequest;
import com.ykcloud.soa.erp.api.so.request.ReturnApplyDtlGetRequest;
import com.ykcloud.soa.erp.api.so.request.ShopProductDailySellQtyGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoBySoNumIdAndItemNumIdGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdRequest;
import com.ykcloud.soa.erp.api.so.request.SoDtlsForInTransitDepositGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrForGetWlbcProductByBarcodeGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrListGetBySoNumIdsRequest;
import com.ykcloud.soa.erp.api.so.request.SoHdrListGetByWlbcRequest;
import com.ykcloud.soa.erp.api.so.request.SoNumIdsByReceiptNoForInTransitDepositGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoSettlementTypeGetRequest;
import com.ykcloud.soa.erp.api.so.request.SoStatusOfWlbcRequest;
import com.ykcloud.soa.erp.api.so.request.SoTmlLimitGetRequest;
import com.ykcloud.soa.erp.api.so.request.SupplyToReturnAmoutGetRequest;
import com.ykcloud.soa.erp.api.so.response.CountSoTmlHdrGetResponse;
import com.ykcloud.soa.erp.api.so.response.DemandSaleStatisticGetResponse;
import com.ykcloud.soa.erp.api.so.response.GroupSdApplyDtlGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSaleInfoByItemNumIdAndOrderDateGetResponse;
import com.ykcloud.soa.erp.api.so.response.OrdSubUnitNumIdsBySoNumIdForInTransitDepositGetResponse;
import com.ykcloud.soa.erp.api.so.response.ProductFullDetailAndSaleStatisticGetResponse;
import com.ykcloud.soa.erp.api.so.response.ReturnApplyDtlGetResponse;
import com.ykcloud.soa.erp.api.so.response.ShopProductDailySellQtyGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoBySoNumIdAndItemNumIdGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdReponse;
import com.ykcloud.soa.erp.api.so.response.SoDtlsForInTransitDepositGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrForGetWlbcProductByBarcodeGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrListGetBySoNumIdsResponse;
import com.ykcloud.soa.erp.api.so.response.SoHdrListGetByWlbcResponse;
import com.ykcloud.soa.erp.api.so.response.SoNumIdsByReceiptNoForInTransitDepositGetResponse;
import com.ykcloud.soa.erp.api.so.response.SoSettlementTypeGetResonse;
import com.ykcloud.soa.erp.api.so.response.SoStatusOfWlbcResponse;
import com.ykcloud.soa.erp.api.so.response.SoTmlHdrLimitGetResponse;
import com.ykcloud.soa.erp.api.so.response.SupplyToReturnAmoutGetResponse;
import com.ykcloud.soa.erp.api.wm.request.SoLockQtyByWlbcRequest;
import com.ykcloud.soa.erp.api.wm.request.UsableInventoryByReservedNoGetRequest;
import com.ykcloud.soa.erp.api.wm.response.SoLockQtyByWlbcResponse;


//查询分仓在途数的接口,以及查询销售的信息
public interface SoQueryService {
	
	
    //获得商品销售方面的信息
    public DemandSaleStatisticGetResponse getDemandSaleStatistic(DemandSaleStatisticGetRequest request);
   
    
    
  //通过WLbc号与商品ID获取so_dtl随机一条，一半这边用limit
  	public SoHdrForGetWlbcProductByBarcodeGetResponse getSoHdrForGetWlbcProductByBarcode(SoHdrForGetWlbcProductByBarcodeGetRequest request);
  	
  //通过soNumId,itemNumId获取该订单明细的需求数量已经已播数量(可以不传itemNumId)
  	public SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdReponse getSoDtlQtyAndPackingQtyBySoNumIdAndItemId(SoDtlQtyAndPackingQtyGetBySoNumIdAndItemIdRequest request);
  //根据订单号查询订单号头信息
  	public SoHdrGetResponse getSoHdrBySoNumId(SoHdrGetRequest request);
  	
  	 //根据订单号查询订单号头信息
  	public SoHdrGetResponse getSoHdrBySoNumIdFuzzy(SoHdrGetRequest request);
  	
  	
  	
  	/**
     * 通过订单号与商品号，查询订单明细
     * @param request
     * @return
     */
  	public SoBySoNumIdAndItemNumIdGetResponse getSoDtlBySoNumIdAndItemNumId(SoBySoNumIdAndItemNumIdGetRequest request);

    //获取退货申请单分组数据
    public GroupSdApplyDtlGetResponse getReturnApplyGroupList(GroupSdApplyDtlGetRequest request);
    //已审未退金额
    public SupplyToReturnAmoutGetResponse getSupplyToReturnAmout(SupplyToReturnAmoutGetRequest request);
    /** 
    * @Description: 获取退货申请单单身数据
    * @Author: fred.zhao
    * @Date: 2018/3/30 
    */ 
    ReturnApplyDtlGetResponse getReturnApplyDtlList(ReturnApplyDtlGetRequest request);
    //日销售门店商品销售数量及促销销售数量统计
    public ShopProductDailySellQtyGetResponse getShopProductDailySellQty(ShopProductDailySellQtyGetRequest request);
	//获取wlbc里所有订单的lockqty
    public SoLockQtyByWlbcResponse getSoLockQtyByWlbc(SoLockQtyByWlbcRequest request);

    //自动补货查询商品销售的相关信息
    public ItemSaleInfoByItemNumIdAndOrderDateGetResponse getItemSaleInfoByItemNumIdAndOrderDate(ItemSaleInfoByItemNumIdAndOrderDateGetRequest request);

    //check一个wlbc号下面所有的订单status是否为8(完全出库)
    public SoStatusOfWlbcResponse checkSoStatusOfWlbc(SoStatusOfWlbcRequest request);
    
    //根据sonumid获取该订单的销售方式，购销，代销，联销
    public SoSettlementTypeGetResonse getSoSettlementType(SoSettlementTypeGetRequest request);

    
	//直通分拨单在途入账,按验收单找分拨订单号列表
	public SoNumIdsByReceiptNoForInTransitDepositGetResponse getSoNumIdsByReceiptNoForInTransitDeposit(
			SoNumIdsByReceiptNoForInTransitDepositGetRequest request);

	//直通分拨单在途入账,按订单编号找及补货门店列表
	public OrdSubUnitNumIdsBySoNumIdForInTransitDepositGetResponse getOrdSubUnitNumIdsBySoNumIdForInTransitDeposit(
			OrdSubUnitNumIdsBySoNumIdForInTransitDepositGetRequest request);
	
	//直通分拨单在途入账,明细列表
	public SoDtlsForInTransitDepositGetResponse getSoDtlsForInTransitDeposit(
			SoDtlsForInTransitDepositGetRequest request);



    //分页查询小票单头
    public SoTmlHdrLimitGetResponse getSoTmlLimit(SoTmlLimitGetRequest request);

    //统计小票单头数据
    public CountSoTmlHdrGetResponse getCountSoTmlGetRequest(CountSoTmlGetRequest request);

    //查询订单单体
    public List<SdBlSoDtl> getSdBlSoHdrAndSdBlSoDtlBysoNumId(UsableInventoryByReservedNoGetRequest request);

    //查询订单单头
    public SoBlSoHdr getSdBlSoHdrBySoNumId(UsableInventoryByReservedNoGetRequest request);

    //根据wlbc号查询该wlbc下的所有订单
    public SoHdrListGetByWlbcResponse getSoHdrListByWlbc(SoHdrListGetByWlbcRequest request);
    //根据soNumId数组获取SoHdrList
    public SoHdrListGetBySoNumIdsResponse getSoHdrListBySoNumIds(SoHdrListGetBySoNumIdsRequest request);
    /**
     * 
     * @description
     * @author gaoyun.shen
     * @date: 2018年7月19日 下午12:06:27
     * @param 
     * @return RF获取商品信息
     */
    public ProductFullDetailAndSaleStatisticGetResponse getProductFullDetailAndSaleStatistic(ProductFullDetailAndSaleStatisticGetRequest request);
}
