package com.ykcloud.soa.erp.api.so.service;

import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlNotBalanceCountGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyDtlStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyHdrStatusNumIdUpdateRequest;
import com.ykcloud.soa.erp.api.so.request.ItemSellDailyListForGenerateBalanceGetRequest;
import com.ykcloud.soa.erp.api.so.request.SdBlSoTmlItemSellDailyRequest;
import com.ykcloud.soa.erp.api.so.request.SupBlanceDtlByItemSellDailyDtlSeriesGetRequest;
import com.ykcloud.soa.erp.api.so.request.SupplyUnitNumIdForJointSaleGetRequest;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlNotBalanceCountGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyDtlStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyHdrStatusNumIdUpdateResponse;
import com.ykcloud.soa.erp.api.so.response.ItemSellDailyListForGenerateBalanceGetResponse;
import com.ykcloud.soa.erp.api.so.response.SdBlSoTmlItemSellDailyResponse;
import com.ykcloud.soa.erp.api.so.response.SupBlanceDtlByItemSellDailyDtlSeriesGetResponse;
import com.ykcloud.soa.erp.api.so.response.SupplyUnitNumIdForJointSaleGetResponse;

import java.util.List;

/**
 * @author:shenq
 * @description:销售出库日报Service
 * @date :2018/4/23 - 10:01
 * @version:v1.0
 */
public interface SdBlSoTmlItemSellDailyService {



    /**
     * 根据销售小票生成销售出库日报
     * @author shenq
     * @param request
     * @return
     */
    public SdBlSoTmlItemSellDailyResponse generateSalesDaily(SdBlSoTmlItemSellDailyRequest request);




    /**
     * 根据销售门店编号&&销售日期获取销售日报
     * @author shenq
     * @param request
     * @return
     */
    public SdBlSoTmlItemSellDailyResponse getItemSellDaily(SdBlSoTmlItemSellDailyRequest request);
    public ItemSellDailyListForGenerateBalanceGetResponse getItemSellDailyListForGenerateBalance(ItemSellDailyListForGenerateBalanceGetRequest request);

    public ItemSellDailyDtlStatusNumIdUpdateResponse updateItemSellDailyDtlStatusNumId(ItemSellDailyDtlStatusNumIdUpdateRequest request);
    public ItemSellDailyHdrStatusNumIdUpdateResponse updateItemSellDailyHdrStatusNumId(ItemSellDailyHdrStatusNumIdUpdateRequest request);
    public SupBlanceDtlByItemSellDailyDtlSeriesGetResponse getSupBlanceDtlByItemSellDailyDtlSeries(SupBlanceDtlByItemSellDailyDtlSeriesGetRequest request);
    public ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetResponse getItemSellDailyDtlSeriesForRegenerateItemSellDaily(ItemSellDailyDtlSeriesForRegenerateItemSellDailyGetRequest request);
    public ItemSellDailyDtlNotBalanceCountGetResponse getItemSellDailyDtlNotBalanceCount(ItemSellDailyDtlNotBalanceCountGetRequest request);
    public SupplyUnitNumIdForJointSaleGetResponse getSupplyUnitNumIdForJointSale(SupplyUnitNumIdForJointSaleGetRequest request);
}
