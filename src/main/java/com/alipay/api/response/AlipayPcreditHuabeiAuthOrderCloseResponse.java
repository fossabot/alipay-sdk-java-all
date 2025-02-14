package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-18 10:22:30
 */
public class AlipayPcreditHuabeiAuthOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7458886891596527984L;

	/** 
	 * 支付宝侧花呗冻结解冻操作单据id
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/** 
	 * 商户本次操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}
	public String getAuthOptId( ) {
		return this.authOptId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
