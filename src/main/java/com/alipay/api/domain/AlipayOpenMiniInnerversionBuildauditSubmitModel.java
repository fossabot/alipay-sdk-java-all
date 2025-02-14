package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路小程序构建并提审
 *
 * @author auto create
 * @since 1.0, 2019-11-06 15:18:04
 */
public class AlipayOpenMiniInnerversionBuildauditSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4181925858649159518L;

	/**
	 * 小程序类目，可不传，不传取基础信息中的小程序类目
	 */
	@ApiField("app_category_ids")
	private String appCategoryIds;

	/**
	 * 小程序描述，可不传，不传取基础信息中的小程序描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序在从未上架过版本之前，英文名称是可以修改的，该字段用于在提交审核时候修改小程序英文名称。注意：小程序一旦有过上架版本之后就不可以修改英文名称。
	 */
	@ApiField("app_english_name")
	private String appEnglishName;

	/**
	 * 小程序logo，可不传，不传取基础信息中的小程序logo，请调用专用的logo上传接口上传logo文件，并将返回的地址作为本字段传入
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序在从未上架过版本之前，中文名称是可以修改的，该字段用于在提交审核时候修改小程序中文名称。注意：小程序一旦有过上架版本之后就不可以修改中文名称。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序应用简介，一句话描述小程序功能，如果不填默认采用当前小程序应用简介，10~32个字符
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 构建扩展参数
	 */
	@ApiField("build_ext")
	private String buildExt;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 三方应用ID
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 提审时，选择的所属类目需要校验营业执照，可不传，不传取基础信息中的小程序英文名称
	 */
	@ApiField("license_info")
	private AuditLicenseInfo licenseInfo;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序开发者ID，可不传，不传取基础信息中的小程序开发者ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 服务区域类型,可不传，不传取基础信息中的小程序服务区域类型
	 */
	@ApiField("region_type")
	private String regionType;

	/**
	 * 版本截图，最少2张，最多5张，必传
	 */
	@ApiField("screen_shot_list")
	private String screenShotList;

	/**
	 * 客服电话，可不传，不传取基础信息中的小程序客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 小程序模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板的版本号，如果不填写，则默认用模板当前最新的在架版本
	 */
	@ApiField("template_version")
	private String templateVersion;

	/**
	 * 小程序版本描述，30-500个字符，一个中文占两个字符，一个英文或者数字占一个字符
	 */
	@ApiField("version_desc")
	private String versionDesc;

	public String getAppCategoryIds() {
		return this.appCategoryIds;
	}
	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public String getAppEnglishName() {
		return this.appEnglishName;
	}
	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getAppSlogan() {
		return this.appSlogan;
	}
	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBuildExt() {
		return this.buildExt;
	}
	public void setBuildExt(String buildExt) {
		this.buildExt = buildExt;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public AuditLicenseInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(AuditLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRegionType() {
		return this.regionType;
	}
	public void setRegionType(String regionType) {
		this.regionType = regionType;
	}

	public String getScreenShotList() {
		return this.screenShotList;
	}
	public void setScreenShotList(String screenShotList) {
		this.screenShotList = screenShotList;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getVersionDesc() {
		return this.versionDesc;
	}
	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}

}
