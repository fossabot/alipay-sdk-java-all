package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前台类目删除
 *
 * @author auto create
 * @since 1.0, 2019-09-06 14:21:24
 */
public class AntMerchantExpandFrontcategorySecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2397291415496259615L;

	/**
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

}
