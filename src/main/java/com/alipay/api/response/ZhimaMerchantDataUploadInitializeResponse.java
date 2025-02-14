package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.data.upload.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaMerchantDataUploadInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4269435262849995292L;

	/** 
	 * 行业模板
	 */
	@ApiField("template_url")
	private String templateUrl;

	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}
	public String getTemplateUrl( ) {
		return this.templateUrl;
	}

}
