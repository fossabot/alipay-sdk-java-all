package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.findata.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-14 11:43:06
 */
public class AlipayFinanceQuotationFindataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2253321123832626152L;

	/** 
	 * 是否投递成功
	 */
	@ApiField("send_result")
	private Boolean sendResult;

	public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}
	public Boolean getSendResult( ) {
		return this.sendResult;
	}

}
