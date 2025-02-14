package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.lifeaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-01 10:48:39
 */
public class AlipayOpenPublicLifeaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5787647277227623329L;

	/** 
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

}
