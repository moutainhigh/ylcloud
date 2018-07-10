package com.ykcloud.soa.erp.api.scm.service;

import com.ykcloud.soa.erp.api.scm.request.*;

import com.ykcloud.soa.erp.api.scm.response.*;


public interface ScmProductService {
	
	/**
	 * 进价调整单导入
	 * @author tz.x
	 * @date 2018年7月9日下午1:22:12
	 */
	public ChangeCostImportResponse importChangeCost(ChangeCostImportRequest request);
	
	/**
	 * 
	 * @description
	 * @author gaoyun.shen
	 * @date: 2018年6月22日 下午4:27:34
	 * @param 
	 * @return  门店商品销售属性 excel导入
	 */
	public ProductShopResponse importProductShop(ProductShopRequest request);

	//获取供应商品赠品数量
	public GiftQtyByGiftRelationGetResponse getGiftQtyByGiftRelation(GiftQtyByGiftRelationGetRequest request);


	//商品可补货合法性验证
	public ProductForReplenishCheckResponse checkProductForReplenish(ProductForReplenishCheckRequest Request);
	
	//获得商品生鲜类型
	public ProductFdcSignBySupplyNumIdAndPty3NumIdGetResponse getProductFdcSignBySupplyNumIdAndPty3NumId(ProductFdcSignBySupplyNumIdAndPty3NumIdGetRequest request);

	//获取商品采购价
	public ProductPurchasePriceGetResponse getProductPurchasePrice(ProductPurchasePriceGetRequest request);
	
	//采购单号审核
    public ProtocolAuditResponse auditProtocol(ProtocolAuditRequest request);

    //导入
    public  ProtocolImportResponse importProtocol(ProtocolImportRequest request);

    //copy采购协议
	public ProtocolShopCopyResponse copyProtocolShop(ProtocolShopCopyRequest request);
	
	//自动补货参数导入
	public ReplenishProductShopImportResponse importReplenishProductShop(ReplenishProductShopImportRequest request);
}
