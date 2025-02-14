package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资质
 *
 * @author auto create
 * @since 1.0, 2019-07-25 17:11:12
 */
public class OuterAttachment extends AlipayObject {

	private static final long serialVersionUID = 1253387731637664293L;

	/**
	 * 资质类型：ISV_ICP_LICENCE-代理商营业执照；ICP_LICENCE-营业执照；PORTRAIT_AUTH_LICENSE-肖像授权文件；TRADE_MARK_LICENSE - 商标注册证；SPECIAL_BUSINESS_LICENSE - 特殊行业资质；OTHER_FILE - 其他文件
	 */
	@ApiField("attachment_type")
	private String attachmentType;

	/**
	 * oss key
	 */
	@ApiField("file_key")
	private String fileKey;

	/**
	 * 有效结束日期；格式：YYYY-MM-DD
	 */
	@ApiField("validate_end_time")
	private String validateEndTime;

	/**
	 * 有效开始日期，格式：YYYY-MM-DD
	 */
	@ApiField("validate_start_time")
	private String validateStartTime;

	public String getAttachmentType() {
		return this.attachmentType;
	}
	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	public String getValidateEndTime() {
		return this.validateEndTime;
	}
	public void setValidateEndTime(String validateEndTime) {
		this.validateEndTime = validateEndTime;
	}

	public String getValidateStartTime() {
		return this.validateStartTime;
	}
	public void setValidateStartTime(String validateStartTime) {
		this.validateStartTime = validateStartTime;
	}

}
