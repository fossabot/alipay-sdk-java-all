package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundCouponWufuCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8524637117957754466L;

	/** 
	 * 领取福卡总数
	 */
	@ApiField("count")
	private Long count;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

}
