package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝社交邀请好友进群
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:26
 */
public class AlipaySocialBaseChatGinvSendModel extends AlipayObject {

	private static final long serialVersionUID = 2331681562619451447L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 邀请的好友id列表，最多50人
	 */
	@ApiListField("uids")
	@ApiField("string")
	private List<String> uids;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<String> getUids() {
		return this.uids;
	}
	public void setUids(List<String> uids) {
		this.uids = uids;
	}

}
