package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FriendListVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.relation.friends.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-03 10:55:41
 */
public class AlipaySocialBaseRelationFriendsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5182687959566278659L;

	/** 
	 * 好友列表数据
	 */
	@ApiListField("friend_list")
	@ApiField("friend_list_v_o")
	private List<FriendListVO> friendList;

	public void setFriendList(List<FriendListVO> friendList) {
		this.friendList = friendList;
	}
	public List<FriendListVO> getFriendList( ) {
		return this.friendList;
	}

}
