package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子身份证查询用户身份信息
 *
 * @author auto create
 * @since 1.0, 2018-08-22 14:24:50
 */
public class AlipayUserElectronicidUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1481571459866653975L;

	/**
	 * 用户码码串
	 */
	@ApiField("barcode")
	private String barcode;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}
