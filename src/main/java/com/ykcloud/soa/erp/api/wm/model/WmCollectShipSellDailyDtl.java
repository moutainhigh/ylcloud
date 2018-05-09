package com.ykcloud.soa.erp.api.wm.model;

import java.io.Serializable;

/**
 * @author:shenq
 * @description:销售日报
 * @date :2018/5/7 - 16:46
 * @version:v1.0
 */
public class WmCollectShipSellDailyDtl implements Serializable {

    /**
     * 商品编号
     */
    private Long itemNumId;

    /**
     * 物理仓库
     */
    private Long physicalNumId;

    /**
     * 产地编号
     */
    private Long productOriginNumId;

    /**
     * 结算方式
     */
    private Long settmentType;

    /**
     * 销售金额
     */
    private Double sellAmount;

    /**
     * 销售成本
     */
    private Double costAmount;

    /**
     * 内部销售金额
     */
    private Double inSellAmount;

    /**
     * 销售成本1
     */
    private Double sellCost1;

    /**
     * 内部销售成本
     */
    private Double inSellCost;

    /**
     * 不含销售期末成本
     */
    private Double noSellFinalCost;

    /**
     * 期末成本
     */
    private Double finalCost;

    /**
     * 销售毛利
     */
    private Double saleGrossProfit;

    /**
     * 件数
     */
    private Double conversionQty;

    /**
     * 数量
     */
    private Double qty;

    /**
     * 销售数量
     */
    private Double sellQty;

    /**
     * 销售税金
     */
    private Double sellTaxAmonut;

    /**
     * 期末数量
     */
    private Double finalQty;

    public Long getItemNumId() {
        return itemNumId;
    }

    public void setItemNumId(Long itemNumId) {
        this.itemNumId = itemNumId;
    }

    public Long getPhysicalNumId() {
        return physicalNumId;
    }

    public void setPhysicalNumId(Long physicalNumId) {
        this.physicalNumId = physicalNumId;
    }

    public Long getProductOriginNumId() {
        return productOriginNumId;
    }

    public void setProductOriginNumId(Long productOriginNumId) {
        this.productOriginNumId = productOriginNumId;
    }

    public Long getSettmentType() {
        return settmentType;
    }

    public void setSettmentType(Long settmentType) {
        this.settmentType = settmentType;
    }

    public Double getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(Double sellAmount) {
        this.sellAmount = sellAmount;
    }

    public Double getInSellAmount() {
        return inSellAmount;
    }

    public void setInSellAmount(Double inSellAmount) {
        this.inSellAmount = inSellAmount;
    }

    public Double getSellCost1() {
        return sellCost1;
    }

    public void setSellCost1(Double sellCost1) {
        this.sellCost1 = sellCost1;
    }

    public Double getInSellCost() {
        return inSellCost;
    }

    public void setInSellCost(Double inSellCost) {
        this.inSellCost = inSellCost;
    }

    public Double getNoSellFinalCost() {
        return noSellFinalCost;
    }

    public void setNoSellFinalCost(Double noSellFinalCost) {
        this.noSellFinalCost = noSellFinalCost;
    }

    public Double getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(Double finalCost) {
        this.finalCost = finalCost;
    }

    public Double getSaleGrossProfit() {
        return saleGrossProfit;
    }

    public void setSaleGrossProfit(Double saleGrossProfit) {
        this.saleGrossProfit = saleGrossProfit;
    }

    public Double getConversionQty() {
        return conversionQty;
    }

    public void setConversionQty(Double conversionQty) {
        this.conversionQty = conversionQty;
    }

    public Double getSellQty() {
        return sellQty;
    }

    public void setSellQty(Double sellQty) {
        this.sellQty = sellQty;
    }

    public Double getSellTaxAmonut() {
        return sellTaxAmonut;
    }

    public void setSellTaxAmonut(Double sellTaxAmonut) {
        this.sellTaxAmonut = sellTaxAmonut;
    }

    public Double getFinalQty() {
        return finalQty;
    }

    public void setFinalQty(Double finalQty) {
        this.finalQty = finalQty;
    }
}
