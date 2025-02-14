package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询阿里车的车辆信息
 *
 * @author auto create
 * @since 1.0, 2019-09-24 21:08:56
 */
public class AliosOpenAutoInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4252273511796466257L;

	/**
	 * 设备token
	 */
	@ApiField("device_token")
	private String deviceToken;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceToken() {
		return this.deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
