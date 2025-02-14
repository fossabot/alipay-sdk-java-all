package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5合并支付接口2.0
 *
 * @author auto create
 * @since 1.0, 2019-04-01 18:20:25
 */
public class AlipayTradeWapMergePayModel extends AlipayObject {

	private static final long serialVersionUID = 5318646836627535354L;

	/**
	 * 如果预创建成功，支付宝返回该预下单号，后续商户使用该预下单号请求支付宝支付接口
	 */
	@ApiField("pre_order_no")
	private String preOrderNo;

	public String getPreOrderNo() {
		return this.preOrderNo;
	}
	public void setPreOrderNo(String preOrderNo) {
		this.preOrderNo = preOrderNo;
	}

}
