package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建构建任务
 *
 * @author auto create
 * @since 1.0, 2019-09-20 22:22:31
 */
public class AlipayOpenMiniInnerversionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1125828923985791251L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * IDE开发打包类型
	 */
	@ApiField("build_app_type")
	private String buildAppType;

	/**
	 * 扩展信息
	 */
	@ApiField("build_extra_info")
	private String buildExtraInfo;

	/**
	 * js api 权限文件
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 主入口
	 */
	@ApiField("build_main_url")
	private String buildMainUrl;

	/**
	 * 最大Android客户端版本号
	 */
	@ApiField("build_max_android_client_version")
	private String buildMaxAndroidClientVersion;

	/**
	 * 最大iOS客户单版本号
	 */
	@ApiField("build_max_ios_client_version")
	private String buildMaxIosClientVersion;

	/**
	 * 最小Android客户端版本号
	 */
	@ApiField("build_min_android_client_version")
	private String buildMinAndroidClientVersion;

	/**
	 * 最小iOS客户单版本号
	 */
	@ApiField("build_min_ios_client_version")
	private String buildMinIosClientVersion;

	/**
	 * 源码包MD5
	 */
	@ApiField("build_package_md_5")
	private String buildPackageMd5;

	/**
	 * 包名称
	 */
	@ApiField("build_package_name")
	private String buildPackageName;

	/**
	 * 小程序源码包
	 */
	@ApiField("build_package_stream")
	private String buildPackageStream;

	/**
	 * 打包平台扩展信息
	 */
	@ApiField("build_qcloud_info")
	private String buildQcloudInfo;

	/**
	 * 源码包大小
	 */
	@ApiField("build_source_pkg_size")
	private String buildSourcePkgSize;

	/**
	 * 源码包地址
	 */
	@ApiField("build_source_pkg_url")
	private String buildSourcePkgUrl;

	/**
	 * 子入口
	 */
	@ApiField("build_sub_url")
	private String buildSubUrl;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 多端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 上传调试版的接入租户类型。
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序代码中引用的插件列表，包含插件id和插件版本信息
	 */
	@ApiListField("plugin_refs")
	@ApiField("mini_app_plugin_reference")
	private List<MiniAppPluginReference> pluginRefs;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBuildAppType() {
		return this.buildAppType;
	}
	public void setBuildAppType(String buildAppType) {
		this.buildAppType = buildAppType;
	}

	public String getBuildExtraInfo() {
		return this.buildExtraInfo;
	}
	public void setBuildExtraInfo(String buildExtraInfo) {
		this.buildExtraInfo = buildExtraInfo;
	}

	public String getBuildJsPermission() {
		return this.buildJsPermission;
	}
	public void setBuildJsPermission(String buildJsPermission) {
		this.buildJsPermission = buildJsPermission;
	}

	public String getBuildMainUrl() {
		return this.buildMainUrl;
	}
	public void setBuildMainUrl(String buildMainUrl) {
		this.buildMainUrl = buildMainUrl;
	}

	public String getBuildMaxAndroidClientVersion() {
		return this.buildMaxAndroidClientVersion;
	}
	public void setBuildMaxAndroidClientVersion(String buildMaxAndroidClientVersion) {
		this.buildMaxAndroidClientVersion = buildMaxAndroidClientVersion;
	}

	public String getBuildMaxIosClientVersion() {
		return this.buildMaxIosClientVersion;
	}
	public void setBuildMaxIosClientVersion(String buildMaxIosClientVersion) {
		this.buildMaxIosClientVersion = buildMaxIosClientVersion;
	}

	public String getBuildMinAndroidClientVersion() {
		return this.buildMinAndroidClientVersion;
	}
	public void setBuildMinAndroidClientVersion(String buildMinAndroidClientVersion) {
		this.buildMinAndroidClientVersion = buildMinAndroidClientVersion;
	}

	public String getBuildMinIosClientVersion() {
		return this.buildMinIosClientVersion;
	}
	public void setBuildMinIosClientVersion(String buildMinIosClientVersion) {
		this.buildMinIosClientVersion = buildMinIosClientVersion;
	}

	public String getBuildPackageMd5() {
		return this.buildPackageMd5;
	}
	public void setBuildPackageMd5(String buildPackageMd5) {
		this.buildPackageMd5 = buildPackageMd5;
	}

	public String getBuildPackageName() {
		return this.buildPackageName;
	}
	public void setBuildPackageName(String buildPackageName) {
		this.buildPackageName = buildPackageName;
	}

	public String getBuildPackageStream() {
		return this.buildPackageStream;
	}
	public void setBuildPackageStream(String buildPackageStream) {
		this.buildPackageStream = buildPackageStream;
	}

	public String getBuildQcloudInfo() {
		return this.buildQcloudInfo;
	}
	public void setBuildQcloudInfo(String buildQcloudInfo) {
		this.buildQcloudInfo = buildQcloudInfo;
	}

	public String getBuildSourcePkgSize() {
		return this.buildSourcePkgSize;
	}
	public void setBuildSourcePkgSize(String buildSourcePkgSize) {
		this.buildSourcePkgSize = buildSourcePkgSize;
	}

	public String getBuildSourcePkgUrl() {
		return this.buildSourcePkgUrl;
	}
	public void setBuildSourcePkgUrl(String buildSourcePkgUrl) {
		this.buildSourcePkgUrl = buildSourcePkgUrl;
	}

	public String getBuildSubUrl() {
		return this.buildSubUrl;
	}
	public void setBuildSubUrl(String buildSubUrl) {
		this.buildSubUrl = buildSubUrl;
	}

	public String getBuildVersion() {
		return this.buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getClientType() {
		return this.clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public List<MiniAppPluginReference> getPluginRefs() {
		return this.pluginRefs;
	}
	public void setPluginRefs(List<MiniAppPluginReference> pluginRefs) {
		this.pluginRefs = pluginRefs;
	}

}
