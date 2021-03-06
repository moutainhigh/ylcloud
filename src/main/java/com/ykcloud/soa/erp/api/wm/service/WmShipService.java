package com.ykcloud.soa.erp.api.wm.service;

import com.ykcloud.soa.erp.api.wm.request.*;
import com.ykcloud.soa.erp.api.wm.response.*;


public interface WmShipService {

		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 后六位模糊查询波次号,只查出status=2的号
		 */
		public WmWlBcHdrGetResponse getWlbcHdr(WmWlBcHdrGetRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 扫描商品条码
		 */
		public WmDataByBarcodeGetResponse getWlbcProductByBarcode(WmDataByBarcodeGetRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 创建出库托盘
		 */
		public WmContainerHdrCreateResponse createShipContainer(WmContainerHdrCreateRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 查询出库装箱单(soNumId,containerSerlno)
		 */
		public WmQuerySoAndContainerResponse getShipContainer(WmQuerySoAndContainerRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 播种动作更新订单数据
		 */
		public WmShipDtlWithNoBatchUpdateResponse  updateShipPacking(WmShipDtlWithNoBatchUpdateRequest request);
		
		//public void updateShipContainerDtlWithNoBatch(Long tenantNumId, Long dataSign, Long subUnitNumId, Date orderDate, Double bzNum, SoHdr soHdr, SoDtl soDtl,Long containerSerlno);
		
		//public void updateShipContainerLab(Long tenantNumId,Long dataSign,Long subUnitNumId,Date orderDate,Double bzNum,Long containerSerlno,Long solineId,Long cancelSign);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 装箱完成
		 */
		public WmFinishShipContainerHdrResponse finishShipContainer(WmFinishShipContainerHdrRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 播种完成
		 */
		public WmFinishSoPackingResponse finishWlbcPacking(WmFinishSoPackingRequest requst);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 模糊查询订单号，如果该订单没有波次号，那么自动生成该波次
		 */
		public WmSoHdrGetResponse getShipSo(WmSoHdrGetRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 装箱复核扫描条码获取订单信息
		 */
		public WmDataGetDataByBarcodeAndSoNumIdResponse getShipSoProductByBarcode(WmDataGetDataByBarcodeAndSoNumIdRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 订单装箱完成
		 */
		public WmfinishPackingResponse finishSoPacking(WmfinishPackingRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 创建波次单头
		 */
		public WmWlbcHdrCreateResponse createWlbc(WmWlbcHdrCreateRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 创建波次单头没有事务
		 */
		public WmWlbcHdrCreateResponse createWlbcWithNoTransaction(WmWlbcHdrCreateRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 获取交接单号,并扫入该装箱
		 */
		public WmShipGetResponse createShipByContainer(WmShipGetRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 扫装箱单
		 */
		public WmScanShipContainerHdrResponse scanShipContainer(WmScanShipContainerRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 出库完成
		 */
		public WmShipFinishResponse finishShip(WmShipFinishRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 出库完成
		 */
		public WmShipFinishResponse finishShipOrderMessage(WmShipFinishRequest request);
        
		/** 
		* @Description: 行政领料退回，生成负的出库单
		* @Author: fred.zhao
		* @Date: 2018/4/12  
		*/ 
		public ShipForMaterialIssueBackGenerateResponse generateShipForMaterialIssueBack(ShipForMaterialIssueBackGenerateRequest request);
		
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description so订单出库
		 */
		public SoShipFinishResponse finishSoShip(SoShipFinishRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 发送库存处理消息TCC,服务
		 */
		public ShipBusinessAccountProcessResponse processShipBusinessAccount(ShipBusinessAccountProcessRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 发送财务处理消息TCC
		 */
		public ShipFiAccountProcessResponse processShipFiAccount(ShipFiAccountProcessRequest request);
		
		
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description so订单出库顺序消息
		 */
		public SoShipFinishResponse finishSoShipOrderMessage(SoShipFinishRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 出库可用帐顺序消息
		 */
		public AffectRowsResponse shipStkAccount(WmProcessAccountRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 出库物理仓库存处理顺序消息
		 */
		public AffectRowsResponse shipPhysicalAccount(WmProcessAccountRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 出库财务帐处理顺序消息
		 */
		public AffectRowsResponse shipFinanceAccount(WmProcessAccountRequest request);
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 出库完成顺序消息
		 */
		public SoFinishResponse soFinish(SoFinishRequest request);
		
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 产生验收单
		 */
		public ReceiptBudCreateResponse createReceiptBud(ReceiptBudCreateRequest request);
		/**
		 * 
		 * @description  反配、行政领料退库收货更新数量
		 * @author gaoyun.shen
		 * @date: 2018年4月18日 下午4:01:20
		 * @param 
		 * @return
		 */
		public ReverseReceiptDtlUpdateReponse updateReverseReceiptDtl(ReverseReceiptDtlUpdateRequest request);
		/**
		 * 
		 * @description 反配、行政领料退库收货完成
		 * @author gaoyun.shen
		 * @date: 2018年4月19日 下午5:50:18
		 * @param 
		 * @return
		 */
		public ReverseReceiptFinishResponse finishReverseShipReceipt(ReverseReceiptFinishRequest request);
		/**
		 * 
		 * @description 反配、行政领料退库收货完成
		 * @author gaoyun.shen
		 * @date: 2018年4月19日 下午5:50:18
		 * @param 
		 * @return
		 */
		public ReverseReceiptFinishResponse finishReverseShipReceiptWithOrderFlowMessage(ReverseReceiptFinishRequest request);
		
		/**
		 * 
		 * @description
		 * @author gaoyun.shen
		 * @date: 2018年7月11日 下午9:58:35
		 * @param 
		 * @return  财务入账成功后，更新负出库单状态为2
		 */
		public ReverseReceiptFinishResponse finishReverseShipReceiptAfterFinance(ReverseReceiptFinishRequest request);
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 出库反配产生验收单(通过反配托盘)
		 */
		public ReverseReceiptCreateByContainerRespone createReverseReceiptHdr(ReverseReceiptCreateByContainerRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 装箱单关联验收单(将验收单号关联到containerHdr中的出库单号)
		 */
		public ReverseScanContainerResponse scanContainerForReverse(ReverseScanContainerRequest request);
		
		
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 反配出库确认顺序消息
		 */
		public ReverseShipFinishResponse finishReverseShipOrderMessage(ReverseShipFinishRequest request);
		
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 入库可用帐顺序消息
		 */
		public AffectRowsResponse receiptStkAccount(WmProcessAccountRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 入库物理仓库存处理顺序消息
		 */
		public AffectRowsResponse receiptPhysicalAccount(WmProcessAccountRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月2日
		 * @description 入库财务帐处理顺序消息
		 */
		public AffectRowsResponse receiptFinanceAccount(WmProcessAccountRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年7月3日
		 * @description 反配出库出库完成顺序消息
		 */
		public ReverseReceiptFlowMessageResopnse reverseReceiptFlowMessage(ReverseReceiptFlowMessageRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 反配出库确认
		 */
		public ReverseShipFinishResponse finishReverseShip(ReverseShipFinishRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 出库反配库存处理TCC服务
		 */
		public ReverseShipBusinessAccountProcessResponse reverseShipBusinessAccountProcess(ReverseShipBusinessAccountProcessRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月20日
		 * @description 出库反配财务账处理消息TCC
		 */
		public ReverseReceiptFiAccountProcessResponse reverseShipFiAccountProcess(ReverseShipFiAccountProcessRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月23日
		 * @description 产生分拨单
		 */
		public WmCreateDistributionWithShipResponse createDistributionWithShip(WmCreateDistributionWithShipRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月24日
		 * @description RF一键出库
		 */
		public WmFinishDirectSoShipResponse finishDirectSoShip(WmFinishDirectSoShipRequest request);

		/**
		 * 
		 * @author Dan
		 * @date 2018年4月26日
		 * @description RF一键出库没有tcc
		 */
		public WmFinishDirectSoShipResponse finishDirectSoShipWithNoTransaction(WmFinishDirectSoShipRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月27日
		 * @description 反配so出库
		 */
		public WmFinishReserverSoShipRespose finishReserverSoShip(WmFinishReserverSoShipRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年4月27日
		 * @description 反配so出库顺序消息
		 */
		public WmFinishReserverSoShipRespose finishReserverSoShipOrderMessage(WmFinishReserverSoShipRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年5月2日
		 * @description so集合绑定wlbc，不同的storageNumId要创建不同的wlbc并绑定
		 */
		public WmSoListBingWlbcResponse bingSoListWlbc(WmSoListBingWlbcRequest request);

		 /**
		 * @author alfred
		 * @date 2018/5/4 17:48
		 * @description wm根据托盘标记获取托盘必需是封箱状态（status_num_id = 2）
		 */
		public WmBlShipContainerHrdResponse getContainerWithStatus(WmBlShipContainerHrdRequest request);

		 /**
		  * @author alfred
		  * @date 2018/5/5 9:55
		  * @description 扫描条形码获取对应商品托盘信息
		  */
		public WmBlContainerDtlResponse getContainerDtlByItem(WmBlContainerDtlRequest request);

		 /**
		  * @author alfred
		  * @date 2018/5/5 10:13
		  * @description 更新托盘复核状态为复核完成
		  */
		public WmShipDtlScanStatusResponse updateContainerHdrStatus(WmShipDtlScanStatusRequest request);
		
		/**
		 * 
		 * @author Dan
		 * @date 2018年5月31日
		 * @description调拨产生空转单
		 */
		public void createShipReserved(Long tenantNumId, Long dataSign, Long subUnitNumId, String reservedNo, Long userNumId ,Double flag);


	/**
	 * @Description: 查询未结算或部分结算的跨子公司的购销商品出库单涉及到的客户id集合，用于生成购销客户结算单
	 * @author: henry.wang
	 * @date: 2018/6/1 13:47
	 **/
	CustInfosForGenerateCustBalanceBlFindResponse findCustInfosForGenerateCustBalanceBl(
		CustInfosForGenerateCustBalanceBlFindRequest request);

	/**
	 * @Description: 查询出库单数据，用于生成购销客户结算单
	 * @author: henry.wang
	 * @date: 2018/6/1 13:52
	 **/
	ShipInfosForGenerateCustBalanceBlFindResponse findShipInfosForGenerateCustBalanceBl(
		ShipInfosForGenerateCustBalanceBlFindRequest request);
	
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年6月5日
	 * @description获取托盘明细
	 */
	ContainerDtlGetByContainerSerlnoResponse getContainerDtlByContainerSerlno(ContainerDtlGetByContainerSerlnoRequest request);
	
	/**
	 * 
	 * @author Dan
	 * @date 2018年6月5日
	 * @description获取交接单明细
	 */
	ShipDtlGetByReservedResponse getShipDtlByReserved(ShipDtlGetByReservedRequest request);

	/**
	 * @Description: 生成购销客户结算单后，回写出库单状态=7
	 * @author: henry.wang
	 * @date: 2018/6/12 10:03
	 **/
	StatusForGenerateCustBalanceUpdateResponse updateStatusForGenerateCustBalance(StatusForGenerateCustBalanceUpdateRequest request);
}
