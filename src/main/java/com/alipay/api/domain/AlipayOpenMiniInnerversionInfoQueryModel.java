package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路小程序版本信息查询
 *
 * @author auto create
 * @since 1.0, 2019-09-23 10:36:56
 */
public class AlipayOpenMiniInnerversionInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2395711871635877369L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 查询版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
